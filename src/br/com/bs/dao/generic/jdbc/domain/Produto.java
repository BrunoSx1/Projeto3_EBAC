package br.com.bs.dao.generic.jdbc.domain;

import java.util.Objects;

import br.com.bs.dao.generic.jdbc.dao.ProdutoDAO;

public class Produto {
    private Long id;
    private String codigo;
    private String nome;
    private String estadoSigla;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEstadoSigla() {
        return estadoSigla;
    }

    public void setEstadoSigla(String estadoSigla) {
        this.estadoSigla = estadoSigla;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Produto produto = (Produto) o;
        return Objects.equals(id, produto.id) && Objects.equals(codigo, produto.codigo) && Objects.equals(nome, produto.nome) && Objects.equals(estadoSigla, produto.estadoSigla);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, codigo, nome, estadoSigla);
    }
}
