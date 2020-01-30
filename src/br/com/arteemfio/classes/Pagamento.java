package br.com.arteemfio.classes;

import java.time.LocalDate;

public class Pagamento {

    private LocalDate data;
    private String formaPagto;

    public LocalDate getData() {
        return this.data;
    }
    public void setData(LocalDate data) {
        this.data = data;
    }

    public String getFormaPagto() {
        return this.formaPagto;
    }
    public void setFormaPagto(String formaPagto) {
        this.formaPagto = formaPagto;
    }

    @Override
    public String toString() {
        return "Pagamento [" +
                " Data = " + data +
                ", Forma Pagto = '" + formaPagto + '\'' +
                '}';
    }
}
