package com.loiane.javabasico.aula13.labs;

import java.util.Locale;
import java.util.Scanner;

public class Exer10 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Entre com a temperatura em celsius:");
		double celsius = scan.nextDouble();
		
		double farenh = (celsius * 9/5) + 32;
		
		System.out.println(celsius + "°C é igual a " + farenh + "°F");
	}

}
