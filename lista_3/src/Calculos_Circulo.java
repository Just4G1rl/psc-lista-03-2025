import java.util.Scanner;
import static java.lang.Math.pow;
public class Calculos_Circulo {
    public static void main(String[] args) throws Exception {
        Scanner scr = new Scanner(System.in);
        int indicadorOperacao;
        double raioCirculo;
        double perimetro = 0, area = 0, volume = 0,  pi = 3.141592; 

        System.out.println("Digite 1, 2 ou 3 para realizar a operação desejada: ");
        indicadorOperacao = scr.nextInt();
        System.out.println("Informe um valor para o raio do circulo: ");
        raioCirculo = scr.nextDouble();

        switch (indicadorOperacao) {
            case 1:
                perimetro = 2*pi*raioCirculo;
                System.out.printf("O perimetro do círculo é %.2fcm", perimetro);
                break;
            case 2:
                area = pi * pow(raioCirculo,2 );
                System.out.printf("A área do cículo é %.2fcm²", area);
                break;
            case 3:
                volume = (4/3*pi)*(pow(raioCirculo, 3));
                System.out.printf("O volume do cículo é %.2fcm³", volume);
                break;
            default:
            System.out.println("O código da operação é invalido");
                break;
            }

        scr.close();    
    }
}
