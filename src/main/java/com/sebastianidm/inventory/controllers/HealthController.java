package com.sebastianidm.inventory.controllers;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

//1. @RestController: le dice a spring: "oye, esta clase maneja peticiones web"
@RestController
public class HealthController {


    //2. @GetMapping: le dice "Cuando alguien llame a la ruta /health
    // Ejecuta este metodo ->
    @GetMapping("/health")
    public String checkApi(){
        return "Api funcionando correctamente. Hola mundo";
    }


}
