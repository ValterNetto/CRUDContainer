package com.exemplo.CRUD.model;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
public class Movement {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long idMovement;

    @Column
    public Long idContainerMovement;

    @Column
    public String tipoMov;

    @Column
    public String horaInicio;

    @Column
    public String horaFim;
}
