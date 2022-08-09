package com.Douglas.RUFID.controller;
import com.Douglas.RUFID.domain.model.Professor;
import com.Douglas.RUFID.domain.repository.ProfessorRepository;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@AllArgsConstructor
@RequestMapping(value = "/professor")
public class ProfessorController {

    private ProfessorRepository professorRepository;

    @GetMapping
    public List<Professor> professorList() {
        return professorRepository.findAll();
    }

    @GetMapping("/{matricula}")
    public Optional<Professor> professorFind(@PathVariable long matricula) {
        return professorRepository.findById(matricula);
    }

    @PostMapping
    public void add (@RequestBody Professor professor){
        professorRepository.save(professor);
    }
}


