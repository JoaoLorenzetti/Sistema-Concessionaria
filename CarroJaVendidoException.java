//João Pedro Aleksandrov Lorenzetti

public class CarroJaVendidoException extends Exception {
    public CarroJaVendidoException(String mensagem) {
        super(mensagem);
    }

    public CarroJaVendidoException(String mensagem, Throwable causa) {
        super(mensagem, causa);
    }
}