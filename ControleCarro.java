//João Pedro Aleksandrov Lorenzetti

import java.util.Scanner;

public class ControleCarro {
    private Scanner scanner;

    public ControleCarro(Scanner scanner) {
        this.scanner = scanner;
    }

    public Carro cadastrarCarroEsportivo() {
        CarroEsportivo carro = new CarroEsportivo();
        
        System.out.println("\n=== Cadastro de Carro Esportivo ===");
        
        System.out.print("Marca (String): ");
        carro.setMarca(scanner.nextLine());
        
        System.out.print("Modelo (String): ");
        carro.setModelo(scanner.nextLine());
        
        System.out.print("Ano (int): ");
        carro.setAno(Integer.parseInt(scanner.nextLine()));
        
        System.out.print("Preço Base (double - Ex: 1000.50): ");
        carro.setPrecoBase(Double.parseDouble(scanner.nextLine()));
        
        System.out.print("Placa (String - Formato ABC-1234): ");
        carro.setPlaca(scanner.nextLine());
        
        System.out.print("Velocidade Máxima (double - km/h): ");
        carro.setVelocidadeMaxima(Double.parseDouble(scanner.nextLine()));
        
        System.out.print("Possui Turbo? (s/n): ");
        carro.setTurbo(scanner.nextLine().toLowerCase().equals("s"));
        
        return carro;
    }

    public Carro cadastrarCarroLuxo() {
        CarroLuxo carro = new CarroLuxo();
        
        System.out.println("\n=== Cadastro de Carro de Luxo ===");
        
        System.out.print("Marca (String): ");
        carro.setMarca(scanner.nextLine());
        
        System.out.print("Modelo (String): ");
        carro.setModelo(scanner.nextLine());
        
        System.out.print("Ano (int): ");
        carro.setAno(Integer.parseInt(scanner.nextLine()));
        
        System.out.print("Preço Base (double - Ex: 1000.50): ");
        carro.setPrecoBase(Double.parseDouble(scanner.nextLine()));
        
        System.out.print("Placa (String - Formato ABC-1234): ");
        carro.setPlaca(scanner.nextLine());
        
        System.out.print("Tem Revestimento em Couro? (s/n): ");
        carro.setTemRevestimentoCouro(scanner.nextLine().toLowerCase().equals("s"));
        
        System.out.print("Tem Sistema de Som Premium? (s/n): ");
        carro.setTemSistemaSomPremium(scanner.nextLine().toLowerCase().equals("s"));
        
        return carro;
    }

    public Carro cadastrarCarroEletrico() {
        CarroEletrico carro = new CarroEletrico();
        
        System.out.println("\n=== Cadastro de Carro Elétrico ===");
        
        System.out.print("Marca (String): ");
        carro.setMarca(scanner.nextLine());
        
        System.out.print("Modelo (String): ");
        carro.setModelo(scanner.nextLine());
        
        System.out.print("Ano (int): ");
        carro.setAno(Integer.parseInt(scanner.nextLine()));
        
        System.out.print("Preço Base (double - Ex: 1000.50): ");
        carro.setPrecoBase(Double.parseDouble(scanner.nextLine()));
        
        System.out.print("Placa (String - Formato ABC-1234): ");
        carro.setPlaca(scanner.nextLine());
        
        System.out.print("Autonomia (int - km): ");
        carro.setAutonomia(Integer.parseInt(scanner.nextLine()));
        
        System.out.print("Tempo de Recarga (int - horas): ");
        carro.setTempoRecarga(Integer.parseInt(scanner.nextLine()));
        
        return carro;
    }

    public void exibirOpcoesCarro() {
        System.out.println("\n--- Qual tipo de carro deseja cadastrar? ---");
        System.out.println("1 - Carro Esportivo");
        System.out.println("2 - Carro de Luxo");
        System.out.println("3 - Carro Elétrico");
    }
}