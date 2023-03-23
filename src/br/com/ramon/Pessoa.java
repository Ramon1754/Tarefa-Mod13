package br.com.ramon;

public abstract class Pessoa {

    private String nome;

    private Double tamanho;

    public Double getTamanho() {
        return tamanho;
    }

    public void setTamanho(Double tamanho) {
        this.tamanho = tamanho;
    }

    public abstract Double imposto();

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
