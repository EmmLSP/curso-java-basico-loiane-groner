package com.loiane.javabasico.aula13.labs;

import java.util.Locale;
import java.util.Scanner;

public class Exer06 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Entre com o raio do circulo:");
		double raio = scan.nextDouble();
		
		// area do circulo
		// area = pi * r ^ 2
		
		double area = Math.PI * Math.pow(raio, 2);
		System.out.println("A area do circulo é " + area);
		System.out.println("A area do circulo é " + String.format("%.2f", area));
	}

}
