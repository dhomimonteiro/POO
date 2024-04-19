import java.util.Scanner;

public class Tabuada {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Insira um número inteiro: ");
        int num = entrada.nextInt();

        for (int i = 1; i <= 10; i++){
            System.out.println(num + " x "  + i + " = " + i * num);
        }
    }
}
