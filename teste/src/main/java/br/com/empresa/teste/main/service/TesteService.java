package br.com.empresa.teste.main.service;

import br.com.empresa.teste.main.builder.TestBuilder;
import br.com.empresa.teste.main.model.Classe1;
import br.com.empresa.teste.main.record.EntradaTestTO;
import br.com.empresa.teste.main.strategy.TestStrategy;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TesteService {

    private final List<TestStrategy> listaTesteStrategy;
    private final List<TestBuilder> listaTestBuilder;

    public TesteService(List<TestStrategy> listaTesteStrategy, List<TestBuilder> listaTestBuilder) {
        this.listaTesteStrategy = listaTesteStrategy;
        this.listaTestBuilder = listaTestBuilder;
    }

    public void teste(EntradaTestTO entradaTestTO) {
        listaTesteStrategy
                .stream()
                .filter(e -> e.isSatisfiedBy(entradaTestTO.tipoClasse()))
                .findFirst()
                .orElseThrow(NullPointerException::new)
                .run();

        Object obj = listaTestBuilder
                .stream()
                .filter(e -> e.isSatisfiedBy(entradaTestTO.tipoClasse()))
                .findFirst()
                .orElseThrow(NullPointerException::new)
                .build();

        if (obj instanceof Classe1){
            System.out.println("Deu bom!");
        } else {
            System.out.println("Memes");
        }
    }

}
