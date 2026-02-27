import java.util.*; // importaçao de todas os modulos da biblioteca util
import java.time.*; // importaçao de todas os modulos da biblioteca time

public class Variavel {
  public static void main(String[] args) { // declaraçao de metodo executor main ()
int horaAtual = LocalDateTime.now().getHour(); // declaraçao da variavel horaAtual que vai receber em numero inteiro o resultado da chamada de metedor getHour()
int MinuteAtual = LocalDateTime.now().getMinute(); // declaraçao da variavel minutoAtual que vai receber em numero inteiro o resultado da chamada de metedor getHour()
int secondAtual = LocalDateTime.now().getSecond(); // declaraçao da variavel secondAtual que vai receber em numero inteiro o resultado da chamada de metedor getHour()
// shift + seta para baixo: criar uma copia da linha abaixo
//
System.out.println(horaAtual + MinuteAtual + secondAtual); //impressão variável horaAtual no terminal da saida  do sistema
  // finalizou classe Variavel
  // finalizou metedo executor main ()
}
}