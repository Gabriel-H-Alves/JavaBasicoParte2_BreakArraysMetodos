/*
 * Exercicio 04: Ler 6 numeros inteiros em um vetor e contar quantos sao pares e quantos sao impares.
 */

import java.util.Scanner;

public class Ex04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] numerosInformados = new int[6];
        int quantidadePares = 0;
        int quantidadeImpares = 0;

        for (int indice = 0; indice < numerosInformados.length; indice++) {
            System.out.print("Digite o numero da posicao " + indice + ": ");
            numerosInformados[indice] = sc.nextInt();

            if (numerosInformados[indice] % 2 == 0) {
                quantidadePares++;
            } else {
                quantidadeImpares++;
            }
        }

        System.out.println("Total de numeros pares: " + quantidadePares);
        System.out.println("Total de numeros impares: " + quantidadeImpares);

        sc.close();
    }
}
