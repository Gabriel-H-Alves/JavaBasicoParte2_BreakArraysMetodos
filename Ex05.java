/*
 * Exercicio 05: Ler 5 precos em um vetor e encontrar o maior e o menor preco.
 */

import java.util.Scanner;

public class Ex05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double[] listaPrecos = new double[5];

        for (int indice = 0; indice < listaPrecos.length; indice++) {
            System.out.print("Digite o preco " + (indice + 1) + ": ");
            listaPrecos[indice] = sc.nextDouble();
        }

        double maiorPreco = listaPrecos[0];
        double menorPreco = listaPrecos[0];

        for (int indice = 1; indice < listaPrecos.length; indice++) {
            if (listaPrecos[indice] > maiorPreco) {
                maiorPreco = listaPrecos[indice];
            }
            if (listaPrecos[indice] < menorPreco) {
                menorPreco = listaPrecos[indice];
            }
        }

        System.out.println("Maior preco: R$ " + maiorPreco);
        System.out.println("Menor preco: R$ " + menorPreco);

        sc.close();
    }
}
