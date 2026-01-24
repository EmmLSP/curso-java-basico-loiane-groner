package com.loiane.javabasico.aula15.labs;

import java.text.DecimalFormat;
import java.util.Locale;
import java.util.Scanner;

public class Exer21 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Entre com a quantidade de litros de combustivel:");
		double litros = scan.nextDouble();
		
		System.out.println("Entre com o tipo de combustivel (A-Alcool / G-Gasolina):");
		String tipo = scan.next();
		
		// constantes, variaveis que nao vao mudar
		double precoGas = 2.5;
		double precoAlc = 1.9;

		int percDesc = 0;
		double total = 0;
		boolean valida = true;
		
		if (tipo.equalsIgnoreCase("A")) {
			if (litros <= 20) {
				percDesc = 3;
			} else {
				percDesc = 5;
			}
			tipo = "Alcool";
			total = litros * precoAlc;
		} else if (tipo.equalsIgnoreCase("G")) {
			if (litros <= 20) {
				percDesc = 4;
			} else {
				percDesc = 6;
			}
			tipo = "Gasolina";
			total = litros * precoGas;
		} else {
			System.out.println("Tipo invalido! Digite A-Alcool ou G-Gasolina!");
			valida = false;
		}
		
		if (valida) {
			double desconto = (total / 100) * percDesc;
			double precoAPagar = total - desconto;
			
			DecimalFormat df = new DecimalFormat("###,##0.00");
			
			System.out.println("Tipo de combustivel     : " + tipo);
			System.out.println("Percentual de desconto  : " + percDesc + "%");
			System.out.println("Valor do desconto:      R$ " + df.format(desconto));
			System.out.println("Valor sem desconto:     R$ " + df.format(total));
			System.out.println("Valor com desconto:     R$ " + df.format(precoAPagar));
		}
	}

}
