package classes;

public class Funcionario extends Pessoa {
    public String cargo;
    private String ctps;
    
    public Funcionario(String nome, String email, String cpf, String cargo, String ctps) {
        super(nome, email, cpf);
        this.cargo = cargo;
        this.ctps = ctps;
    }

    public String getCtps() {
        return ctps;
    }

    public void setCtps(String ctps) {
        this.ctps = ctps;
    }

}
