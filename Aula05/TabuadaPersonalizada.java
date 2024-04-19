import java.util.Scanner;

public class TabuadaPersonalizada {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Insira um número inteiro para o limite da tabuada:");
        int limite = entrada.nextInt();

        System.out.println("Insira um número inteiro:");
        int num = entrada.nextInt();

        for (int i = 1; i <= limite; i++) {
            System.out.println(num + " x " + i + " = " + i * num);
        }
    }
}
