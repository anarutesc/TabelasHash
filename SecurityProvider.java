
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author C6-PROF
 */
public class SecurityProvider {

    public static String salt = "5a1t";

    public static String md5(String stringToConvert) {
        String hashtext = "";
        stringToConvert += salt;
        MessageDigest m;
        try {
            m = MessageDigest.getInstance("MD5");
            m.reset();
            m.update(stringToConvert.getBytes());
            byte[] digest = m.digest();
            BigInteger bigInt = new BigInteger(1, digest);
            hashtext = bigInt.toString(16);
        } catch (NoSuchAlgorithmException ex) {
            Logger.getLogger(SecurityProvider.class.getName()).log(Level.SEVERE, null, ex);
        }
        return hashtext;
    }
    
    public static String md5ToServer(Conta conta){
        String cat = conta.getAgencia() + conta.getNumero() + conta.getSenha();
        cat += salt;
        
        return md5(cat);
    }
    
    public static String[] md5ToClient(Conta conta){
        
    }
}
