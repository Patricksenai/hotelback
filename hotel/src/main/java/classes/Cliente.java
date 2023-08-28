package classes;

public class Cliente extends Pessoa {
    private String numeroCartaoFidelidade;

    public Cliente(String nome, String email, String cpf, Endereco endereco) {
        super(nome, email, cpf, endereco);
        this.numeroCartaoFidelidade = numeroCartaoFidelidade;
    }

    public String getNumeroCartaoFidelidade() {
        return numeroCartaoFidelidade;
    }

    public void setNumeroCartaoFidelidade(String numeroCartaoFidelidade) {
        this.numeroCartaoFidelidade = numeroCartaoFidelidade;
    }

}
