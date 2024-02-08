package br.com.bs.dao.generic.jdbc.dao;

import java.util.List;

import br.com.bs.dao.generic.jdbc.domain.Cliente;


public interface IClienteDAO {

    public Integer cadastrar(Cliente cliente) throws Exception;

     Integer atualizar(Cliente cliente) throws Exception;

    Cliente consultar(String codigo) throws Exception;

    List<Cliente> buscarTodos() throws Exception;

    Integer excluir(Cliente cliente) throws Exception;
}
