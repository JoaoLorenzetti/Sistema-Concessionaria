//João Pedro Aleksandrov Lorenzetti

public class CarroEsportivo extends Carro {
    private double velocidadeMaxima;
    private boolean turbo;

    public CarroEsportivo() {
        super();
        this.velocidadeMaxima = 0;
        this.turbo = false;
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

    public String obterDetalhes() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.obterDetalhes()).append("\n");
        sb.append("Tipo: Esportivo\n");
        sb.append("Velocidade Máxima: ").append(velocidadeMaxima).append(" km/h\n");
        sb.append("Turbo: ").append(turbo ? "Sim" : "Não").append("\n");
        sb.append("Preço de Venda: R$").append(calcularPrecoVenda());
        return sb.toString();
    }
}