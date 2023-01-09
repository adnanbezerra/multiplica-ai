import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        System.out.println("Insira o número que você quer multiplicar:");

        Scanner s = new Scanner(System.in);
        int entrada = s.nextInt();
        s.close();

        System.out.println("Tabela de multiplicação de " + entrada);

        for (int i = 1; i < 11; i++) {
            System.out.println(entrada * i);
        }
    }
}
