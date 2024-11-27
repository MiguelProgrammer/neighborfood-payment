/*
 * Copyright (c) 2024. MiguelProgrammer
 */

package br.com.techchallenge.fiap.neighborfood.framework.web;


import _generated_sources_swagger_pagamento.NeighborfoodApi;
import br.com.techchallenge.fiap.neighborfood.adapter.controllers.PagamentoControllerDomain;
import br.com.techchallenge.fiap.neighborfood.adapter.presenter.PagamentoResponseMapper;
import br.com.techchallenge.fiap.neighborfood.core.domain.dto.PagamentoDTO;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PagamentoController implements NeighborfoodApi {

    private PagamentoControllerDomain pagamento;

    public PagamentoController(PagamentoControllerDomain pagamento) {
        this.pagamento = pagamento;
    }

    @PostMapping(value = "/neighborfood/pagamento",
            produces = {MediaType.APPLICATION_JSON_VALUE},
            consumes = {MediaType.APPLICATION_JSON_VALUE}
    )
    public ResponseEntity<PagamentoDTO> payment(@RequestBody PagamentoDTO pagamentoDTO) {
        PagamentoDTO pagamentoDTO1 = new PagamentoResponseMapper().domainToDto(pagamento.realiza(pagamentoDTO), pagamentoDTO);
        return ResponseEntity.ok(pagamentoDTO1);
    }

}
