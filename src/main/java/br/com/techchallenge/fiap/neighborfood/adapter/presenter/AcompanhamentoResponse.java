package br.com.techchallenge.fiap.neighborfood.adapter.presenter;/*
 * Copyright (c) 2024. MiguelProgrammer
 */


import java.math.BigDecimal;

public class AcompanhamentoResponse {

    private BigDecimal total;

    public AcompanhamentoResponse() {
    }

    public AcompanhamentoResponse(BigDecimal total) {
        this.total = total;
    }

//    public AcompanhamentoResponseDTO pedidoEntityFromResponse(PedidoEntity pedidoEntity) {
//        AcompanhamentoResponseDTO response = new AcompanhamentoResponseDTO();
//        Set<ItemPedido> itensPedido = new HashSet<>();
//        itensPedido.forEach(item -> item.setIdPedido(pedidoEntity.getId()));
//        PedidoRequestDTO request = new PedidoRequestDTO();
//        request.setIdCliente(pedidoEntity.getIdCliente());
//
//        pedidoEntity.getItensProdutos().forEach(item -> {
//            ItemPedido item1 = new ItemPedido();
//            item1.setId(item.getId());
//            item1.setIdPedido(item.getIdPedido());
//            ProdutoDTO produtoDTO = new ProdutoDTO();
//            produtoDTO.setId(item.getIdProduto());
//            produtoDTO.setNome(item.getNome());
//            produtoDTO.setDescricao(item.getDescricao());
//            produtoDTO.setCategoria(CategoriaDTO.valueOf(String.valueOf(item.getCategoria())));
//            produtoDTO.setPreco(item.getPreco());
//            produtoDTO.setImg(item.getImg());
//            item1.setProduto(produtoDTO);
//            itensPedido.add(item1);
//        });
//        request.setItensPedido(itensPedido.stream().toList());
//        response.setTotal(pedidoEntity.getTotal());
//        //this.convertPedidoRequest(request);
//        response.setPedido(request);
//        request.setId(pedidoEntity.getId());
//        return response;
//    }
//
//    public PedidoRequest getPedidoRequest() {
//        return pedidoRequest;
//    }
//
//    public void convertPedidoRequest(PedidoRequest pedidoRequest) {
//        this.pedidoRequest = pedidoRequest;
//    }
//
//    public void setPedidoRequest(PedidoRequest pedidoRequest) {
//        this.pedidoRequest = pedidoRequest;
//    }
//
//
//    public BigDecimal getTotal() {
//        return total;
//    }
//
//    public void setTotal(BigDecimal total) {
//        this.total = total;
//    }
//
//    public PedidoRequest convertPedidoRequest(Pedido pedido) {
//        PedidoRequest request = new PedidoRequest();
//        List<Item> itens = new ArrayList<>();
//        request.setId(pedido.getId());
//        request.setIdCliente(pedido.getIdCliente());
//        pedido.getItensProdutos().forEach(item -> {
//            Item produto = new Item();
//            produto.setId(item.getId());
//            produto.setIdProduto(item.getIdProduto());
//            produto.setIdPedido(item.getIdPedido());
//            produto.setNome(item.getNome());
//            produto.setCategoria(item.getCategoria());
//            produto.setDescricao(item.getDescricao());
//            produto.setPreco(item.getPreco());
//            produto.setImg(item.getImg());
//            itens.add(produto);
//        });
//
//        request.setItensPedido(new HashSet<>(itens));
//        return request;
//    }

}







