package br.com.arteemfio.classes;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Encomenda {

    private LocalDate data;
    private String descricao;
    private Cliente cliente;
    private Pagamento pagamento;
    private String status;
    private List<Produto> produtos = new ArrayList<Produto>();
    private LocalDate dataEntrega;


    public LocalDate getData() {
        return this.data;
    }
    public void setData(LocalDate data) {
        this.data = data;
    }


    public String getDescricao() {
        return this.descricao;
    }
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Cliente getCliente() {
        return this.cliente;
    }
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;

    }

    public String getStatus() {
        return this.status;
    }
    public void setStatus(String status) {
        this.status = status;
    }

    public Pagamento getPagamento() {
        return this.pagamento;
    }

    public void setPagamento(Pagamento pagamento) {
        this.pagamento = pagamento;
    }

    public List<Produto> getProdutos() {
        return produtos;
    }
    public void adiciona(Produto produto) {
        this.produtos.add(produto);
    }

    public LocalDate getDataEntrega() {
        return this.dataEntrega;
    }
    public void setDataEntrega(LocalDate dataEntrega) {
        this.dataEntrega = dataEntrega;
    }

    @Override
    public String toString() {
        return "[ Data da encomenda: " + getData() + " | status da encomenda: " + getStatus() + " | data da entrega: " + getDataEntrega() + " | descricao: " + getDescricao() + " ]" +
                "\n[ Cliente: " + getCliente().toString() + "]" +
                "\n[ Produto: " + getProdutos().toString() + "]" +
                "\n[ Pagamento: " + getPagamento().toString() + "]";

    }

}
