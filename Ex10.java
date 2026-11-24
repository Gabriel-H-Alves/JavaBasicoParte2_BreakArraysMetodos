/*
 * Exercicio 10: Criar metodo que recebe valor da compra e percentual de desconto,
 * retornando o valor final com desconto.
 */

import java.util.Scanner;

public class Ex10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o valor da compra: ");
        double valorCompra = sc.nextDouble();

        System.out.print("Digite o percentual de desconto (%): ");
        double percentualDesconto = sc.nextDouble();

        double valorFinal = calcularDesconto(valorCompra, percentualDesconto);

        System.out.println("Valor final com desconto: R$ " + valorFinal);

        sc.close();
    }

    public static double calcularDesconto(double valorOriginal, double percentual) {
        double desconto = valorOriginal * (percentual / 100.0);
        return valorOriginal - desconto;
    }
}
