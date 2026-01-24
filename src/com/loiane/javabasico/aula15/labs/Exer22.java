package com.loiane.javabasico.aula15.labs;

import java.util.Locale;
import java.util.Scanner;

public class Exer22 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Entre com a quantidade (Kg) de morangos:");
		double qtdKgMorango = scan.nextDouble();
		System.out.println("Entre com a quantidade (Kg) de macas:");
		double qtdKgMaca = scan.nextDouble();

		double precoMorango = 0;
		if (qtdKgMorango <= 5) {
			precoMorango = 2.5;
		} else {
			precoMorango = 2.2;
		}
		
		double precoMaca = 0;
		if (qtdKgMaca <= 5) {
			precoMaca = 1.8;
		} else {
			precoMaca = 1.5;
		}
		
		double precoTotalMorango = qtdKgMorango * precoMorango;
		double precoTotalMaca = qtdKgMaca * precoMaca;
		double totalKgFrutas = qtdKgMorango + qtdKgMaca;
		
		double precoParcial = precoTotalMorango + precoTotalMaca;
		double precoTotal = precoParcial;
		
		double desconto = 0;
		String desc10 = "Desconto aplicado   : 0.0%";
		if (totalKgFrutas > 8 || precoParcial > 25) {
			desconto = (precoParcial / 100) * 10;
			precoTotal = precoParcial - desconto;
			desc10 = "Desconto aplicado   : 10%";
		}

		System.out.println("-------------------------------");
		System.out.println("Preco total Morango R$ " + precoTotalMorango);
		System.out.println("Preco total Maca    R$ " + precoTotalMaca);
		System.out.println("Total Kg de frutas  : " + totalKgFrutas + "kg");
		System.out.println(desc10);
		System.out.println("-------------------------------");
		System.out.println("Valor parcial       R$ " + precoParcial);
		System.out.println("Valor de desconto   R$ " + desconto);
		System.out.println("Valor total a pagar R$ " + precoTotal);
		System.out.println("-------------------------------");
	}

}
