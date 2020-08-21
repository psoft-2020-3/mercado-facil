package com.ufcg.psoft.mercadofacil.DTO;

public class LoteDTO {

    private int numeroDeItens;

    public LoteDTO() {
    }

    public LoteDTO(int numeroDeItens, String dataDeValidade) {
        super();
        this.numeroDeItens = numeroDeItens;
    }

    public int getNumeroDeItens() {
        return numeroDeItens;
    }

    public void setNumeroDeItens(int numeroDeItens) {
        this.numeroDeItens = numeroDeItens;
    }
}
