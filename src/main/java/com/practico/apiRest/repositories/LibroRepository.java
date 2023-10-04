package com.practico.apiRest.repositories;

import com.practico.apiRest.entities.Libro;
import org.springframework.stereotype.Repository;

@Repository
public interface LibroRepository extends BaseRepository<Libro, Long> {
}
