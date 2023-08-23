package classes;

import java.util.Scanner;

public class Hotel {
    public String nomeHotel;
    public String endereco;
    private String cnpj;

    public Hotel(String nomeHotel, String endereco) {
        System.out.println("");
        this.nomeHotel = "Nome do hotel: " + nomeHotel;
        this.endereco = "Endereço do Hotel: " + endereco;
        perguntaCnpj();
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = "CNPJ: " + cnpj;
    }

    public boolean validaCnpj(String cnpj) {
        if(cnpj.length() == 14) {
            return true;
        } else {
            return false;
        }
    }

    public void perguntaCnpj () {
        String cnpjDigitado = "";
        
        while(!validaCnpj(cnpjDigitado)) {

            System.out.println("Escreva seu cnpj: ");
            Scanner sc = new Scanner(System.in);
            cnpjDigitado = sc.nextLine();
            
        }  
        setCnpj(cnpjDigitado);
        System.out.println("");
    }
}
