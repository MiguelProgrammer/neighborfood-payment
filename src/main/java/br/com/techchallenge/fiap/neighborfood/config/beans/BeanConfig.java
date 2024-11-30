package br.com.techchallenge.fiap.neighborfood.config.beans;
/*
 * Copyright (c) 2024. MiguelProgrammer
 */

import br.com.techchallenge.fiap.neighborfood.infrastructure.gateways.PagamentoRepositoryGateway;
import br.com.techchallenge.fiap.neighborfood.infrastructure.persistence.payment.PagamentoRepository;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanConfig {

    @Bean
    public PagamentoRepositoryGateway gera(PagamentoRepository pagamentoRepository) {
        return new PagamentoRepositoryGateway(pagamentoRepository);
    }

}
