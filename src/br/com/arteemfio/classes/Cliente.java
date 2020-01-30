package br.com.arteemfio.classes;

public class Cliente {

    private String nome;
    private String contato;
    private String comoNosConheceu;

    public Cliente (String nome, String contato, String comoNosConheceu) {
        this.nome = nome;
        this.contato = contato;
        this.comoNosConheceu = comoNosConheceu;
    }

    public String getNome(){
        return this.nome;
    }

    public String getContato() {
        return this.contato;
    }

    public String getComoNosConheceu() {
        return this.comoNosConheceu;
    }

    @Override
    public String toString() {
        return "[ Nome Cliente: " + this.getNome() + " | Contato: " + getContato() + " | Como nos conheceu: " + getComoNosConheceu() + " ]";
    }
}
