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
public class Classe1 implements TestStrategy, TestBuilder {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Override
    public boolean isSatisfiedBy(TipoClasse tipoClasse) {
        return tipoClasse == TipoClasse.ADMINISTRADOR;
    }

    @Override
    public Classe1 build() {
        return new Classe1();
    }

    @Override
    public void run() {
        System.out.println("Stratégia Administrador");
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Id
    public Long getId() {
        return id;
    }
}

