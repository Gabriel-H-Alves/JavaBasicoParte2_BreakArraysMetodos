/*
 * Exercicio 03: Ler 5 nomes de clientes em um vetor e exibi-los no console.
 */

import java.util.Scanner;

public class Ex03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] listaClientes = new String[5];

        for (int indice = 0; indice < listaClientes.length; indice++) {
            System.out.print("Digite o nome do cliente " + (indice + 1) + ": ");
            listaClientes[indice] = sc.nextLine();
        }

        System.out.println("Lista de clientes cadastrados:");
        for (String clienteAtual : listaClientes) {
            System.out.println("- " + clienteAtual);
        }

        sc.close();
    }
}
