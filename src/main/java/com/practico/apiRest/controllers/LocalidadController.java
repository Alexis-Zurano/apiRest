package com.practico.apiRest.controllers;

import com.practico.apiRest.entities.Localidad;
import com.practico.apiRest.services.LocalidadServiceImpl;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(path = "api/v1/localidades")
public class LocalidadController extends BaseControllerImpl<Localidad, LocalidadServiceImpl>{

}
