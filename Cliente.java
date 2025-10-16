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

    //Sobrescrita
    @Override
    public void exibirInformacoes() {
        System.out.println("\n--- Informações do Cliente ---");
        System.out.println("Nome: " + getNome());
        System.out.println("CPF: " + getCpf());
        System.out.println("Telefone: " + getTelefone());
        System.out.println("Endereço: ");
        getEndereco().exibirEndereco(); //Reflexividade
        System.out.println("Cliente Premium: " + (clientePremium ? "Sim" : "Não"));
    }
}