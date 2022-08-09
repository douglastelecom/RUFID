package com.Douglas.RUFID.domain.model;
import lombok.Data;
import lombok.EqualsAndHashCode;
import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Data
@Entity
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class Aluno {

    @Id
    @EqualsAndHashCode.Include
    private Long matricula;

    @Column
    private String nome;

    @Column
    private String cpf;

    @Column
    private String rfid;
}
