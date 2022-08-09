package com.Douglas.RUFID.controller;

import com.Douglas.RUFID.domain.model.Aluno;
import com.Douglas.RUFID.domain.model.Laboratorio;
import com.Douglas.RUFID.domain.repository.LaboratorioRepository;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@AllArgsConstructor
@RequestMapping(value = "/laboratorio")
public class LaboratorioController {

    private LaboratorioRepository laboratorioRepository;

    @GetMapping
    public List<Laboratorio> laboratorioList() {
        return laboratorioRepository.findAll();
    }

    @GetMapping("/{id}")
    public Optional<Laboratorio> laboratorioFind(@PathVariable long id) {
        return laboratorioRepository.findById(id);
    }

    @PostMapping
    public void add (@RequestBody Laboratorio laboratorio){
        laboratorioRepository.save(laboratorio);
    }


}
