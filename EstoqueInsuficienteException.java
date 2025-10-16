//João Pedro Aleksandrov Lorenzetti

public class EstoqueInsuficienteException extends Exception {
    private int carrosDisponiveis;

    public EstoqueInsuficienteException(String mensagem) {
        super(mensagem);
        this.carrosDisponiveis = 0;
    }

    public EstoqueInsuficienteException(String mensagem, int carrosDisponiveis) {
        super(mensagem);
        this.carrosDisponiveis = carrosDisponiveis;
    }

    public int getCarrosDisponiveis() {
        return carrosDisponiveis;
    }
}