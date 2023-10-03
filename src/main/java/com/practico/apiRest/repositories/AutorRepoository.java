package com.practico.apiRest.repositories;

import com.practico.apiRest.entities.Autor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AutorRepoository extends JpaRepository<Autor, Long>{
}
