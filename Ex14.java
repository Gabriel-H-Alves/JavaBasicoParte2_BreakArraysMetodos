/*
 * Exercicio 14: Matriz 3x3 - Ler valores inteiros e calcular a soma da diagonal principal.
 */

import java.util.Scanner;

public class Ex14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] matrizTabela = new int[3][3];

        for (int linha = 0; linha < 3; linha++) {
            for (int coluna = 0; coluna < 3; coluna++) {
                System.out.print("Digite o elemento [" + linha + "][" + coluna + "]: ");
                matrizTabela[linha][coluna] = sc.nextInt();
            }
        }

        int somaDiagonal = 0;
        for (int indice = 0; indice < 3; indice++) {
            somaDiagonal += matrizTabela[indice][indice];
        }

        System.out.println("Soma da diagonal principal: " + somaDiagonal);

        sc.close();
    }
}
