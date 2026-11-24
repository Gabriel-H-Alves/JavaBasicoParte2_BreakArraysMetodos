/*
 * Exercicio 15: Metodo para converter temperatura de Celsius para Fahrenheit.
 */

import java.util.Scanner;

public class Ex15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a temperatura em Celsius: ");
        double temperaturaCelsius = sc.nextDouble();

        double temperaturaFahrenheit = converterParaFahrenheit(temperaturaCelsius);

        System.out.println("Temperatura em Fahrenheit: " + temperaturaFahrenheit);

        sc.close();
    }

    public static double converterParaFahrenheit(double celsius) {
        return (celsius * 9.0 / 5.0) + 32.0;
    }
}
