package desafioTarget;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		int posicao01 = 0, posicao02 = 1, proximo = 0;
		Scanner ler = new Scanner(System.in);

		System.out.println("Digite um número para verificação: ");
		int num = ler.nextInt();
		boolean status = false;

		if (num == posicao01 || num == posicao02) {
			System.out.println(num + " pertence à sequência de Fibonacci.");
			status = true;
		}

		while (proximo <= num) {
			proximo = posicao01 + posicao02;
			posicao01 = posicao02;
			posicao02 = proximo;

			if (num == proximo) {
				System.out.println(num + " pertence à sequência de Fibonacci.");
				status = true;
				break;
			}
		}

		if (!status) {
			System.out.println();
			System.out.println(num + " não pertence à sequência de Fibonacci.");
		}
	}
}