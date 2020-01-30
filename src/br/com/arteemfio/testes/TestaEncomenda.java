package br.com.arteemfio.testes;

import br.com.arteemfio.classes.Cliente;
import br.com.arteemfio.classes.Encomenda;
import br.com.arteemfio.classes.Pagamento;
import br.com.arteemfio.classes.Produto;

import java.time.LocalDate;

public class TestaEncomenda {

    public static void main(String[] args) {
        LocalDate localdate = LocalDate.now();
//        System.out.println(localdate);
//        System.out.println("Dia da semana: " + localdate.getDayOfWeek().name());
//        System.out.println("Dia da semana: " + localdate.getDayOfWeek().ordinal());
//        System.out.println("Mes: " + localdate.getMonthValue());
//        System.out.println("Mes: " + localdate.getMonth().name());
//        System.out.println("Ano: " + localdate.getYear());

        Encomenda e = new Encomenda();
        Produto p1 = new Produto("Stich de crochê", "amigurumi", 20.0);
        Produto p2 = new Produto("Mickey de crochê", "amigurumi", 20.0);

        Cliente c = new Cliente("Bia", "não informado", "familia");

        Pagamento pagto = new Pagamento();

        e.setCliente(c);
		e.setData(localdate);
        e.setDataEntrega(localdate);
        e.setDescricao("Encomenda da Bia");
        e.adiciona(p1);
        e.adiciona(p2);
        e.setStatus("Em andamento");
        e.setPagamento(pagto);
        pagto.setData(localdate);
        pagto.setFormaPagto("Transferencia");

        System.out.println(e.toString());
    }

}
