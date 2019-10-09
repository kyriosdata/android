package com.github.kyriosdata.exemplo.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class RequisicaoEventoTest {

    @Test
    void verificaSerializacaoCorreta() {
        Requisicao requisicao = new Requisicao("bom", "dia");
        RequisicaoEvento requisicaoEvento = new RequisicaoEvento();
        assertEquals("[\"bom\",\"dia\"]",
                requisicaoEvento.conteudo(requisicao));
    }
}
