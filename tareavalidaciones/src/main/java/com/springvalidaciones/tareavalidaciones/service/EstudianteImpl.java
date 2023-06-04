package com.springvalidaciones.tareavalidaciones.service;

import com.springvalidaciones.tareavalidaciones.dao.EstudianteDao;
import com.springvalidaciones.tareavalidaciones.entity.Estudiante;
import com.springvalidaciones.tareavalidaciones.excepcion.NotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EstudianteImpl implements EstudianteService{
    @Autowired
    private EstudianteDao estudianteDao;
    @Override
    public List<Estudiante> findAll() {
        return (List<Estudiante>)estudianteDao.findAll();
    }

    @Override
    public Optional<Estudiante> findById(Long id) {
        Optional<Estudiante> estudiantes = estudianteDao.findById(id);
        if(estudiantes.isEmpty()){
            throw new NotFoundException("Estudiante no encontrado" + id);
        }
        return estudiantes;
    }

    @Override
    public Optional<Estudiante> findByNombre(String nombre) {
        Optional<Estudiante> estudiantes = estudianteDao.findByNombre(nombre);
        if(estudiantes.isEmpty()){
            throw new NotFoundException("Estudiante no encontrado" + nombre);
        }
        return estudiantes;
    }

    @Override
    public void crearEstuidante(Estudiante estudiante) {
        estudianteDao.save(estudiante);
        if(estudiante == null){
            throw new NotFoundException(("No se pudo crear el estudiante"));
        }
    }

    @Override
    public void modificarEstudiante(Long id, Estudiante estudiante) {
        if(estudianteDao.existsById(id)){
            estudiante.setId(id);
            estudianteDao.save(estudiante);
        }
        if(estudiante == null){
            throw new NotFoundException(("No se pudo modificar el estudiante"));
        }
    }

    @Override
    public void borrarEstudiante(Long id) {
        if(estudianteDao.existsById(id)){
            estudianteDao.deleteById(id);
        }
        if(estudianteDao == null){
            throw new NotFoundException(("No se encontro el estudiante con ID" + id));
        }
    }
}
