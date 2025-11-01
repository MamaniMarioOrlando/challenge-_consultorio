package com.codemized.challenge.consultorio.service.impl;

import com.codemized.challenge.consultorio.model.Specialty;
import com.codemized.challenge.consultorio.repository.SpecialtyRepository;
import com.codemized.challenge.consultorio.service.SpecialtyService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
@Slf4j
public class SpecialtyServiceImpl implements SpecialtyService {

    private final SpecialtyRepository specialtyRepository;

    @Override
    public Specialty save(Specialty specialty) {
        log.info("Guardando especialidad: {}", specialty.getName());
        return specialtyRepository.save(specialty);
    }

    @Override
    public List<Specialty> findAll() {
        log.info("Buscando todas las especialidades");
        return specialtyRepository.findAll();
    }

    @Override
    public Optional<Specialty> findById(Long id) {
        log.info("Buscando especialidad con id: {}", id);
        return specialtyRepository.findById(id);
    }

    @Override
    public void deleteById(Long id) {
        log.info("Eliminando especialidad con id: {}", id);
        specialtyRepository.deleteById(id);
    }
}
