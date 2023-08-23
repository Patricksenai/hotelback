package classes;

import java.util.Scanner;

public class Hotel {
    public String nomeHotel;
    public String endereco;
    private int cnpj;

    public Hotel(String nomeHotel) {
        Scanner sc = new Scanner(System.in);
        this.nomeHotel = nomeHotel;
    }

    public int getCnpj() {
        return cnpj;
    }
    public void setCnpj(int cnpj) {
        this.cnpj = cnpj;
    }

}
