/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ana_r
 */
public class main {
    //########################## TESTES ########################

    public static void test() {
        Conta c1 = new Conta("124", "333", "1234", "10", "john doe");
        System.out.println(c1);
        Conta c2 = new Conta("John Doe", "10");
        System.out.println(c2);
        Conta c3 = new Conta("123", "321", "666");
        System.out.println(c3);
    }

    public static void test6() {
        Letra l = new Letra("a");
        String md5 = l.getMd5();
        System.out.println(md5);
        Letra ll = Database.getLetra(md5);
        System.out.println(ll.getCaractere());
    }

    public static void test5() {
        Conta c = new Conta("124", "333", "1234", "10", "john doe");
        ServerDatabase.insereConta(c);
        String chave = SecurityProvider.md5ToServer(c);
        Conta conta = ServerDatabase.getConta(chave);
        String chars[];
        chars = SecurityProvider.md5ToClient(conta);
        System.out.println(Database.getConta(chars));
    }

    public static void main(String[] args) {
        test5();

    }
}
