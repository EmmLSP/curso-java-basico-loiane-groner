package com.loiane.javabasico.aula13.labs;

import java.text.DecimalFormat;
import java.util.Locale;
import java.util.Scanner;

public class Exer12 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Entre com a altura:");
		double altura = scan.nextDouble();
		
		double pesoIdeal = (72.7 * altura) - 58;
		
		DecimalFormat df = new DecimalFormat("###,###.#");
		
		System.out.println("O peso ideal para altura " + altura + "m é " + df.format(pesoIdeal) + "Kg");
	}

}
