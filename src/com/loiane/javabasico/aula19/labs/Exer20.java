package com.loiane.javabasico.aula19.labs;

import java.text.DecimalFormat;
import java.util.Locale;
import java.util.Scanner;

public class Exer20 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);

		// cotacao US$ 1.00 = R$ 5.00
		// dolar = real / 5 = R$ 1.00
		// real = dolar * 5 = R$ 5.00
		
		double[] vetorA = new double[20];
		double cotacao;
		
		System.out.println("Entre com a cotacao do dolar:");
		cotacao = scan.nextDouble();
		
		for (int i = 0; i < vetorA.length; i++) {
			vetorA[i] = cotacao * (i+1);
		}
		
		DecimalFormat df = new DecimalFormat("###,###.00");
		
		System.out.println("Vetor A - Conversao do dolar para real:");
		for (int i = 0; i < 20; i++) {
			System.out.println("US$ " + (i+1) + ".00 - R$ " + df.format(vetorA[i]));
		}
	}

}
