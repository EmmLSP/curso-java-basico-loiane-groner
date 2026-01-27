package com.loiane.javabasico.aula17.labs;

import java.util.Locale;
import java.util.Scanner;

public class Exer27 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Entre com a quantidade de temperaturas:");
		int temperaturas = scan.nextInt();
		
		double temperatura;
		double soma = 0;
		double media;
		double maiorTemp = Double.MIN_VALUE;
		double menorTemp = Double.MAX_VALUE;
		String str_temperaturas = "";
		
		for (int i = 1; i <= temperaturas; i++) {
			System.out.println("Entre com a temperatura " + i);
			temperatura = scan.nextDouble();
			soma += temperatura;
			str_temperaturas += temperatura + "°C ";
			if (temperatura > maiorTemp) {
				maiorTemp = temperatura;
			}
			if (temperatura < menorTemp) {
				menorTemp = temperatura;
			}
		}
		media = soma / temperaturas;
		
		System.out.println(str_temperaturas);
		System.out.println("Media de temperaturas: " + media + "°C");
		System.out.println("Maior temperatura: " + maiorTemp + "°C");		
		System.out.println("Menor temperatura: " + menorTemp + "°C");
	}

}
