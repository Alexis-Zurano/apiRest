package com.practico.apiRest.controllers;

import com.practico.apiRest.entities.Libro;
import com.practico.apiRest.services.LibroServiceImpl;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(path = "api/v1/libros")
public class LibroController extends BaseControllerImpl<Libro, LibroServiceImpl>{

}
