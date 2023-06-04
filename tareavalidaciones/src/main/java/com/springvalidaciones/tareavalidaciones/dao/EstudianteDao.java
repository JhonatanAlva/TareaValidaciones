package com.springvalidaciones.tareavalidaciones.dao;

import com.springvalidaciones.tareavalidaciones.entity.Estudiante;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface EstudianteDao extends CrudRepository<Estudiante, Long> {

    Optional<Estudiante> findByNombre(String nombre);
}
