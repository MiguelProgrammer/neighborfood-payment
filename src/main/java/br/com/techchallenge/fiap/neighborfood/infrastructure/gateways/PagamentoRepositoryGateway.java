/*
 * Copyright (c) 2024. MiguelProgrammer
 */

package br.com.techchallenge.fiap.neighborfood.infrastructure.gateways;

import br.com.techchallenge.fiap.neighborfood.adapter.gateways.PagamentoGateway;
import br.com.techchallenge.fiap.neighborfood.adapter.presenter.AcompanhamentoResponse;
import br.com.techchallenge.fiap.neighborfood.core.domain.dto.PagamentoDTO;
import br.com.techchallenge.fiap.neighborfood.infrastructure.persistence.payment.PagamentoRepository;
import br.com.techchallenge.fiap.neighborfood.infrastructure.persistence.payment.entities.PagamentoEntity;
import org.springframework.stereotype.Component;

@Component
public class PagamentoRepositoryGateway implements PagamentoGateway {

    private AcompanhamentoResponse acompanhamentoResponse;
    private final PagamentoRepository pagamentoRepository;

    public PagamentoRepositoryGateway(PagamentoRepository pagamentoRepository) {
        this.pagamentoRepository = pagamentoRepository;
    }

    @Override
    public Object pagamento(PagamentoDTO pagamento) {
        PagamentoEntity entity = new PagamentoEntity();
        entity.setIdPedido(pagamento.getIdPedido());
        //entity.setPagou(pagamento.getPagou());
        PagamentoEntity save = pagamentoRepository.save(entity);
        return null;//acompanhamentoResponse.getOrderStatus(save.getIdPedido());
    }
}
