package com.loiane.javabasico.aula17.labs;

import java.util.Locale;
import java.util.Scanner;

// Calculo em Java nao e nuito preciso
// para isto existe classes para fazer
// calculos mais precisos

public class Exer25 {

	public static void main(String[] args) {
	
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		
		boolean sair = false;
		int produtos;
		String continuarCompra;
		double preco;
		double total;
		double valorPago, troco;
		String output = "";
		
		do {
			System.out.println("Deseja continuar comprando? (S/N):");
			continuarCompra = scan.next();
			if (continuarCompra.equalsIgnoreCase("N")) {
				sair = true;
			} else {
				output += "Lojas Tabajara\n";
				
				System.out.println("Digite a quantidade de produtos da compra:");
				produtos = scan.nextInt();
				
				total = 0;
				
				output += "-------------------\n";
				
				for (int i = 1; i <= produtos; i++) {
					System.out.println("Informe preco do produto " + i + ":");
					preco = scan.nextDouble();
					total += preco;
					output += "Produto " + i + ": R$ " + preco + "\n";
				}
				
				output += "Total      R$ " + total + "\n";
				
				System.out.println("Total da compra: R$ " + total);
				
				System.out.println("Entre com o valor pago:");
				valorPago = scan.nextDouble();
				
				output += "Dinheiro   R$ " + valorPago + "\n";
				
				troco = valorPago - total;
				
				output += "Troco      R$ " + troco + "\n";
				
				output += "-------------------\n";
				
				// saida da nota fiscal
				System.out.println(output);	
			}
			
		} while (!sair);
		
		System.out.println("Obrigado pela preferencia! Tenha um bom dia!");
	}

}
