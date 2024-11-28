/*
 * Copyright (c) 2024. MiguelProgrammer
 */

package br.com.techchallenge.fiap.neighborfood.infrastructure.persistence.payment;


import br.com.techchallenge.fiap.neighborfood.infrastructure.persistence.payment.entities.PagamentoEntity;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.math.BigDecimal;
import java.util.Optional;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.*;

public class PagamentoRepositoryTest {

    @Mock
    private PagamentoRepository pagamentoRepository;
    private AutoCloseable autoCloseable;
    private PagamentoEntity pagamento;

    @BeforeEach
    void setUp() {
        autoCloseable = MockitoAnnotations.openMocks(this);
        pagamento = new PagamentoEntity();
        pagamento.setIdPedido(1L);
        pagamento.setValorParaPagar(new BigDecimal("15.00"));
        pagamento.setTotal(new BigDecimal("12.00"));
        pagamento.setPagou(Boolean.TRUE);

    }

    @Test
    @DisplayName("Procurando um pagamento pelo id do pagamento")
    void findByIdPedido() {

        /* ARRANGE */
        when(pagamentoRepository.findByIdPedido(anyLong())).thenReturn(Optional.of(pagamento));

        /* ACT */
        var pagamentoByIdPedido =  pagamentoRepository.findByIdPedido(pagamento.getIdPedido());

        /* ASSERT */
        pagamentoByIdPedido.ifPresent(pd -> {
            assertThat(pd.getIdPedido().equals(pagamento.getIdPedido()));
            assertThat(pd.getValorParaPagar().equals(pagamento.getValorParaPagar()));
            assertThat(pd.getPagou().equals(pagamento.getPagou()));
        });
        assertThat(pagamentoByIdPedido.get()).isNotNull().isEqualTo(pagamento);
        verify(pagamentoRepository, times(1)).findByIdPedido(anyLong());
    }

    @Test
    @DisplayName("Salvando um pagamento")
    void save() {

        /* ARRANGE */
        when(pagamentoRepository.save(any(PagamentoEntity.class))).thenReturn(pagamento);

        /* ACT */
        var pagamentoSalvo =  pagamentoRepository.save(pagamento);

        /* ASSERT */
        assertThat(pagamentoSalvo).isNotNull().isEqualTo(pagamento);
        verify(pagamentoRepository, times(1)).save(any(PagamentoEntity.class));
    }


    @AfterEach
    void tearDown() throws Exception {
        autoCloseable.close();
    }
}