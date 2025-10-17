//João Pedro Aleksandrov Lorenzetti

public class Vendedor extends Pessoa {
    private int idVendedor;
    private double comissao;
    private int vendasRealizadas;

    public Vendedor() {
        super();
        idVendedor = 0;
        comissao = 0;
        vendasRealizadas = 0;
    }

    public void setIdVendedor(int idVendedor) {
        if (idVendedor <= 0) {
            throw new IllegalArgumentException("ID do vendedor deve ser positivo!");
        }
        this.idVendedor = idVendedor;
    }

    public void setComissao(double comissao) {
        if (comissao < 0 || comissao > 0.15) {
            throw new IllegalArgumentException("Comissão inválida! Deve estar entre 0 e 15%");
        }
        this.comissao = comissao;
    }

    public void setVendasRealizadas(int vendasRealizadas) {
        if (vendasRealizadas < 0) {
            throw new IllegalArgumentException("Número de vendas não pode ser negativo!");
        }
        this.vendasRealizadas = vendasRealizadas;
    }

    public int getIdVendedor() {
        return idVendedor;
    }

    public double getComissao() {
        return comissao;
    }

    public int getVendasRealizadas() {
        return vendasRealizadas;
    }

    public void incrementarVendasRealizadas() {
        this.vendasRealizadas++;
    }

    public void registrarVenda(double valorVenda) {
        vendasRealizadas++;
    }
}