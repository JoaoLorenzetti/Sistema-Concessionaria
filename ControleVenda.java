//João Pedro Aleksandrov Lorenzetti

import java.util.Scanner;

public class ControleVenda {
    private Scanner scanner;

    public ControleVenda(Scanner scanner) {
        this.scanner = scanner;
    }

    public void realizarVendaComDados(Concessionaria concessionaria) {
        System.out.println("\n=== Realizar Venda ===");
        
        System.out.print("Placa do Carro (String - Formato ABC-1234): ");
        String placa = scanner.nextLine();
        
        System.out.print("CPF do Cliente (String - Formato XXX.XXX.XXX-XX): ");
        String cpfCliente = scanner.nextLine();
        
        System.out.print("ID do Vendedor (int): ");
        int idVendedor = Integer.parseInt(scanner.nextLine());
        
        System.out.print("Forma de Pagamento (String - À vista, Cartão, Financiamento, Pix): ");
        String formaPagamento = scanner.nextLine();
        
        System.out.print("Desconto (double - Ex: 5000.00): ");
        double desconto = Double.parseDouble(scanner.nextLine());
        
        try {
            concessionaria.realizarVenda(placa, cpfCliente, idVendedor, formaPagamento, desconto);
        } catch (CarroJaVendidoException e) {
            System.out.println("\n❌ ERRO: " + e.getMessage());
        } catch (EstoqueInsuficienteException e) {
            System.out.println("\n❌ ERRO: " + e.getMessage());
            System.out.println("Carros disponíveis: " + e.getCarrosDisponiveis());
        }
    }

    public void exibirRelatorioVendas(Concessionaria concessionaria) {
        concessionaria.listarVendas();
    }

    public void exibirRelatorioCarros(Concessionaria concessionaria) {
        concessionaria.listarCarrosDisponiveis();
    }

    public void exibirRelatorioPessoas(Concessionaria concessionaria) {
        System.out.println("\n--- Relatório de Pessoas ---");
        System.out.println("1 - Listar Clientes");
        System.out.println("2 - Listar Vendedores");
        System.out.print("Escolha: ");
        Scanner scan = new Scanner(System.in);
        int opcao = Integer.parseInt(scan.nextLine());
        
        switch (opcao) {
            case 1:
                concessionaria.listarClientes();
                break;
            case 2:
                concessionaria.listarVendedores();
                break;
            default:
                System.out.println("Opção inválida!");
        }
    }
}