package br.com.arteemfio.testes;

import br.com.arteemfio.classes.Produto;

public class TestaProduto {

    public static void main(String[] args) {

        Produto produto = new Produto("Stich", "Amigurumi", 15.0);

        System.out.println(produto.toString());

        produto.setStatus("Em andamento");

        System.out.println(produto.toString());

        produto.setStatus("Finalizado");

        System.out.println(produto.toString());
    }
}
