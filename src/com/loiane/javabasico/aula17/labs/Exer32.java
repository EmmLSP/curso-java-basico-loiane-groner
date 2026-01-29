package com.loiane.javabasico.aula17.labs;

import java.util.Scanner;

public class Exer32 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		String output = "----------------------------------------\n";
		output += "           Pedido de Lanche\n";
		output += "----------------------------------------\n";
		
		boolean naoTerminar = true;
		boolean validaCod;
		boolean sair;
		String continuar;
		int cod;
		double total;
		double totalGeral = 0;
		
		do {
			System.out.println("Cachorro Quente   100    R$ 1.20");
			System.out.println("Bauru Simples     101    R$ 1.30");
			System.out.println("Bauru com ovo     102    R$ 1.50");
			System.out.println("Hamburguer        103    R$ 1.20");
			System.out.println("Cheeseburguer     104    R$ 1.30");
			System.out.println("Refrigerante      105    R$ 1.00");
			
			validaCod = false;
			do {
				System.out.println("Digite o codigo do lanche:");
				cod = scan.nextInt();
				if (cod >= 100 && cod <= 105) {
					validaCod = true;
				}
			} while (!validaCod);
			
			System.out.println("Entre com a quantidade:");
			int qtd = scan.nextInt();
			
			total = 0;

			switch(cod) {
			case 100:
				total = qtd * 1.2;
				output += "Cachorrro Quente      1.20 * " + qtd;
				output += " = R$ " + total + "\n"; break;
			case 101:
				total = qtd * 1.3;
				output += "Bauru Simples         1.30 * " + qtd;
				output += " = R$ " + total + "\n"; break;
			case 102:
				total = qtd * 1.5;
				output += "Bauru com ovo         1.50 * " + qtd;
				output += " = R$ " + total + "\n"; break;
			case 103:
				total = qtd * 1.2;
				output += "Hamburguer            1.20 * " + qtd;
				output += " = R$ " + total + "\n"; break;
			case 104:
				total = qtd * 1.3;
				output += "Cheeseburguer         1.30 * " + qtd;
				output += " = R$ " + total + "\n"; break;
			case 105:
				total = qtd * 1.0;
				output += "Refrigerante          1.00 * " + qtd;
				output += " = R$ " + total + "\n"; break;
			}
			totalGeral += total;
			
			output += "Total R$ " + total + "\n";
			output += "----------------------------------------\n";
			
			System.out.println("Total R$ " + total);
			
			sair = false;
			do {
				System.out.println("Quer continuar pedindo? S/N:");
				continuar = scan.next();
				if (continuar.equalsIgnoreCase("S") || 
					continuar.equalsIgnoreCase("N")) {
					sair = true;
				} else {
					System.out.println("Entrada invalida! Digite 'S' ou 'N'");
				}
			} while (!sair);
			
			if (continuar.equalsIgnoreCase("N")) {
				output += "Total a pagar R$ " + totalGeral + "\n";
				output += "----------------------------------------\n";
				naoTerminar = false;
			}

		} while (naoTerminar);
		
		System.out.println(output);
	}

}
