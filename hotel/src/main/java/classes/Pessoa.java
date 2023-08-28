package classes;

public class Pessoa {
    private String nome;
    private String email;
    private String cpf;
    private Endereco endereco;

    //Construtor do funcionario
    public Pessoa(String nome, String email, String cpf, Endereco endereco) {
        this.nome = nome;
        this.email = email;
        this.cpf = cpf;
        this.endereco = endereco;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    public String getCpf() {
        return cpf;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
}
