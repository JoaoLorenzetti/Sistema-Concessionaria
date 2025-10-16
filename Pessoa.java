//João Pedro Aleksandrov Lorenzetti

public abstract class Pessoa {
    private String nome;
    private String cpf;
    private String telefone;
    private Endereco endereco; //Reflexividade

    public Pessoa() {
        this.nome = "";
        this.cpf = "";
        this.telefone = "";
        this.endereco = new Endereco();
    }

    public void setNome(String nome) {
        if (nome == null || nome.trim().isEmpty()) {
            throw new IllegalArgumentException("Nome não pode ser vazio!");
        }
        this.nome = nome;
    }

    public void setCpf(String cpf) {
        if (cpf == null || !cpf.matches("\\d{3}\\.\\d{3}\\.\\d{3}-\\d{2}")) {
            throw new IllegalArgumentException("CPF inválido! Use o formato XXX.XXX.XXX-XX");
        }
        this.cpf = cpf;
    }

    public void setTelefone(String telefone) {
        if (telefone == null || !telefone.matches("\\(\\d{2}\\) \\d{4,5}-\\d{4}")) {
            throw new IllegalArgumentException("Telefone inválido! Use o formato (XX) XXXX-XXXX");
        }
        this.telefone = telefone;
    }

    public void setEndereco(Endereco endereco) {
        if (endereco == null) {
            throw new IllegalArgumentException("Endereço não pode ser nulo!");
        }
        this.endereco = endereco;
    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public String getTelefone() {
        return telefone;
    }

    public Endereco getEndereco() { //Reflexividade
        return endereco;
    }
}