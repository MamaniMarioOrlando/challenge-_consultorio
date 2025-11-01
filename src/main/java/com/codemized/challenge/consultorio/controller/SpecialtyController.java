package com.codemized.challenge.consultorio.controller;

import com.codemized.challenge.consultorio.model.Specialty;
import com.codemized.challenge.consultorio.service.SpecialtyService;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/specialties")
@AllArgsConstructor
public class SpecialtyController {
    private final SpecialtyService specialtyService;

    @GetMapping
    public List<Specialty> getAll(){
        return specialtyService.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Specialty> getById(@PathVariable  Long id){
        return specialtyService.findById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public Specialty create(@RequestBody Specialty specialty){
        return specialtyService.save(specialty);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id){
        specialtyService.deleteById(id);
        return ResponseEntity.noContent().build();
    }
}
