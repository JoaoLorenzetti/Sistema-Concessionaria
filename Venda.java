//João Pedro Aleksandrov Lorenzetti

import java.time.LocalDate;

public class Venda {
    private Carro carro;
    private Cliente cliente;
    private Vendedor vendedor;
    private LocalDate dataVenda;
    private double valorFinal;
    private String formaPagamento;

    public Venda() {
        this.carro = null;
        this.cliente = null;
        this.vendedor = null;
        this.dataVenda = LocalDate.now();
        this.valorFinal = 0;
        this.formaPagamento = "";
    }

    public void setCarro(Carro carro) {
        if (carro == null) {
            throw new IllegalArgumentException("Carro não pode ser nulo!");
        }
        this.carro = carro;
    }

    public void setCliente(Cliente cliente) {
        if (cliente == null) {
            throw new IllegalArgumentException("Cliente não pode ser nulo!");
        }
        this.cliente = cliente;
    }

    public void setVendedor(Vendedor vendedor) {
        if (vendedor == null) {
            throw new IllegalArgumentException("Vendedor não pode ser nulo!");
        }
        this.vendedor = vendedor;
    }

    public void setValorFinal(double valorFinal) {
        if (valorFinal <= 0) {
            throw new IllegalArgumentException("Valor final deve ser positivo!");
        }
        this.valorFinal = valorFinal;
    }

    public void setFormaPagamento(String formaPagamento) {
        if (formaPagamento == null || formaPagamento.trim().isEmpty()) {
            throw new IllegalArgumentException("Forma de pagamento não pode ser vazia!");
        }
        this.formaPagamento = formaPagamento;
    }

    public Carro getCarro() {
        return carro;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public Vendedor getVendedor() {
        return vendedor;
    }

    public LocalDate getDataVenda() {
        return dataVenda;
    }

    public double getValorFinal() {
        return valorFinal;
    }

    public String getFormaPagamento() {
        return formaPagamento;
    }
}