/*
 * Copyright (c) 2024. MiguelProgrammer
 */

package br.com.techchallenge.fiap.neighborfood.framework.tools;


import br.com.techchallenge.fiap.neighborfood.core.domain.dto.PagamentoDTO;
import io.cucumber.java.pt.Então;
import io.cucumber.java.pt.Quando;
import io.restassured.response.Response;
import org.junit.platform.suite.api.IncludeEngines;
import org.junit.platform.suite.api.SelectClasspathResource;
import org.junit.platform.suite.api.Suite;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.MediaType;

import java.math.BigDecimal;

import static io.restassured.RestAssured.given;

@Suite
@IncludeEngines("cucumber")
@SuppressWarnings("test")
@SelectClasspathResource("features")
public class CucumberTest {

    private static final Logger log = LoggerFactory.getLogger(CucumberTest.class);
    private Response response;
    private final String REST_API_PAGAMENTO = "http://localhost:84/neighborfood/pagamento";

    @Quando("realizo o pagamento")
    public PagamentoDTO realizo_o_pagamento() {
        PagamentoDTO pagamento = new PagamentoDTO();
        pagamento.setIdPedido(1L);
        pagamento.setValorParaPagar(new BigDecimal("15.00"));
        pagamento.setTotal(new BigDecimal("12.00"));
        pagamento.setPagou(Boolean.TRUE);

        try {

            response = given().
                    contentType(MediaType.APPLICATION_JSON_VALUE)
                    .body(pagamento)
                    .when()
                    .post(REST_API_PAGAMENTO).prettyPeek();

            return response.then().extract().as(PagamentoDTO.class);
        } catch (Exception e){
            //log.info("ERROR -> {}", e);
        }
        return null;
    }

    @Então("recebo um retorno com o pagamento realizado")
    public void recebo_um_retorno_com_o_pagamento_realizado() {
        realizo_o_pagamento();
    }



}
