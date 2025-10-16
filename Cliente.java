//João Pedro Aleksandrov Lorenzetti

public class Cliente extends Pessoa {
    private boolean clientePremium;

    public Cliente() {
        super();
        this.clientePremium = false;
    }

    public void setClientePremium(boolean clientePremium) {
        this.clientePremium = clientePremium;
    }

    public boolean isClientePremium() {
        return clientePremium;
    }
}