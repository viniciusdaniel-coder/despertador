import java.util.*;
public class Subitrair {

    public static void main (String[]args) {    
    Scanner inputScanner = new Scanner (System.in);
    System.out.println( "Digite o primeiro numero a ser somado com a tecle enter");
    String respostaUsuario = inputScanner.nextLine().trim();
    int numeroUm = Integer.valueOf(respostaUsuario);
    System.out.println( "Digite o segundo número a ser somado e tecle Enter");
    respostaUsuario = inputScanner.nextLine().trim();
    int numeroDois = Integer.valueOf(respostaUsuario);
    System.out.println("O resultado da soma e: " + (numeroUm - numeroDois));
    inputScanner.close();
    


    }
    }

