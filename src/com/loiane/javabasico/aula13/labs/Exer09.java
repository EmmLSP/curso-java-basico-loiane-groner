package com.loiane.javabasico.aula13.labs;

import java.text.DecimalFormat;
import java.util.Locale;
import java.util.Scanner;

public class Exer09 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Entre com a temperatura em graus Farenheit:");
		double farenh = scan.nextDouble();
		
		double celsius = 5 * (farenh - 32) / 9;
		
		DecimalFormat df = new DecimalFormat("###,###.##");
		
		System.out.println("A temperatura " + farenh + "°F em celsius é igual a " + df.format(celsius) + "°C");
	}

}
