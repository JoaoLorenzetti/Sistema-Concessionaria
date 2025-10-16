//João Pedro Aleksandrov Lorenzetti

import java.util.Scanner;

public class ControlePessoa {
    private Scanner scanner;

    public ControlePessoa(Scanner scanner) {
        this.scanner = scanner;
    }

    public Cliente cadastrarCliente() {
        Cliente cliente = new Cliente();
        
        System.out.println("\n=== Cadastro de Cliente ===");
        
        System.out.print("Nome (String): ");
        cliente.setNome(scanner.nextLine());
        
        System.out.print("CPF (String - Formato XXX.XXX.XXX-XX): ");
        cliente.setCpf(scanner.nextLine());
        
        System.out.print("Telefone (String - Formato (XX) XXXX-XXXX ou (XX) XXXXX-XXXX): ");
        cliente.setTelefone(scanner.nextLine());
        
        System.out.println("\n--- Dados do Endereço ---");
        System.out.print("Rua (String): ");
        cliente.getEndereco().setRua(scanner.nextLine()); //Reflexividade
        
        System.out.print("Número (String): ");
        cliente.getEndereco().setNumero(scanner.nextLine()); //Reflexividade
        
        System.out.print("Cidade (String): ");
        cliente.getEndereco().setCidade(scanner.nextLine()); //Reflexividade
        
        System.out.print("Estado (String): ");
        cliente.getEndereco().setEstado(scanner.nextLine()); //Reflexividade
        
        System.out.print("CEP (String - Formato XXXXX-XXX): ");
        cliente.getEndereco().setCep(scanner.nextLine()); //Reflexividade
        
        System.out.print("É Cliente Premium? (s/n): ");
        cliente.setClientePremium(scanner.nextLine().toLowerCase().equals("s"));
        
        return cliente;
    }

    public Vendedor cadastrarVendedor() {
        Vendedor vendedor = new Vendedor();
        
        System.out.println("\n=== Cadastro de Vendedor ===");
        
        System.out.print("Nome (String): ");
        vendedor.setNome(scanner.nextLine());
        
        System.out.print("CPF (String - Formato XXX.XXX.XXX-XX): ");
        vendedor.setCpf(scanner.nextLine());
        
        System.out.print("Telefone (String - Formato (XX) XXXX-XXXX ou (XX) XXXXX-XXXX): ");
        vendedor.setTelefone(scanner.nextLine());
        
        System.out.println("\n--- Dados do Endereço ---");
        System.out.print("Rua (String): ");
        vendedor.getEndereco().setRua(scanner.nextLine()); //Reflexividade
        
        System.out.print("Número (String): ");
        vendedor.getEndereco().setNumero(scanner.nextLine()); //Reflexividade
        
        System.out.print("Cidade (String): ");
        vendedor.getEndereco().setCidade(scanner.nextLine()); //Reflexividade
        
        System.out.print("Estado (String): ");
        vendedor.getEndereco().setEstado(scanner.nextLine()); //Reflexividade
        
        System.out.print("CEP (String - Formato XXXXX-XXX): ");
        vendedor.getEndereco().setCep(scanner.nextLine()); //Reflexividade
        
        System.out.print("ID do Vendedor (int): ");
        vendedor.setIdVendedor(Integer.parseInt(scanner.nextLine()));
        
        System.out.print("Comissão (double - Ex: 0.05 para 5%): ");
        vendedor.setComissao(Double.parseDouble(scanner.nextLine()));
        
        return vendedor;
    }
}