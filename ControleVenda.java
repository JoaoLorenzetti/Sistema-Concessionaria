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
            System.out.println("\nVenda realizada com sucesso!");
        } catch (CarroJaVendidoException e) {
            System.out.println("\nERRO: " + e.getMessage());
        } catch (EstoqueInsuficienteException e) {
            System.out.println("\nERRO: " + e.getMessage());
            System.out.println("Carros disponíveis: " + e.getCarrosDisponiveis());
        }
    }

    public void exibirRelatorioVendas(Concessionaria concessionaria) {
        System.out.println("\n--- Histórico de Vendas ---");
        if (concessionaria.getVendas().isEmpty()) {
            System.out.println("Nenhuma venda realizada.");
            return;
        }
        
        for (Venda v : concessionaria.getVendas()) {
            exibirRecibo(v);
        }
    }

    public void exibirRelatorioCarros(Concessionaria concessionaria) {
        System.out.println("\n--- Carros Disponíveis ---");
        int contador = 0;
        for (Carro c : concessionaria.getCarros()) {
            if (!c.isVendido()) {
                exibirDetalhes(c);
                System.out.println("----------------------");
                contador++;
            }
        }
        if (contador == 0) {
            System.out.println("Nenhum carro disponível!");
        }
    }

    public void exibirRelatorioPessoas(Concessionaria concessionaria) {
        System.out.println("\n--- Relatório de Pessoas ---");
        System.out.println("1 - Listar Clientes");
        System.out.println("2 - Listar Vendedores");
        System.out.print("Escolha: ");
        
        int opcao = Integer.parseInt(scanner.nextLine());
        
        switch (opcao) {
            case 1:
                exibirListaClientes(concessionaria);
                break;
            case 2:
                exibirListaVendedores(concessionaria);
                break;
            default:
                System.out.println("Opção inválida!");
        }
    }

    private void exibirListaClientes(Concessionaria concessionaria) {
        System.out.println("\n--- Clientes da Concessionária ---");
        if (concessionaria.getClientes().isEmpty()) {
            System.out.println("Nenhum cliente cadastrado.");
            return;
        }
        
        for (Cliente c : concessionaria.getClientes()) {
            exibirInformacoesCliente(c);
            System.out.println("----------------------");
        }
    }

    private void exibirListaVendedores(Concessionaria concessionaria) {
        System.out.println("\n--- Vendedores da Concessionária ---");
        if (concessionaria.getVendedores().isEmpty()) {
            System.out.println("Nenhum vendedor cadastrado.");
            return;
        }
        
        for (Vendedor v : concessionaria.getVendedores()) {
            exibirInformacoesVendedor(v);
            System.out.println("----------------------");
        }
    }

    private void exibirInformacoesCliente(Cliente cliente) {
        System.out.println("Nome: " + cliente.getNome());
        System.out.println("CPF: " + cliente.getCpf());
        System.out.println("Telefone: " + cliente.getTelefone());
        System.out.println("Endereço: " + cliente.getEndereco().getRua() + ", " + 
                          cliente.getEndereco().getNumero() + " - " + //Reflexividade
                          cliente.getEndereco().getCidade() + ", " + cliente.getEndereco().getEstado()); //Reflexividade
        System.out.println("Cliente Premium: " + (cliente.isClientePremium() ? "Sim" : "Não"));
    }

    private void exibirInformacoesVendedor(Vendedor vendedor) {
        System.out.println("ID: " + vendedor.getIdVendedor());
        System.out.println("Nome: " + vendedor.getNome());
        System.out.println("CPF: " + vendedor.getCpf());
        System.out.println("Telefone: " + vendedor.getTelefone());
        System.out.println("Endereço: " + vendedor.getEndereco().getRua() + ", " + 
                          vendedor.getEndereco().getNumero() + " - " + //Reflexividade
                          vendedor.getEndereco().getCidade() + ", " + vendedor.getEndereco().getEstado()); //Reflexividade
        System.out.println("Comissão: " + (vendedor.getComissao() * 100) + "%");
        System.out.println("Vendas Realizadas: " + vendedor.getVendasRealizadas());
    }

    private void exibirDetalhes(Carro carro) {
        System.out.println(carro.obterDetalhes());
    }

    private void exibirRecibo(Venda venda) {
        System.out.println("\n=== RECIBO DE VENDA ===");
        System.out.println("Data: " + venda.getDataVenda());
        System.out.println("\nDados do Carro:");
        System.out.println(venda.getCarro().obterDetalhes());
        System.out.println("\nDados do Cliente:");
        exibirInformacoesCliente(venda.getCliente());
        System.out.println("\nDados do Vendedor:");
        exibirInformacoesVendedor(venda.getVendedor());
        System.out.println("\nValor Final: R$" + venda.getValorFinal());
        System.out.println("Forma de Pagamento: " + venda.getFormaPagamento());
        System.out.println("=======================");
    }
}