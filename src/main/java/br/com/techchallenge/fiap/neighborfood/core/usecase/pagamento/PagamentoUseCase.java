/*
 * Copyright (c) 2024. MiguelProgrammer
 */

package br.com.techchallenge.fiap.neighborfood.core.usecase.pagamento;


import br.com.techchallenge.fiap.neighborfood.adapter.gateways.PagamentoGatewayMapper;
import br.com.techchallenge.fiap.neighborfood.adapter.presenter.PagamentoResponseMapper;
import br.com.techchallenge.fiap.neighborfood.core.domain.dto.PagamentoDTO;
import br.com.techchallenge.fiap.neighborfood.core.domain.pagamento.Pagamento;
import org.springframework.stereotype.Component;

@Component
public class PagamentoUseCase {

    private PagamentoGatewayMapper pagamentoGatewayMapper;

    public PagamentoUseCase(PagamentoGatewayMapper pagamentoGatewayMapper) {
        this.pagamentoGatewayMapper = pagamentoGatewayMapper;
    }

    public Pagamento pagamento(PagamentoDTO pagamento) {

        Pagamento pagamentoDTO = null;
        if (pagamento.getIdPedido() != null) {

            if (pagamento.getValorParaPagar().compareTo(pagamento.getTotal()) > 0) {
                try {
                    pagamentoDTO = PagamentoResponseMapper.entityToDto(pagamentoGatewayMapper.pagamento(pagamento));
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
