package classes;

public class Funcionario {
    public String nome;
    private String endereco;
    private String cpf;
    private String cargo;
    private int ctps;


    
    public String getEndereco() {
        return endereco;
    }
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
    public String getCpf() {
        return cpf;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    public String getCargo() {
        return cargo;
    }
    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
    public int getCtps() {
        return ctps;
    }
    public void setCtps(int ctps) {
        this.ctps = ctps;
    }
}
