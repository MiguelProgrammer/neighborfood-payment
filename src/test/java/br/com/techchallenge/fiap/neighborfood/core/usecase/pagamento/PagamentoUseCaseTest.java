package br.com.techchallenge.fiap.neighborfood.core.usecase.pagamento;/*
 * Copyright (c) 2024. MiguelProgrammer
 */

import br.com.techchallenge.fiap.neighborfood.core.domain.dto.PagamentoDTO;
import br.com.techchallenge.fiap.neighborfood.core.domain.pagamento.Pagamento;
import br.com.techchallenge.fiap.neighborfood.infrastructure.gateways.PagamentoRepositoryGateway;
import br.com.techchallenge.fiap.neighborfood.infrastructure.persistence.payment.PagamentoRepository;
import jakarta.transaction.Transactional;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.context.SpringBootTest;

import java.math.BigDecimal;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
@AutoConfigureTestDatabase
@Transactional
public class PagamentoUseCaseTest {

    @Autowired
    private PagamentoUseCase useCase;

    @Autowired
    private PagamentoRepositoryGateway pagamentoRepositoryGateway;

    @Autowired
    private PagamentoRepository pagamentoRepository;
    private PagamentoDTO pagamento = new PagamentoDTO();


    @Test
    @DisplayName("SERVICE - Realiza um pagamento via código de pedido!")
    void pagamento() {

        pagamento = new PagamentoDTO();
        pagamento.setIdPedido(1L);
        pagamento.setValorParaPagar(new BigDecimal("15.00"));
        pagamento.setTotal(new BigDecimal("12.00"));
        pagamento.setPagou(Boolean.TRUE);

        /* ACT */
        Pagamento pagamentoByTest = useCase.pagamento(pagamento);

        /* ASSERT */
        assertThat(pagamentoByTest).isInstanceOf(Pagamento.class);
        assertThat(pagamentoByTest.getPagou()).isTrue();
        assertThat(pagamentoByTest.getIdPedido()).isNotZero();
        assertThat(pagamentoByTest.getId()).isGreaterThan(0);

    }


}