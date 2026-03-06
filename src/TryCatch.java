import java.util.*;

public class TryCatch {
    public static void main(String[] args) {
        try {
        Scanner inputScanner = new Scanner (System.in);
        System.out.println("digite um número");
        int respostaUsuario = inputScanner.nextInt();
        System.out.println("O número digiado e: " + respostaUsuario);
        inputScanner.close();
        } catch (Exception e) {
            System.out.println("Ops! Você nao digitou um numero... Erro" + e);
            }   
}
}
