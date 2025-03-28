import java.util.Scanner;
public class Maior_Menor {
    public static void main(String[] args) {
        Scanner scr = new Scanner (System.in);

        int numero1, numero2, numero3, media;
        int maior = 0, menor =0;
        
        System.out.println("Informe o primeiro número: ");
        numero1 = scr.nextInt();
        System.out.println("Informe o segundo número: ");
        numero2 = scr.nextInt();
        System.out.println("Informe o terceiro número: ");
        numero3 = scr.nextInt();
        scr.close();

        media = (numero1+numero2+numero3)/3;

        if(numero1 > numero2 && numero1 > numero3){
            maior = numero1;
        }else if(numero2 > numero1 && numero2 > numero3){
            maior = numero2;
        }else if( numero3 > numero1 && numero3 > numero2){
            maior = numero3;
        }


        if(numero1 < numero2 && numero1 < numero3){
            menor = numero1;
        }else if(numero2 < numero1 && numero2 < numero3){
            menor = numero2;
        }else if( numero3 < numero1 && numero3 < numero2){
            menor = numero3;
        }

        System.out.println("O maior número é " + maior);
        System.out.println("O menor número é " + menor);
        System.out.println("a média dos três números é " + media);

        scr.close();
    }
}
