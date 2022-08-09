package com.Douglas.RUFID.controller;
import com.Douglas.RUFID.domain.model.Reserva;
import com.Douglas.RUFID.domain.repository.ReservaRepository;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@AllArgsConstructor
@RequestMapping(value = "/reserva")
public class ReservaController {
    private ReservaRepository reservaRepository;

    @GetMapping
    public List<Reserva> reservaList() {
        return reservaRepository.findAll();
    }

    @GetMapping("/{id}")
    public Optional<Reserva> reservaFind(@PathVariable long id) {
        return reservaRepository.findById(id);
    }

    @PostMapping
    public void addReserva (@RequestBody Reserva reserva){
        reservaRepository.save(reserva);
    }
}
