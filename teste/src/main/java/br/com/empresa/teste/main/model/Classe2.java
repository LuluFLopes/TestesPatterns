package br.com.empresa.teste.main.model;

import br.com.empresa.teste.main.builder.TestBuilder;
import br.com.empresa.teste.main.enumerator.TipoClasse;
import br.com.empresa.teste.main.strategy.TestStrategy;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import org.springframework.stereotype.Component;

@Entity
@Component
public class Classe2 implements TestStrategy, TestBuilder {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Override
    public boolean isSatisfiedBy(TipoClasse tipoClasse) {
        return tipoClasse == TipoClasse.GERENTE;
    }

    @Override
    public Classe2 build() {
        return new Classe2();
    }

    @Override
    public void run() {
        System.out.println("Stratégia Gerente");
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
