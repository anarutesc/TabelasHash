
import java.math.BigInteger;
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
public class ServerDatabase extends Database {

    public static final ArrayList<ArrayList<Conta>> contas;
    public static final int N = 100;

    static {
        contas = new ArrayList<ArrayList<Conta>>();
        for (int i = 0; i < N; i++) {
            contas.add(new ArrayList<Conta>());
        }
    }

    public static int hashCode(String md5) {
        BigInteger bi = new BigInteger(md5, 16);
        BigInteger m = new BigInteger(Integer.toString(N), 10);
        int pos;
        pos = bi.mod(m).intValue();
        return pos;
    }
    
    public static void insereConta(Conta conta){
        String md5 = conta.getMd5(); //criar o metodo getmd5() em Conta;
        int indice = hashCode(md5);
        ArrayList<Conta> lista = contas.get(indice);
        lista.add(conta);
    }
    
    public static Conta getConta(String md5){
        
    }

    
}
