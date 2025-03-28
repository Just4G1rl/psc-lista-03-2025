import java.util.Scanner;
import static java.lang.Math.sqrt;
import static java.lang.Math.pow;

public class Equacao_Segundo_Grau {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        double coeficienteA, coeficienteB, coeficienteC;
        double resultado1 = 0,resultado2 = 0, delta = 0;

        System.out.println("Informe o valor para A: ");
        coeficienteA = scr.nextDouble();    
        System.out.println("Informe o valor para B: ");
        coeficienteB = scr.nextDouble(); 
        System.out.println("Informe o valor para C: ");
        coeficienteC = scr.nextDouble(); 

        if(coeficienteA == 0 && coeficienteB == 0 && coeficienteC != 0){
            System.out.println("Coeficientes informados incorretamente.");
        }else if (coeficienteA == 0 && coeficienteB != 0) { 
            resultado1 = -(coeficienteB/coeficienteC);
            System.out.printf("Essa é uma equação de primeiro grau com resultado %.2f", resultado1); 
        }else if (coeficienteA != 0 && coeficienteB == 0 && coeficienteC != 0) {
            resultado1 = sqrt(-coeficienteC/coeficienteA);
            resultado2 = resultado1 - (resultado1*2);
            System.out.println("Essa é uma equação de segundo grau incompleta com resultados: ");
            System.out.printf("x' %.2f", resultado1); 
            System.out.printf("x'' %.2f", resultado2);

        }else if(coeficienteA != 0 && coeficienteB != 0 && coeficienteC == 0){
            resultado1 = 0;
            resultado2 = (-coeficienteB/coeficienteA);
            System.out.println("Essa é uma equação de segundo grau incompleta com resultados: ");
            System.out.printf("x' %.2f", resultado1); 
            System.out.printf("x'' %.2f", resultado2);
        }else{
            delta = pow(coeficienteB, 2) - (4 * coeficienteA * coeficienteC);
            if(delta < 0){
                System.out.println("Esta  equação não possui raízes reais");
            }else if(delta == 0){
                System.out.println("Esta equação possui duas  raízes reais iguais.");
                resultado1 = (-coeficienteB + sqrt(delta))/(2 * coeficienteA);
                resultado2 = (-coeficienteB - sqrt(delta))/(2 * coeficienteA);
                System.out.printf("x' %.2f", resultado1); 
                System.out.printf("x'' %.2f", resultado2);
            }else{
                System.out.println("Esta equação  possui duas raízes reais diferentes.");
                resultado1 = (-coeficienteB + sqrt(delta))/(2 * coeficienteA);
                resultado2 = (-coeficienteB - sqrt(delta))/(2 * coeficienteA);
                System.out.printf("x' %.2f", resultado1); 
                System.out.printf("x'' %.2f", resultado2);
            }   
        }
    scr.close();    
    }
}

