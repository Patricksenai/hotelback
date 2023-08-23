package classes;

public class Pessoa {
    public String nome;
    public String email;
    private String cpf;

    public Pessoa(String nome, String email, String cpf) {
        this.nome = "Nome: " + nome;
        this.email = "Email: " + email;
        this.cpf = "CPF: " + cpf;
    }
    
    public String getCpf() {
        return cpf;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
}
