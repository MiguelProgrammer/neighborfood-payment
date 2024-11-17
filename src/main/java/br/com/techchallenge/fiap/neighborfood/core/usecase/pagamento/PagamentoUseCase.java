/*
 * Copyright (c) 2024. MiguelProgrammer
 */

package br.com.techchallenge.fiap.neighborfood.core.usecase.pagamento;


import br.com.techchallenge.fiap.neighborfood.adapter.presenter.AcompanhamentoResponse;
import br.com.techchallenge.fiap.neighborfood.core.domain.dto.PagamentoDTO;
import org.springframework.stereotype.Component;

@Component
public class PagamentoUseCase {

    public Object pagamento(PagamentoDTO pagamento) {

        //Pedido pedidoDTO = null;//pedidoGateway.findById(pagamento.getIdPedido());
        AcompanhamentoResponse response = new AcompanhamentoResponse();
        //if (pedidoDTO != null) {

            //pedidoGateway.salvaPagamento(pagamento);

            System.out.println("Pagamento Aprovado!");

            try {

                //pedidoDTO.setStatus(Status.EM_PREPARACAO);
//                response.setPedidoRequest(
//                        response.convertPedidoRequest(
//                                pedidoGateway.commitUpdates(pedidoDTO.domainFromEntity())));
//                System.out.println(acompanhamentoGateway.sms(pedidoDTO.getStatus()));
//                response.setStatus(pedidoDTO.getStatus());
//                response.setTotal(pedidoDTO.getTotal());



            } catch (RuntimeException ex) {
                System.err.println("Erro ao realizar pagamento => Pedido não encontrado!!!");
            }
        //}
        return null;//response.pedidoFromResponse();
    }
}
