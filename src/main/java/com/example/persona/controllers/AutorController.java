package com.example.persona.controllers;


import com.example.persona.entities.Autor;
import com.example.persona.services.AutorServiceImpl;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(path = "api/v1/autores")
public class AutorController extends BaseControllerImpl<Autor, AutorServiceImpl> {
//spring.datasource.url=jdbc:mysql://localhost:3306/db_persona?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC
}
