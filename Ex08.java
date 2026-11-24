/*
 * Exercicio 08: Criar um metodo que recebe dois numeros inteiros e retorna a soma deles.
 */

import java.util.Scanner;

public class Ex08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o primeiro numero: ");
        int numero01 = sc.nextInt();

        System.out.print("Digite o segundo numero: ");
        int numero02 = sc.nextInt();

        int resultadoSoma = somarValores(numero01, numero02);

        System.out.println("Resultado retornado pelo metodo: " + resultadoSoma);

        sc.close();
    }

    public static int somarValores(int primeiroValor, int segundoValor) {
        return primeiroValor + segundoValor;
    }
}
