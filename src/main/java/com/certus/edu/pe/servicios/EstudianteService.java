package com.certus.edu.pe.servicios;

import com.certus.edu.pe.modelo.Estudiante;
import com.certus.edu.pe.repositorio.EstudianteRepositorio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class EstudianteService {

    @Autowired
    private EstudianteRepositorio estudianteRepository;

    public List<Estudiante> findAll() {
        return estudianteRepository.findAll();
    }

    public Optional<Estudiante> findById(Integer id) {
        return estudianteRepository.findById(id);
    }

    public Estudiante save(Estudiante estudiante) {
        return estudianteRepository.save(estudiante);
    }

    public void deleteById(Integer id) {
        estudianteRepository.deleteById(id);
    }
}
