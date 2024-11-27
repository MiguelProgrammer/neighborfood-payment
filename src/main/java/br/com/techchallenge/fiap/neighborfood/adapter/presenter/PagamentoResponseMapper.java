package br.com.techchallenge.fiap.neighborfood.adapter.presenter;/*
 * Copyright (c) 2024. MiguelProgrammer
 */


import br.com.techchallenge.fiap.neighborfood.core.domain.dto.PagamentoDTO;
import br.com.techchallenge.fiap.neighborfood.core.domain.pagamento.Pagamento;
import br.com.techchallenge.fiap.neighborfood.infrastructure.persistence.payment.entities.PagamentoEntity;

public class PagamentoResponseMapper {

    public static Pagamento entityToDto(PagamentoEntity entity){
        Pagamento dto = new Pagamento();
        dto.setIdPedido(entity.getIdPedido());
        dto.setPagou(entity.getPagou());
        return dto;
    }

    public PagamentoDTO domainToDto(Pagamento dm, PagamentoDTO pagamentoDTO) {
        PagamentoDTO dto = new PagamentoDTO();
        dto.setPagou(dm.getPagou());
        dto.setIdPedido(dm.getIdPedido());
        dto.setTotal(pagamentoDTO.getTotal());
        dto.setValorParaPagar(pagamentoDTO.getValorParaPagar());
        return dto;
    }
}







