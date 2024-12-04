package Laçosderepeticao;

import java.util.Scanner;

public class Dowhile {

	public static void main(String[] args) {
		int valor = 0;
		int soma = 0;

		Scanner leia = new Scanner(System.in);

		do {
			System.out.println("Digite um número inteiro: ");
			valor = leia.nextInt();

			if (valor > 0) {
				soma = valor + soma;
			}

		}

		while (valor !=0);
		System.out.println("A soma dos números positivos é " + soma);

	}

}
