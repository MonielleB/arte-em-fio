package br.com.arteemfio.testes;

import br.com.arteemfio.classes.Pagamento;

import java.time.LocalDate;

public class TestaPagamento {

    public static void main(String[] args) {
        Pagamento pag = new Pagamento();
        LocalDate data = LocalDate.now();
        pag.setData(data);
        pag.setFormaPagto("Cartao");

        System.out.println(pag);
        System.out.println(pag.toString());
    }
}
