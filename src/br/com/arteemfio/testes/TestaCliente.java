package br.com.arteemfio.testes;

import br.com.arteemfio.classes.Cliente;

public class TestaCliente {

    public static void main(String[] args) {

        Cliente cliente = new Cliente("Maria Beatriz", "n/a", "familia");

        System.out.println(cliente.toString());

    }
}
