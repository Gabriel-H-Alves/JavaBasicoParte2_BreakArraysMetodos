/*
 * Exercicio 09: Criar um metodo que verifica se um numero e par, retornando boolean.
 */

import java.util.Scanner;

public class Ex09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um numero inteiro: ");
        int numeroVerificado = sc.nextInt();

        boolean ehPar = verificarPar(numeroVerificado);

        if (ehPar) {
            System.out.println("O numero " + numeroVerificado + " e par.");
        } else {
            System.out.println("O numero " + numeroVerificado + " e impar.");
        }

        sc.close();
    }

    public static boolean verificarPar(int numeroRecebido) {
        return numeroRecebido % 2 == 0;
    }
}
