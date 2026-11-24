/*
 * Exercicio 06: Ler 5 elementos e inverter o vetor sem criar vetor auxiliar.
 */

import java.util.Scanner;

public class Ex06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] vetorNumeros = new int[5];

        for (int indice = 0; indice < vetorNumeros.length; indice++) {
            System.out.print("Digite o elemento " + indice + ": ");
            vetorNumeros[indice] = sc.nextInt();
        }

        int inicio = 0;
        int fim = vetorNumeros.length - 1;

        while (inicio < fim) {
            int auxiliar = vetorNumeros[inicio];
            vetorNumeros[inicio] = vetorNumeros[fim];
            vetorNumeros[fim] = auxiliar;

            inicio++;
            fim--;
        }

        System.out.println("Vetor invertido:");
        for (int valorAtual : vetorNumeros) {
            System.out.print(valorAtual + " ");
        }
        System.out.println();

        sc.close();
    }
}
