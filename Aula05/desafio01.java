//Escreva um programa em Java que solicite ao usuário um número inteiro positivo e,
// em seguida, calcule e exiba a soma dos N primeiros números pares.

import java.util.Scanner;

public class desafio01 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Insira um limite: ");
        int limite = entrada.nextInt();
        int soma = 0;

        for (int i = 1; i <= limite; i++) {
            if (i % 2 == 0){
                soma = soma + i;
            }
        }
        System.out.println("O resultado final é " + soma);
    }
}
