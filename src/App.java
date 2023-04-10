import java.util.Scanner;

/* Nome do Aluno: Lukas santos rufino
* RA: 12723134472
* Data: 09/04/2023 */

public class App {
    public static void main(String[] args) throws Exception {

    Scanner entrada = new Scanner(System.in);
       
    System.out.print("Qual a sua altura");
    double altura = entrada.nextDouble();

    System.out.printf("O seu peso ideal é: %.2f" , ((72.7*altura) - 58));
    entrada.close();
   }
}