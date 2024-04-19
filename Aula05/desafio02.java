//Cálculo de fatorial

import java.util.Scanner;

public class desafio02 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Insira um número inteiro não negativo: ");
        int num = entrada.nextInt();
        int total = 1;

        for (int i = num; i > 0 ; i--) {
            total = total * i;
        }
        System.out.println("O fatorial de " + num + " é " + total);
    }
}
