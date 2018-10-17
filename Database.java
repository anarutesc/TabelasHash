
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author C6-PROF
 */
public class Database {

    public static final ArrayList<Letra> caracteres;
    private static char aux;

    static {
        caracteres = new ArrayList<Letra>();

        aux = ' ';
        String aux_s = aux + "";
        Letra l = new Letra(aux_s);
        caracteres.add(l);

        aux = 'a';

        while (aux != 'z') {
            aux_s = aux + "";
            l = new Letra(aux_s);
            caracteres.add(l);
            aux += 1;
        }

        aux_s = aux + "";
        l = new Letra(aux_s);
        caracteres.add(l);

        aux = 'A';

        while (aux != 'Z') {
            aux_s = aux + "";
            l = new Letra(aux_s);
            caracteres.add(l);
            aux += 1;
        }

        aux_s = aux + "";
        l = new Letra(aux_s);
        caracteres.add(l);

        aux = '0';

        while (aux != '9') {
            aux_s = aux + "";
            l = new Letra(aux_s);
            caracteres.add(l);
            aux += 1;
        }

        aux_s = aux + "";
        l = new Letra(aux_s);
        caracteres.add(l);

    }

    public static Letra getLetra(String md5) {
        for (int i = 0; i < caracteres.size(); i++) {
            if (md5.equals(caracteres.get(i).getMd5())) {
                return caracteres.get(i);
            }
        }

        return null;

    }

    public static Conta getConta(String[] md5) {

        String aux_nome = "";
        String aux_saldo = "";

        for (int i = 0; i < md5.length; i++) {
            if (getLetra(md5[i]).getCaractere().matches("\\d")) {
                aux_saldo += getLetra(md5[i]).getCaractere();
            } else {
                aux_nome += getLetra(md5[i]).getCaractere();
            }

        }
        
        Conta conta = new Conta(aux_nome,aux_saldo);
        
        return conta;
    }

}
