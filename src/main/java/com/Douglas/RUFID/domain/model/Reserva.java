package com.Douglas.RUFID.domain.model;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.*;
import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

@Data
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@Entity
public class Reserva {

    @Id
    @EqualsAndHashCode.Include
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private Date hInicio;

    @Column
    private Date hFinal;

    @ManyToMany
    @JoinTable(name="reserva_aluno", joinColumns = @JoinColumn(name="id"), inverseJoinColumns = @JoinColumn(name="matricula"))
    private List<Aluno> alunos = new ArrayList<>();

    @ManyToMany
    @JoinTable(name="reserva_professor", joinColumns = @JoinColumn(name="id"), inverseJoinColumns = @JoinColumn(name="matricula"))
    private List<Professor> professores = new ArrayList<>();

    @ManyToOne
    private Laboratorio laboratorio;

    @ManyToOne
    private Professor Cadastrante;

}
