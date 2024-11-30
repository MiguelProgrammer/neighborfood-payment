/*
 * Copyright (c) 2024. MiguelProgrammer
 */

package br.com.techchallenge.fiap.neighborfood.framework.web;

import br.com.techchallenge.fiap.neighborfood.adapter.controllers.PagamentoControllerDomain;
import br.com.techchallenge.fiap.neighborfood.adapter.presenter.PagamentoResponseMapper;
import br.com.techchallenge.fiap.neighborfood.core.domain.dto.PagamentoDTO;
import br.com.techchallenge.fiap.neighborfood.core.domain.pagamento.Pagamento;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.ResponseEntity;

import java.math.BigDecimal;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
class PagamentoControllerTest {

    @Autowired
    private PagamentoController pagamentoController;

    @Autowired
    private PagamentoControllerDomain pagamentoControllerDomain;


    @Test
    @Severity(SeverityLevel.CRITICAL)
    @DisplayName("CONTROLLER - Realiza um pagamento end to end!")
    void payment() {

        PagamentoResponseMapper pagamentoResponseMapper = new PagamentoResponseMapper();
        Pagamento pagamento = new Pagamento();

        PagamentoDTO pagamentoDto = new PagamentoDTO();
        pagamentoDto.setIdPedido(1L);
        pagamentoDto.setValorParaPagar(new BigDecimal("15.00"));
        pagamentoDto.setTotal(new BigDecimal("12.00"));
        pagamentoDto.setPagou(Boolean.TRUE);

        /* ACT */
        ResponseEntity<PagamentoDTO> payment = pagamentoController.payment(pagamentoDto);
        PagamentoDTO body = payment.getBody();

        /* ASSERT */
        assertThat(body).isInstanceOf(PagamentoDTO.class);
        assertThat(body.getPagou());
        assertThat(body.getIdPedido()).isNotZero();
        assertThat(body.getIdPedido()).isGreaterThan(0);


        PagamentoDTO pagamentoDTO = pagamentoResponseMapper.domainToDto(pagamento, body);
        assertThat(pagamentoDTO).isInstanceOf(PagamentoDTO.class);
        assertThat(pagamentoDTO.getIdPedido()).isEqualTo(pagamento.getIdPedido());

    }

}