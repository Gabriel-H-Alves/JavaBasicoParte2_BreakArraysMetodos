/*
 * Exercicio 07: Criar um metodo simples para calcular e exibir a mensagem de boas-vindas.
 */

import java.util.Scanner;

public class Ex07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite seu nome: ");
        String nomeUsuario = sc.nextLine();

        exibirSaudacao(nomeUsuario);

        sc.close();
    }

    public static void exibirSaudacao(String nomeRecebido) {
        System.out.println("Ola, " + nomeRecebido + "! Bem-vindo ao aprendizado de metodos.");
    }
}
