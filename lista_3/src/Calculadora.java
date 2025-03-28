import static java.lang.Math.pow;
import java.util.Scanner;
public class Calculadora {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        char operador;
        double resutado, numero1, numero2;

        System.out.println("Calculadora\nInforme o primeiro numero: ");
        numero1 = scr.nextDouble();
        System.out.println("Informe o segundo número: ");
        numero2 = scr.nextDouble();
        System.out.println("Informe o operador: ");
        operador = scr.next().charAt(0);

        switch (operador) {
            case '+':
                resutado = numero1 + numero2;
                System.out.println("O resultado é :" + resutado);
                break;   
            case '-':
                resutado = numero1 - numero2;
                System.out.println("O resultado é :" + resutado);
                break;
            case '/':
                resutado = numero1 / numero2;
                System.out.println("O resultado é :" + resutado);
                break;
            case '*':
                resutado = numero1 * numero2;
                System.out.println("O resultado é :" + resutado);
                break;
            case '^':
                resutado = pow(numero1, numero2);
                System.out.println("O resultado é :" + resutado);
                break;
            default:

            System.out.println("O símbolo da operação é  inválido.");
                break;
        }
    scr.close();    
    }
}
