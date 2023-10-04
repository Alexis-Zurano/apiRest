package com.practico.apiRest.services;

import com.practico.apiRest.entities.Autor;
import com.practico.apiRest.repositories.AutorRepoository;
import com.practico.apiRest.repositories.BaseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AutorServiceImpl extends BaseServiceImpl<Autor,Long> implements AutorService{

    @Autowired
    private AutorRepoository autorRepository;

    public AutorServiceImpl(BaseRepository<Autor, Long> baseRepository, AutorRepoository autorRepository) {
        super(baseRepository);
        this.autorRepository = autorRepository;
    }
}
