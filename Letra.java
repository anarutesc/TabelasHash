/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author C6-PROF
 */
public class Letra {
    private String caractere;
    private String md5;
    
    Letra(String caractere){
        this.caractere = caractere;
        this.md5 = SecurityProvider.md5(caractere);
        
    }

    public String getCaractere() {
        return caractere;
    }

    public void setCaractere(String caractere) {
        this.caractere = caractere;
    }

    public String getMd5() {
        return md5;
    }

}