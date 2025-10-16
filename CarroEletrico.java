//João Pedro Aleksandrov Lorenzetti

public class CarroEletrico extends Carro {
    private int autonomia;
    private int tempoRecarga;

    public CarroEletrico() {
        super();
        this.autonomia = 0;
        this.tempoRecarga = 0;
    }

    public void setAutonomia(int autonomia) {
        if (autonomia <= 0) {
            throw new IllegalArgumentException("Autonomia deve ser positiva!");
        }
        this.autonomia = autonomia;
    }

    public void setTempoRecarga(int tempoRecarga) {
        if (tempoRecarga <= 0) {
            throw new IllegalArgumentException("Tempo de recarga deve ser positivo!");
        }
        this.tempoRecarga = tempoRecarga;
    }

    public int getAutonomia() {
        return autonomia;
    }

    public int getTempoRecarga() {
        return tempoRecarga;
    }

    //Sobrescrita
    @Override
    public double calcularPrecoVenda() {
        double preco = getPrecoBase() * 1.15;
        if (autonomia > 400) {
            preco += 10000;
        }
        return preco;
    }

    //Sobrescrita
    @Override
    public void exibirDetalhes() {
    }

    public String obterDetalhes() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.obterDetalhes()).append("\n");
        sb.append("Tipo: Elétrico\n");
        sb.append("Autonomia: ").append(autonomia).append(" km\n");
        sb.append("Tempo de Recarga: ").append(tempoRecarga).append(" horas\n");
        sb.append("Preço de Venda: R$").append(calcularPrecoVenda());
        return sb.toString();
    }
}