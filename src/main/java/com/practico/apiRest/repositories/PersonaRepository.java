package com.practico.apiRest.repositories;

import com.practico.apiRest.entities.Persona;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonaRepository extends BaseRepository<Persona, Long> {
}
