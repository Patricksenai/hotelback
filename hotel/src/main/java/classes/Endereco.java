package classes;

public class Endereco {
    private String uf;
    private String cidade;
    private String cep;
    private String bairro;
    private String rua;
    private String complemento;
    private int numero;

    public Endereco(String uf, String cidade, String cep, String bairro, String rua, String complemento, int numero) {
        this.uf = uf;
        this.cidade = cidade;
        this.cep = cep;
        this.bairro = bairro;
        this.rua = rua;
        this.complemento = complemento;
        this.numero = numero;
    }


    public String getUf() {
        return uf;
    }
    public void setUf(String uf) {
        this.uf = uf;
    }
    public String getCidade() {
        return cidade;
    }
    public void setCidade(String cidade) {
        this.cidade = cidade;
    }
    public String getCep() {
        return cep;
    }
    public void setCep(String cep) {
        this.cep = cep;
    }
    public String getBairro() {
        return bairro;
    }
    public void setBairro(String bairro) {
        this.bairro = bairro;
    }
    public String getRua() {
        return rua;
    }
    public void setRua(String rua) {
        this.rua = rua;
    }
    public String getComplemento() {
        return complemento;
    }
    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }
    public int getNumero() {
        return numero;
    }
    public void setNumero(int numero) {
        this.numero = numero;
    }
}
