//João Pedro Aleksandrov Lorenzetti

public abstract class Carro implements Vendavel {
    private String modelo;
    private String marca;
    private int ano;
    private double precoBase;
    private String placa;
    private boolean vendido;

    public Carro() {
        modelo = "";
        marca = "";
        ano = 0;
        precoBase = 0;
        placa = "";
        vendido = false;
    }

    public abstract double calcularPrecoVenda();

    //Sobrescrita
    @Override
    public void exibirDetalhes() {
    }

    public void vender() throws CarroJaVendidoException {
        if (this.vendido) {
            throw new CarroJaVendidoException("Erro: Este carro já foi vendido!");
        }
        this.vendido = true;
    }

    //Sobrecarga
    public void vender(double desconto) throws CarroJaVendidoException {
        if (this.vendido) {
            throw new CarroJaVendidoException("Erro: Este carro já foi vendido!");
        }
        this.vendido = true;
    }

    public void setModelo(String modelo) {
        if (modelo == null || modelo.trim().isEmpty()) {
            throw new IllegalArgumentException("Modelo não pode ser vazio!");
        }
        this.modelo = modelo;
    }

    public void setMarca(String marca) {
        if (marca == null || marca.trim().isEmpty()) {
            throw new IllegalArgumentException("Marca não pode ser vazia!");
        }
        this.marca = marca;
    }

    public void setAno(int ano) {
        if (ano < 1900 || ano > 2100) {
            throw new IllegalArgumentException("Ano inválido!");
        }
        this.ano = ano;
    }

    public void setPrecoBase(double precoBase) {
        if (precoBase <= 0) {
            throw new IllegalArgumentException("Preço deve ser positivo!");
        }
        this.precoBase = precoBase;
    }

    public void setPlaca(String placa) {
        if (placa == null || !placa.matches("[A-Z]{3}-\\d{4}")) {
            throw new IllegalArgumentException("Placa inválida! Use o formato ABC-1234");
        }
        this.placa = placa;
    }

    public void setVendido(boolean vendido) {
        this.vendido = vendido;
    }

    public String getModelo() {
        return modelo;
    }

    public String getMarca() {
        return marca;
    }

    public int getAno() {
        return ano;
    }

    public double getPrecoBase() {
        return precoBase;
    }

    public String getPlaca() {
        return placa;
    }

    public boolean isVendido() {
        return vendido;
    }
}