package com.exemplo.CRUD.model;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
public class Container {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long idContainer;

    @Column
    public String cliente;

    @Column
    public String numContainer;

    @Column
    public int tipo;

    @Column
    public String statusContainer;

    @Column
    public String categoria;
}
