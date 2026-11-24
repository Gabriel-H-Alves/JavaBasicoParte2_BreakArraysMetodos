/*
 * Exercicio 13: Criar metodo que busca um numero em um array e retorna o indice ou -1 se nao achar.
 */

import java.util.Scanner;

public class Ex13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] numerosArmazenados = new int[5];

        for (int indice = 0; indice < numerosArmazenados.length; indice++) {
            System.out.print("Digite o elemento " + indice + ": ");
            numerosArmazenados[indice] = sc.nextInt();
        }

        System.out.print("Digite o numero a ser buscado: ");
        int numeroProcurado = sc.nextInt();

        int posicaoEncontrada = pesquisarIndice(numerosArmazenados, numeroProcurado);

        if (posicaoEncontrada != -1) {
            System.out.println("Numero encontrado na posicao " + posicaoEncontrada);
        } else {
            System.out.println("Numero nao encontrado no array.");
        }

        sc.close();
    }

    public static int pesquisarIndice(int[] listaNumeros, int valorBusca) {
        for (int indice = 0; indice < listaNumeros.length; indice++) {
            if (listaNumeros[indice] == valorBusca) {
                return indice;
            }
        }
        return -1;
    }
}
