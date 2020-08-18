package com.ufcg.psoft.estoquefacil.DTO;

public class LoteDTO {

    private int numeroDeItens;
    private String dataDeValidade;

    public LoteDTO() {
    }

    public LoteDTO(int numeroDeItens, String dataDeValidade) {
        super();
        this.numeroDeItens = numeroDeItens;
        this.dataDeValidade = dataDeValidade;
    }

    public int getNumeroDeItens() {
        return numeroDeItens;
    }

    public void setNumeroDeItens(int numeroDeItens) {
        this.numeroDeItens = numeroDeItens;
    }

    public String getDataDeValidade() {
        return dataDeValidade;
    }

    public void setDataDeValidade(String dataDeValidade) {
        this.dataDeValidade = dataDeValidade;
    }
}
