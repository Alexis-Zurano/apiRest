package com.practico.apiRest.controllers;

import com.practico.apiRest.entities.Autor;
import com.practico.apiRest.services.AutorServiceImpl;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(path = "api/v1/autores")
public class AutorController extends BaseControllerImpl<Autor,AutorServiceImpl>{

}
