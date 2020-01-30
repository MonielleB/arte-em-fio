package br.com.arteemfio.classes;

public class Produto {

    private String nome;
    private String tipo;
    private Double valor;
    private String status;

    public Produto(String nome, String tipo, Double valor) {
        this.nome = nome;
        this.tipo = tipo;
        this.valor = valor;
        status = "Novo";
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTipo() {
        return this.tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Double getValor() {
        return this.valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public String getStatus() {
        return status;
    }
    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "[ Produto: " + getNome() + " | tipo: " + getTipo() + " | valor: " + getValor() + " | status: " + getStatus() + " ]";
    }

}
