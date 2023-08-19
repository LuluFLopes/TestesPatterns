package br.com.empresa.teste.main.controller;


import br.com.empresa.teste.main.record.EntradaTestTO;
import br.com.empresa.teste.main.service.TesteService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/home")
public class TesteController {

    private final TesteService service;

    public TesteController(TesteService service) {
        this.service = service;
    }

    @PostMapping
    public void testeController(@RequestBody EntradaTestTO entradaTestTO){
        service.teste(entradaTestTO);
    }

}
