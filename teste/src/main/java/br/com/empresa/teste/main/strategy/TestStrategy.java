package br.com.empresa.teste.main.strategy;

import br.com.empresa.teste.main.enumerator.TipoClasse;

public interface TestStrategy {

    boolean isSatisfiedBy(TipoClasse tipoClasse);

    void run();

}
