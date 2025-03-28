import java.util.Scanner;
public class ATM {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        double valorPago, valorProduto, troco;
        int quantNota50  = 0, quantNota20 = 0, quantNota10 = 0, quantNota5 = 0, quantNota2 = 0,  quantNota1 = 0;
        valorProduto = 48;
        troco = 0;

        System.out.println("Informe o valor que será pago: ");
        valorPago = scr.nextDouble();

        if(valorPago < valorProduto){
            System.out.printf("Está faltando R$%.2f para completar o pagamento.", (valorProduto - valorPago));
        }else{
            troco = valorPago - valorProduto;
        }

        System.out.printf("\nValor pago: R$ %.2f", valorPago);
        System.out.printf("\nValor da compra: R$ %.2f", valorProduto);
        System.out.printf("\nTroco: R$ %.2f\n", troco);

        while (troco >= 50) {
            quantNota50 ++;
            troco -= 50;
        }
        while (troco >= 20) {
            quantNota20 ++;
            troco -= 20;
        }
        while (troco >= 10) {
            quantNota10 ++;
            troco -= 10;
        }
        while (troco >= 5) {
            quantNota5 ++;
            troco -= 5;

        }
        while (troco >= 2) {
            quantNota2 ++;
            troco -= 2;

        }
        while (troco >= 1) {
            quantNota1 ++;
            troco -= 1;
        }

        System.out.println("Notas de R$ 50,00: "+ quantNota50);
        System.out.println("Notas de R$ 20,00: "+ quantNota20);
        System.out.println("Notas de R$ 10,00: "+ quantNota10);
        System.out.println("Notas de R$ 5,00: "+ quantNota5);
        System.out.println("Notas de R$ 2,00: "+ quantNota2);
        System.out.println("Notas de R$ 1,00: "+ quantNota1);

        scr.close();
    }
    
}