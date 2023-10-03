package com.practico.apiRest.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;

@Entity
@Table(name = "domicilio")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Domicilio implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "calle")
    private String calle;
    @Column(name = "numero")
    private int numero;
}
