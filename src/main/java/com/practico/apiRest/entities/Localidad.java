package com.practico.apiRest.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;

@Entity
@Table(name = "localidad")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Localidad implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "denominacion")
    private String denominacion;
}