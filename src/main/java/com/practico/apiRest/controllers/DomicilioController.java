package com.practico.apiRest.controllers;

import com.practico.apiRest.entities.Domicilio;
import com.practico.apiRest.services.DomicilioServiceImpl;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(path = "api/v1/domicilios")
public class DomicilioController extends BaseControllerImpl<Domicilio, DomicilioServiceImpl>{

}
