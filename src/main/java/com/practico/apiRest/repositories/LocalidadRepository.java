package com.practico.apiRest.repositories;

import com.practico.apiRest.entities.Localidad;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LocalidadRepository extends JpaRepository<Localidad, Long> {
}
