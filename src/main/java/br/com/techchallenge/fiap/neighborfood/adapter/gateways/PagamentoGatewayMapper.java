/*
 * Copyright (c) 2024. MiguelProgrammer
 */

package br.com.techchallenge.fiap.neighborfood.adapter.gateways;

import br.com.techchallenge.fiap.neighborfood.core.domain.dto.PagamentoDTO;
import br.com.techchallenge.fiap.neighborfood.infrastructure.persistence.payment.entities.PagamentoEntity;

public interface PagamentoGatewayMapper {

    PagamentoEntity pagamento(PagamentoDTO pagamento);
    //Pagamento entityToDomain(PagamentoEntity pagamento);
}
