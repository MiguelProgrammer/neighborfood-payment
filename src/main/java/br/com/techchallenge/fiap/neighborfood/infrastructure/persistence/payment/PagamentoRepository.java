/*
 * Copyright (c) 2024. MiguelProgrammer
 */

package br.com.techchallenge.fiap.neighborfood.infrastructure.persistence.payment;

import br.com.techchallenge.fiap.neighborfood.infrastructure.persistence.payment.entities.PagamentoEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface PagamentoRepository extends JpaRepository<PagamentoEntity, Long> {

    Optional<PagamentoEntity> findByIdPedido(Long idPedido);
}
