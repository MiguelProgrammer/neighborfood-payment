/*
 * Copyright (c) 2024. MiguelProgrammer
 */

package br.com.techchallenge.fiap.neighborfood.infrastructure.persistence.payment.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;
import java.math.BigDecimal;

@Getter
@Setter
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "pagamento")
@SequenceGenerator(name = "pagamento_sequence")
public class PagamentoEntity implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "id_pedido")
    private Long idPedido;

    @Column(name = "total")
    private BigDecimal total;

    @Column(name = "valor_para_pagar")
    private BigDecimal valorParaPagar;

    @Column(name = "status")
    private Boolean pagou;
}
