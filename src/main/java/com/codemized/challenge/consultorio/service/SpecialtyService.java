package com.codemized.challenge.consultorio.service;

import com.codemized.challenge.consultorio.model.Specialty;

import java.util.List;
import java.util.Optional;

public interface SpecialtyService {
    Specialty save(Specialty specialty);
    List<Specialty> findAll();
    Optional<Specialty> findById(Long id);
    void deleteById(Long id);
}
