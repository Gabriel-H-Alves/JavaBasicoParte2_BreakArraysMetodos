/*
 * Exercicio 12: Criar metodo que recebe um array de doubles e retorna a media dos valores.
 */

import java.util.Scanner;

public class Ex12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double[] notasSemestre = new double[4];

        for (int indice = 0; indice < notasSemestre.length; indice++) {
            System.out.print("Digite a nota " + (indice + 1) + ": ");
            notasSemestre[indice] = sc.nextDouble();
        }

        double mediaFinal = calcularMediaArray(notasSemestre);

        System.out.println("Media calculada pelo metodo: " + mediaFinal);

        sc.close();
    }

    public static double calcularMediaArray(double[] vetorValores) {
        double somaValores = 0.0;
        for (double valorAtual : vetorValores) {
            somaValores += valorAtual;
        }
        return somaValores / vetorValores.length;
    }
}
