package com.springvalidaciones.tareavalidaciones.controller;

import com.springvalidaciones.tareavalidaciones.entity.Estudiante;
import com.springvalidaciones.tareavalidaciones.service.EstudianteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/estudiantes")
public class EstudianteController {

    @Autowired
    EstudianteService estudianteService;

    @GetMapping
    public List<Estudiante> listaEstudiantes(){
        return estudianteService.findAll();
    }

    @GetMapping(value = "/buscar por id")
    public Optional<Estudiante> obtenerEstudiante(@RequestParam Long id){
        return estudianteService.findById(id);
    }

    @GetMapping(value = "/buscar por nombre")
    public Optional<Estudiante> nombreEstudiante(@RequestParam String nombre){
        return estudianteService.findByNombre(nombre);
    }

    @PostMapping()
    public void crearEstudiante(@RequestBody Estudiante estudiante){
        estudianteService.crearEstuidante(estudiante);
    }

    @PutMapping(value = "/{id}")
    public void modificarEstudiante(@PathVariable Long id, @RequestBody Estudiante estudiante){
        estudianteService.modificarEstudiante(id, estudiante);
    }

    @DeleteMapping(value = "/{id}")
    public void borrarEstudiante(@PathVariable Long id){
        estudianteService.borrarEstudiante(id);
    }
}
