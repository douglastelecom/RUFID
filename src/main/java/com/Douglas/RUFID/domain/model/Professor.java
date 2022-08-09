package com.Douglas.RUFID.domain.model;
import lombok.Data;
import lombok.EqualsAndHashCode;
import javax.persistence.*;

@Data
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@Entity
public class Professor {

    @EqualsAndHashCode.Include
    @Id
    private Long matricula;

    @Column
    private String nome;

    @Column
    private String cpf;

    @Column
    private String rfid;
}
