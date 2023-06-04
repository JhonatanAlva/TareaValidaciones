package com.springvalidaciones.tareavalidaciones.service;

import com.springvalidaciones.tareavalidaciones.entity.Estudiante;

import java.util.List;
import java.util.Optional;

public interface EstudianteService {
    public List<Estudiante> findAll();
    public Optional<Estudiante> findById(Long id);
    public Optional<Estudiante> findByNombre(String nombre);
    public void crearEstuidante(Estudiante estudiante);
    public void modificarEstudiante(Long id, Estudiante estudiante);
    public void borrarEstudiante(Long id);
}
