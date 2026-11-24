/*
 * Exercicio 01: Ler numeros inteiros continuamente ate que o usuario digite 0,
 * utilizando o comando break para interromper o laco.
 */

import java.util.Scanner;

public class Ex01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int somaTotal = 0;

        while (true) {
            System.out.print("Digite um numero (0 para sair): ");
            int numeroDigitado = sc.nextInt();

            if (numeroDigitado == 0) {
                break;
            }

            somaTotal += numeroDigitado;
        }

        System.out.println("Soma total dos numeros informados: " + somaTotal);

        sc.close();
    }
}
