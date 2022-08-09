package com.Douglas.RUFID.controller;

import com.Douglas.RUFID.domain.model.Aluno;
import com.Douglas.RUFID.domain.model.Laboratorio;
import com.Douglas.RUFID.domain.repository.AlunoRepository;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@AllArgsConstructor
@RequestMapping(value = "/aluno")
public class AlunoController {

    private AlunoRepository alunoRepository;

    @GetMapping
    public List<Aluno> alunoList() {
        return alunoRepository.findAll();
    }

    @GetMapping("/{matricula}")
    public Optional<Aluno> alunoFind(@PathVariable long matricula) {
        return alunoRepository.findById(matricula);
    }

    @PostMapping
    public void add (@RequestBody Aluno aluno){
        alunoRepository.save(aluno);
    }
}
