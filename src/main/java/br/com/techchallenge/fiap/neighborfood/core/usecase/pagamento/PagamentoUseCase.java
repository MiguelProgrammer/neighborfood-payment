/*
 * Copyright (c) 2024. MiguelProgrammer
 */

package br.com.techchallenge.fiap.neighborfood.core.usecase.pagamento;


import br.com.techchallenge.fiap.neighborfood.adapter.presenter.PagamentoResponseMapper;
import br.com.techchallenge.fiap.neighborfood.core.domain.dto.PagamentoDTO;
import br.com.techchallenge.fiap.neighborfood.core.domain.pagamento.Pagamento;
import br.com.techchallenge.fiap.neighborfood.infrastructure.gateways.PagamentoRepositoryGateway;
import br.com.techchallenge.fiap.neighborfood.infrastructure.persistence.payment.entities.PagamentoEntity;
import org.springframework.stereotype.Component;

@Component
public class PagamentoUseCase {

    private PagamentoRepositoryGateway pagamentoRepositoryGateway;

    public PagamentoUseCase(PagamentoRepositoryGateway pagamentoRepositoryGateway) {
        this.pagamentoRepositoryGateway = pagamentoRepositoryGateway;
    }

    public Pagamento pagamento(PagamentoDTO pagamento) {

        Pagamento pagamentoDTO = null;
        if (pagamento.getIdPedido() != null) {

            if (pagamento.getValorParaPagar().compareTo(pagamento.getTotal()) > 0) {
                try {
                    PagamentoEntity pagamentoResponse = pagamentoRepositoryGateway.pagamento(pagamento);
                    pagamentoDTO = PagamentoResponseMapper.entityToDto(pagamentoResponse);
                } catch (RuntimeException ex) {
                    System.err.println("Erro ao realizar pagamento => Pedido não encontrado!!!");
                }

            } else {
                System.err.println("Valor insuficiente para pagamento!");
            }
            return pagamentoDTO;
        }
        return null;
    }
}
