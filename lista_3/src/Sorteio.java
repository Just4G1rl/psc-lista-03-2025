import java.util.Random;
import java.util.Scanner;
    public class Sorteio {
    public static void main(String[] args) {

        Scanner scr = new Scanner(System.in);
        Random random = new Random();
        int numero1, numero2;
        int min = 0, max = 0, numeroSorteado = 0;
        
        System.out.println("Informe o primeiro número: ");
        numero1 = scr.nextInt();
        System.out.println("Informe o segundo número: ");
        numero2 = scr.nextInt();

        if(numero1 > numero2){
            max = numero1;
            min = numero2;
        }else{
            max = numero2;
            min = numero1;
        }

        numeroSorteado = random.nextInt(max - min + 1) + min;

        if( numeroSorteado % 2 == 0){
             System.out.println("O número sorteado é o número par: " + numeroSorteado);
        }else{
            System.out.println("O número sorteado é o número impar: " + numeroSorteado);
            scr.close();
        }
    }
}
