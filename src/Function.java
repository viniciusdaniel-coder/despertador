import java.util.*;
public class Function {
    public static void main(String[] args) {
        Scanner  inputScanner = new Scanner(System.in);
        System.out.println("Digite sua idade, para avaliar seu pedido de aposentadoria, depois tecle Enter");
        Integer idade = inputScanner.nextInt();
        System.out.println("Você esta" + validarAposentadoria(idade) + "para iniciar sua aposentadoria.");
        inputScanner.close();
    }   

    public static String validarAposentadoria (Integer idade) {
        if (idade >=65){
            return "apto";
        } else {
            return "Inapto";
        }
    }
}
