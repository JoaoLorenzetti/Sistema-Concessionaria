//João Pedro Aleksandrov Lorenzetti

import java.util.ArrayList;
import java.util.List;

public class Concessionaria {
    private String nome;
    private String endereco;
    private List<Carro> carros;
    private List<Vendedor> vendedores;
    private List<Cliente> clientes;
    private List<Venda> vendas;

    public Concessionaria() {
        this.nome = "";
        this.endereco = "";
        this.carros = new ArrayList<>();
        this.vendedores = new ArrayList<>();
        this.clientes = new ArrayList<>();
        this.vendas = new ArrayList<>();
    }

    public void setNome(String nome) {
        if (nome == null || nome.trim().isEmpty()) {
            throw new IllegalArgumentException("Nome não pode ser vazio!");
        }
        this.nome = nome;
    }

    public void setEndereco(String endereco) {
        if (endereco == null || endereco.trim().isEmpty()) {
            throw new IllegalArgumentException("Endereço não pode ser vazio!");
        }
        this.endereco = endereco;
    }

    public String getNome() {
        return nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public List<Carro> getCarros() {
        return carros;
    }

    public List<Vendedor> getVendedores() {
        return vendedores;
    }

    public List<Cliente> getClientes() {
        return clientes;
    }

    public List<Venda> getVendas() {
        return vendas;
    }

    public void cadastrarCarro(Carro carro) {
        carros.add(carro);
    }

    public void cadastrarVendedor(Vendedor vendedor) {
        vendedores.add(vendedor);
    }

    public void cadastrarCliente(Cliente cliente) {
        clientes.add(cliente);
    }

    public void realizarVenda(String placaCarro, String cpfCliente, int idVendedor, 
                             String formaPagamento, double desconto) throws CarroJaVendidoException, EstoqueInsuficienteException {
        Carro carro = buscarCarroPorPlaca(placaCarro);
        Cliente cliente = buscarClientePorCpf(cpfCliente);
        Vendedor vendedor = buscarVendedorPorId(idVendedor);

        if (carro == null || cliente == null || vendedor == null) {
            throw new EstoqueInsuficienteException("Não foi possível realizar a venda. Verifique os dados!", contarCarrosDisponiveis());
        }

        if (carro.isVendido()) {
            throw new CarroJaVendidoException("Este carro já foi vendido!");
        }

        double valorFinal = carro.calcularPrecoVenda() - desconto;
        if (cliente.isClientePremium()) {
            valorFinal *= 0.95;
        }

        Venda venda = new Venda();
        venda.setCarro(carro);
        venda.setCliente(cliente);
        venda.setVendedor(vendedor);
        venda.setValorFinal(valorFinal);
        venda.setFormaPagamento(formaPagamento);
        vendas.add(venda);

        carro.vender(desconto);
        vendedor.registrarVenda(valorFinal);
    }

    private Carro buscarCarroPorPlaca(String placa) {
        for (Carro carro : carros) {
            if (carro.getPlaca().equals(placa)) {
                return carro;
            }
        }
        return null;
    }

    private Cliente buscarClientePorCpf(String cpf) {
        for (Cliente cliente : clientes) {
            if (cliente.getCpf().equals(cpf)) {
                return cliente;
            }
        }
        return null;
    }

    private Vendedor buscarVendedorPorId(int id) {
        for (Vendedor vendedor : vendedores) {
            if (vendedor.getIdVendedor() == id) {
                return vendedor;
            }
        }
        return null;
    }

    private int contarCarrosDisponiveis() {
        int contador = 0;
        for (Carro carro : carros) {
            if (!carro.isVendido()) {
                contador++;
            }
        }
        return contador;
    }
}