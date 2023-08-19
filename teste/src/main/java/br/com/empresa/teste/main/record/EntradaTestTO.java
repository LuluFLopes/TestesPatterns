package br.com.empresa.teste.main.record;

import br.com.empresa.teste.main.enumerator.TipoClasse;

public record EntradaTestTO(
        TipoClasse tipoClasse
) {
    public EntradaTestTO(TipoClasse tipoClasse) {
        this.tipoClasse = tipoClasse;
    }
}

