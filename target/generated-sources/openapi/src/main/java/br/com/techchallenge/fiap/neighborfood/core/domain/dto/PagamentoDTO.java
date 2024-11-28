package br.com.techchallenge.fiap.neighborfood.core.domain.dto;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * PagamentoDTO
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-11-28T06:57:56.302866-03:00[America/Sao_Paulo]")
public class PagamentoDTO {

  private Long idPedido;

  private java.math.BigDecimal total;

  private java.math.BigDecimal valorParaPagar;

  private Boolean pagou;

  public PagamentoDTO idPedido(Long idPedido) {
    this.idPedido = idPedido;
    return this;
  }

  /**
   * Get idPedido
   * @return idPedido
  */
  
  @Schema(name = "idPedido", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("idPedido")
  public Long getIdPedido() {
    return idPedido;
  }

  public void setIdPedido(Long idPedido) {
    this.idPedido = idPedido;
  }

  public PagamentoDTO total(java.math.BigDecimal total) {
    this.total = total;
    return this;
  }

  /**
   * Get total
   * @return total
  */
  
  @Schema(name = "total", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("total")
  public java.math.BigDecimal getTotal() {
    return total;
  }

  public void setTotal(java.math.BigDecimal total) {
    this.total = total;
  }

  public PagamentoDTO valorParaPagar(java.math.BigDecimal valorParaPagar) {
    this.valorParaPagar = valorParaPagar;
    return this;
  }

  /**
   * Get valorParaPagar
   * @return valorParaPagar
  */
  
  @Schema(name = "valorParaPagar", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("valorParaPagar")
  public java.math.BigDecimal getValorParaPagar() {
    return valorParaPagar;
  }

  public void setValorParaPagar(java.math.BigDecimal valorParaPagar) {
    this.valorParaPagar = valorParaPagar;
  }

  public PagamentoDTO pagou(Boolean pagou) {
    this.pagou = pagou;
    return this;
  }

  /**
   * Get pagou
   * @return pagou
  */
  
  @Schema(name = "pagou", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("pagou")
  public Boolean getPagou() {
    return pagou;
  }

  public void setPagou(Boolean pagou) {
    this.pagou = pagou;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PagamentoDTO pagamentoDTO = (PagamentoDTO) o;
    return Objects.equals(this.idPedido, pagamentoDTO.idPedido) &&
        Objects.equals(this.total, pagamentoDTO.total) &&
        Objects.equals(this.valorParaPagar, pagamentoDTO.valorParaPagar) &&
        Objects.equals(this.pagou, pagamentoDTO.pagou);
  }

  @Override
  public int hashCode() {
    return Objects.hash(idPedido, total, valorParaPagar, pagou);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PagamentoDTO {\n");
    sb.append("    idPedido: ").append(toIndentedString(idPedido)).append("\n");
    sb.append("    total: ").append(toIndentedString(total)).append("\n");
    sb.append("    valorParaPagar: ").append(toIndentedString(valorParaPagar)).append("\n");
    sb.append("    pagou: ").append(toIndentedString(pagou)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

