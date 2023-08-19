package br.com.empresa.teste.main.builder;

import br.com.empresa.teste.main.enumerator.TipoClasse;

public interface TestBuilder<T> {

    boolean isSatisfiedBy(TipoClasse tipoClasse);

    T build();
}
