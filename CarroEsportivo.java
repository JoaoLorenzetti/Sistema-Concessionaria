//João Pedro Aleksandrov Lorenzetti

public class CarroEsportivo extends Carro {
    private double velocidadeMaxima;
    private boolean turbo;

    public CarroEsportivo() {
        super();
        velocidadeMaxima = 0;
        turbo = false;
    }

    public void setVelocidadeMaxima(double velocidadeMaxima) {
        if (velocidadeMaxima <= 0) {
            throw new IllegalArgumentException("Velocidade deve ser positiva!");
        }
        this.velocidadeMaxima = velocidadeMaxima;
    }

    public void setTurbo(boolean turbo) {
        this.turbo = turbo;
    }

    public double getVelocidadeMaxima() {
        return velocidadeMaxima;
    }

    public boolean isTurbo() {
        return turbo;
    }

    //Sobrescrita
    @Override
    public double calcularPrecoVenda() {
        double preco = getPrecoBase() * 1.20;
        if (turbo) preco += 15000;
        return preco;
    }

    //Sobrescrita
    @Override
    public void exibirDetalhes() {
    }
}