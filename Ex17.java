/*
 * Exercicio 17: Metodo que recebe um array de inteiros e exibe os elementos em ordem crescente
 * utilizando ordenacao por bolha (bubble sort).
 */

import java.util.Scanner;

public class Ex17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] vetorDesordenado = new int[5];

        for (int indice = 0; indice < vetorDesordenado.length; indice++) {
            System.out.print("Digite o numero da posicao " + indice + ": ");
            vetorDesordenado[indice] = sc.nextInt();
        }

        ordenarVetor(vetorDesordenado);

        System.out.println("Vetor ordenado:");
        for (int elementoAtual : vetorDesordenado) {
            System.out.print(elementoAtual + " ");
        }
        System.out.println();

        sc.close();
    }

    public static void ordenarVetor(int[] vetorParaOrdenar) {
        for (int passo = 0; passo < vetorParaOrdenar.length - 1; passo++) {
            for (int comparacao = 0; comparacao < vetorParaOrdenar.length - 1 - passo; comparacao++) {
                if (vetorParaOrdenar[comparacao] > vetorParaOrdenar[comparacao + 1]) {
                    int auxiliar = vetorParaOrdenar[comparacao];
                    vetorParaOrdenar[comparacao] = vetorParaOrdenar[comparacao + 1];
                    vetorParaOrdenar[comparacao + 1] = auxiliar;
                }
            }
        }
    }
}
