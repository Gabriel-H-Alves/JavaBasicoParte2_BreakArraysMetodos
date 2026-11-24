/*
 * Exercicio 16: Metodo recursivo simples para calcular o fatorial de um numero inteiro.
 */

import java.util.Scanner;

public class Ex16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um numero inteiro positivo: ");
        int numeroEscolhido = sc.nextInt();

        if (numeroEscolhido < 0) {
            System.out.println("Numero deve ser positivo.");
        } else {
            long resultadoFatorial = calcularFatorial(numeroEscolhido);
            System.out.println("Fatorial de " + numeroEscolhido + " = " + resultadoFatorial);
        }

        sc.close();
    }

    public static long calcularFatorial(int numeroAtual) {
        if (numeroAtual == 0 || numeroAtual == 1) {
            return 1;
        }
        return numeroAtual * calcularFatorial(numeroAtual - 1);
    }
}
