/*
 * Copyright (c) 2024. MiguelProgrammer
 */

package br.com.techchallenge.fiap.neighborfood.adapter.gateways;

import br.com.techchallenge.fiap.neighborfood.core.domain.dto.PagamentoDTO;

public interface PagamentoGateway {

    Object pagamento(PagamentoDTO pagamento);
}
