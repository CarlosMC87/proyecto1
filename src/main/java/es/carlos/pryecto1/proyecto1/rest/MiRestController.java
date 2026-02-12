package es.carlos.pryecto1.proyecto1.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MiRestController {

    @GetMapping("/")
    public String Saludo() {

        return "Hola, mundo!";

    }

}
