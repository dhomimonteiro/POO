import java.util.Scanner;

//Escreva um programa em Java que solicite ao usuário um
// número inteiro positivo N e que conte e exiba o número de
// dígitos desse número.
public class desafio03 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Insira um número inteiro positivo: ");
        int num = entrada.nextInt();
        int i;

        for (i = 0; num != 0; i++){
            num /= 10;
        }
        System.out.println("O número de dígitos é " + i);
    }
}
