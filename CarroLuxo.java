//João Pedro Aleksandrov Lorenzetti

public class CarroLuxo extends Carro {
    private boolean temRevestimentoCouro;
    private boolean temSistemaSomPremium;

    public CarroLuxo() {
        super();
        this.temRevestimentoCouro = false;
        this.temSistemaSomPremium = false;
    }

    public void setTemRevestimentoCouro(boolean temRevestimentoCouro) {
        this.temRevestimentoCouro = temRevestimentoCouro;
    }

    public void setTemSistemaSomPremium(boolean temSistemaSomPremium) {
        this.temSistemaSomPremium = temSistemaSomPremium;
    }

    public boolean isTemRevestimentoCouro() {
        return temRevestimentoCouro;
    }

    public boolean isTemSistemaSomPremium() {
        return temSistemaSomPremium;
    }

    //Sobrescrita
    @Override
    public double calcularPrecoVenda() {
        double preco = getPrecoBase() * 1.30;
        if (temRevestimentoCouro) {
            preco += 10000;
        }
        if (temSistemaSomPremium) {
            preco += 8000;
        }
        return preco;
    }

    //Sobrescrita
    @Override
    public void exibirDetalhes() {
    }
}