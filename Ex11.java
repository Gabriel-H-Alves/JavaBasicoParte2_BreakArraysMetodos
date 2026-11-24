/*
 * Exercicio 11: Metodo sobrecarregado (overloading) para calcular area de quadrado e retangulo.
 */

import java.util.Scanner;

public class Ex11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o lado do quadrado: ");
        double ladoQuadrado = sc.nextDouble();

        System.out.print("Digite a base do retangulo: ");
        double baseRetangulo = sc.nextDouble();

        System.out.print("Digite a altura do retangulo: ");
        double alturaRetangulo = sc.nextDouble();

        double areaQuadrado = calcularArea(ladoQuadrado);
        double areaRetangulo = calcularArea(baseRetangulo, alturaRetangulo);

        System.out.println("Area do quadrado: " + areaQuadrado);
        System.out.println("Area do retangulo: " + areaRetangulo);

        sc.close();
    }

    public static double calcularArea(double lado) {
        return lado * lado;
    }

    public static double calcularArea(double base, double altura) {
        return base * altura;
    }
}
