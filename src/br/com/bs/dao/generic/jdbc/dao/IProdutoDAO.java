package br.com.bs.dao.generic.jdbc.dao;

import java.util.List;

import br.com.bs.dao.generic.jdbc.domain.Produto;

public interface IProdutoDAO {
    Integer cadastrarProduto(Produto produto) throws Exception;

    Integer atalizarProduto(Produto produto) throws Exception;

    Produto consultarProduto(String codigo) throws Exception;

    Integer excluirProduto(Produto produto) throws Exception;

    List<Produto> buscarTodosProdutos() throws Exception;
}
