/*
 * Copyright (c) 2024. MiguelProgrammer
 */

package br.com.techchallenge.fiap.neighborfood.infrastructure.gateways;

import br.com.techchallenge.fiap.neighborfood.adapter.gateways.PagamentoGatewayMapper;
import br.com.techchallenge.fiap.neighborfood.core.domain.dto.PagamentoDTO;
import br.com.techchallenge.fiap.neighborfood.infrastructure.persistence.payment.PagamentoRepository;
import br.com.techchallenge.fiap.neighborfood.infrastructure.persistence.payment.entities.PagamentoEntity;
import org.springframework.stereotype.Component;

@Component
public class PagamentoRepositoryGateway implements PagamentoGatewayMapper {

    private final PagamentoRepository pagamentoRepository;

    public PagamentoRepositoryGateway(PagamentoRepository pagamentoRepository) {
        this.pagamentoRepository = pagamentoRepository;
    }


    /**
     * @param pagamento
     * @return
     */
    @Override
    public PagamentoEntity pagamento(PagamentoDTO pagamento) {
        PagamentoEntity entity = new PagamentoEntity();
        entity.setIdPedido(pagamento.getIdPedido());
        entity.setValorParaPagar(pagamento.getValorParaPagar());
        entity.setTotal(pagamento.getTotal());
        entity.setPagou(Boolean.TRUE);
        return pagamentoRepository.save(entity);
    }
}
