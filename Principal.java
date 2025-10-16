//João Pedro Aleksandrov Lorenzetti

import java.util.Scanner;

public class Principal {
    private static Concessionaria concessionaria;
    private static ControleCarro controleCarro;
    private static ControlePessoa controlePessoa;
    private static ControleVenda controleVenda;
    private static Scanner scanner;

    public static void main(String[] args) {
        inicializarSistema();
        exibirMenuPrincipal();
    }

    private static void inicializarSistema() {
        scanner = new Scanner(System.in);
        concessionaria = new Concessionaria();
        controleCarro = new ControleCarro(scanner);
        controlePessoa = new ControlePessoa(scanner);
        controleVenda = new ControleVenda(scanner);

        System.out.print("Nome da Concessionária: ");
        concessionaria.setNome(scanner.nextLine());
        
        System.out.print("Endereço da Concessionária: ");
        concessionaria.setEndereco(scanner.nextLine());
        
        System.out.println("\nSistema inicializado!");
    }

    private static void exibirMenuPrincipal() {
        boolean continuar = true;

        while (continuar) {
            System.out.println("\n========== MENU PRINCIPAL ==========");
            System.out.println("1 - Cadastro de Dados");
            System.out.println("2 - Realizar Venda");
            System.out.println("3 - Relatórios e Consultas");
            System.out.println("4 - Demonstrar Reflexividade");
            System.out.println("5 - Sair");
            System.out.print("Escolha uma opção: ");

            try {
                int opcao = Integer.parseInt(scanner.nextLine());

                switch (opcao) {
                    case 1:
                        menuCadastro();
                        break;
                    case 2:
                        controleVenda.realizarVendaComDados(concessionaria);
                        break;
                    case 3:
                        menuRelatorios();
                        break;
                    case 4:
                        System.out.println("\nAté logo!");
                        continuar = false;
                        break;
                    default:
                        System.out.println("\nOpção inválida! Tente novamente.");
                }
            } catch (NumberFormatException e) {
                System.out.println("\nEntrada inválida! Digite um número.");
            }
        }
        scanner.close();
    }

    private static void menuCadastro() {
        boolean voltarMenu = false;

        while (!voltarMenu) {
            System.out.println("\n========== MENU DE CADASTRO ==========");
            System.out.println("1 - Cadastrar Carro");
            System.out.println("2 - Cadastrar Cliente");
            System.out.println("3 - Cadastrar Vendedor");
            System.out.println("4 - Voltar ao Menu Principal");
            System.out.print("Escolha uma opção: ");

            try {
                int opcao = Integer.parseInt(scanner.nextLine());

                switch (opcao) {
                    case 1:
                        controleCarro.exibirOpcoesCarro();
                        System.out.print("Escolha: ");
                        int tipoCarro = Integer.parseInt(scanner.nextLine());

                        switch (tipoCarro) {
                            case 1:
                                Carro carroEsportivo = controleCarro.cadastrarCarroEsportivo();
                                concessionaria.cadastrarCarro(carroEsportivo);
                                break;
                            case 2:
                                Carro carroLuxo = controleCarro.cadastrarCarroLuxo();
                                concessionaria.cadastrarCarro(carroLuxo);
                                break;
                            case 3:
                                Carro carroEletrico = controleCarro.cadastrarCarroEletrico();
                                concessionaria.cadastrarCarro(carroEletrico);
                                break;
                            default:
                                System.out.println("\nOpção inválida!");
                        }
                        break;
                    case 2:
                        Cliente cliente = controlePessoa.cadastrarCliente();
                        concessionaria.cadastrarCliente(cliente);
                        break;
                    case 3:
                        Vendedor vendedor = controlePessoa.cadastrarVendedor();
                        concessionaria.cadastrarVendedor(vendedor);
                        break;
                    case 4:
                        voltarMenu = true;
                        break;
                    default:
                        System.out.println("\nOpção inválida! Tente novamente.");
                }
            } catch (NumberFormatException e) {
                System.out.println("\nEntrada inválida! Digite um número.");
            }
        }
    }

    private static void menuRelatorios() {
        boolean voltarMenu = false;

        while (!voltarMenu) {
            System.out.println("\n========== MENU DE RELATÓRIOS ==========");
            System.out.println("1 - Listar Carros Disponíveis");
            System.out.println("2 - Listar Clientes e Vendedores");
            System.out.println("3 - Histórico de Vendas");
            System.out.println("4 - Voltar ao Menu Principal");
            System.out.print("Escolha uma opção: ");

            try {
                int opcao = Integer.parseInt(scanner.nextLine());

                switch (opcao) {
                    case 1:
                        controleVenda.exibirRelatorioCarros(concessionaria);
                        break;
                    case 2:
                        controleVenda.exibirRelatorioPessoas(concessionaria);
                        break;
                    case 3:
                        controleVenda.exibirRelatorioVendas(concessionaria);
                        break;
                    case 4:
                        voltarMenu = true;
                        break;
                    default:
                        System.out.println("\nOpção inválida! Tente novamente.");
                }
            } catch (NumberFormatException e) {
                System.out.println("\nEntrada inválida! Digite um número.");
            }
        }
    }
}