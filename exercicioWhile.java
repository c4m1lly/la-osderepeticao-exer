package Laçosderepeticao;

import java.util.Scanner;

public class exercicioWhile {

	public static void main(String[] args) {
		int idade = 0;
		int menorQueVinteUm = 0;
		int maiorQueCinquenta = 0;
		Scanner leia = new Scanner(System.in);

		while (idade >-1) {
			System.out.println("Digite sua idade: ");
			idade = leia.nextInt();

			if (idade < 21 && idade>0) {
				menorQueVinteUm = menorQueVinteUm + 1;

			}
			if (idade > 50) {
				maiorQueCinquenta = maiorQueCinquenta + 1;
			}

		}

		System.out.println(menorQueVinteUm + " Total de pessoas menores de 21 anos:");
		System.out.println(maiorQueCinquenta + " Total de pessoas maiores de 50 anos:");

	}

}
