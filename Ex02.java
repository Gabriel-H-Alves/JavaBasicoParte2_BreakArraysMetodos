/*
 * Exercicio 02: Imprimir numeros de 1 ate 20 pulando os multiplos de 3
 * utilizando a instrucao continue.
 */

import java.util.Scanner;

public class Ex02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o limite maximo para a contagem: ");
        int limiteMaximo = sc.nextInt();

        for (int contador = 1; contador <= limiteMaximo; contador++) {
            if (contador % 3 == 0) {
                continue;
            }
            System.out.print(contador + " ");
        }
        System.out.println();

        sc.close();
    }
}
