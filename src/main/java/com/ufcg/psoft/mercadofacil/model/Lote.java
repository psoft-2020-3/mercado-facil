package com.ufcg.psoft.mercadofacil.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Lote {

	@Id
	@GeneratedValue
    private long id;
	
	@OneToOne
    private Produto produto;
    private int numeroDeItens;

    public Lote() {
        this.id = 0;
    }

    public Lote(Produto produto, int numeroDeItens) {
        super();
        this.produto = produto;
        this.numeroDeItens = numeroDeItens;
    }

    public Lote(long id, Produto produto, int numeroDeItens) {
        this.id = id;
        this.produto = produto;
        this.numeroDeItens = numeroDeItens;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public int getNumeroDeItens() {
        return numeroDeItens;
    }

    public void setNumeroDeItens(int numeroDeItens) {
        this.numeroDeItens = numeroDeItens;
    }

    @Override
    public String toString() {
        return "Lote{" +
                "id=" + id +
                ", produto=" + produto.getId() +
                ", numeroDeItens=" + numeroDeItens + '\'' +
                '}';
    }
}
