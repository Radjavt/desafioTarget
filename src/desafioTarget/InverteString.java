package desafioTarget;

import java.util.Scanner;

public class InverteString {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		System.out.println("Digite uma string:");
		String texto = ler.nextLine();

		char[] letras = texto.toCharArray();
		int tamanho = letras.length;

		for (int i = 0; i < tamanho / 2; i++) {
			char aux = letras[i];
			letras[i] = letras[tamanho - 1 - i];
			letras[tamanho - 1 - i] = aux;
		}
		
		String textoInvertido = new String(letras);
		
		System.out.println();
		System.out.println("Texto invertido: " + textoInvertido);
		ler.close();
	}
}