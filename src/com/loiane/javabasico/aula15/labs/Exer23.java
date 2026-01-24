package com.loiane.javabasico.aula15.labs;

import java.util.Locale;
import java.util.Scanner;

public class Exer23 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Entre com o tipo da carne:");
		System.out.println("---------------");
		System.out.println("F- File Duplo");
		System.out.println("A- Alcatra");
		System.out.println("P- Picanha");
		System.out.println("---------------");
		String tipo = scan.next();
		
		System.out.println("Entre com a quantidade (Kg):");
		double qtdCarne = scan.nextDouble();
		
		boolean valida = true;
		
		double precoKg = 0;
		if (tipo.equalsIgnoreCase("f")) {
			tipo = "File Duplo";
			if (qtdCarne <= 5) {
				precoKg = 4.9;
			} else {
				precoKg = 5.8;
			}
		} else if (tipo.equalsIgnoreCase("a")) {
			tipo = "Alcatra";
			if (qtdCarne <= 5) {
				precoKg = 5.9;
			} else {
				precoKg = 6.8;
			}
		} else if (tipo.equalsIgnoreCase("p")) {
			tipo = "Picanha";
			if (qtdCarne <= 5) {
				precoKg = 6.9;
			} else {
				precoKg = 7.8;
			}
		} else {
			System.out.println("Tipo de carne invalido!");
			valida = false;
		}
		
		if (valida) {
			double totalParcial = qtdCarne * precoKg;
			double precoAPagar = totalParcial;
			
			System.out.println(qtdCarne + "Kg * " + precoKg + " = " + precoAPagar);
			
			boolean validaPag = true;
			System.out.println("Compra no cartao? (S/N):");
			String pagamento = scan.next();
		
			double desconto = 0;
			String desc10 = "Sem desconto na compra!";
			if (pagamento.equalsIgnoreCase("S")) {
				pagamento = "Cartao";
				desconto = (totalParcial / 100) * 5;
				precoAPagar = totalParcial - desconto;
				desc10 = "desconto aplicado de 10%!";
			} else if (pagamento.equalsIgnoreCase("N")) {
				pagamento = "Dinheiro";
			} else {
				System.out.println("Forma de pagamento invalida!");
				validaPag = false;
			}

			if (validaPag) {
				System.out.println("---------------------------------");
				System.out.println("Tipo de carne         : " + tipo);
				System.out.println("Quantidade de carne   : " + qtdCarne + "Kg");
				System.out.println("Tipo de pagamenoto    : " + pagamento);
				System.out.println("---------------------------------");
				System.out.println(desc10);
				System.out.println("---------------------------------");
				System.out.println("Valor parcial         : R$ " + totalParcial);
				System.out.println("Valor de desconto     : R$ " + desconto);
				System.out.println("Valor a pagar         : R$ " + precoAPagar);
				System.out.println("---------------------------------");
			}
		}
	}

}
