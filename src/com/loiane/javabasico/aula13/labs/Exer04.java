package com.loiane.javabasico.aula13.labs;

import java.text.DecimalFormat;
import java.util.Locale;
import java.util.Scanner;

public class Exer04 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Entre com a primeira nota:");
		double nota1 = scan.nextDouble();
		System.out.println("Entre com a segunda nota:");
		double nota2 = scan.nextDouble();
		System.out.println("Entre com a terceira nota:");
		double nota3 = scan.nextDouble();
		System.out.println("Entre com a quarta nota:");
		double nota4 = scan.nextDouble();
		double media = (nota1 + nota2 + nota3 + nota4) / 4;
		
		DecimalFormat df = new DecimalFormat("##,##.##");
		
		System.out.println("A media é igual a " + df.format(media));
		System.out.printf("A media é igual a %.2f\n", media);
		System.out.println("A media é igual a " + String.format("%.2f", media));
	}

}
