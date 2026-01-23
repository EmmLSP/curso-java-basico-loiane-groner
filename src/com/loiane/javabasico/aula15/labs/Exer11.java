package com.loiane.javabasico.aula15.labs;

import java.util.Locale;
import java.util.Scanner;

public class Exer11 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite o salario:");
		double salario = scan.nextDouble();
		
		double percAumento = 0;
		
		/*if (salario <= 280) {
			percAumento = 20;
		} else if (salario > 280 && salario < 700) {
			percAumento = 15;
		} else if (salario >= 700 && salario < 1500) {
			percAumento = 10;
		} else {
			percAumento = 5;
		}*/
		
		// otimizar algoritmo
		if (salario <= 280) {
			percAumento = 20;
		} else if (salario < 700) {
			percAumento = 15;
		} else if (salario < 1500) {
			percAumento = 10;
		} else {
			percAumento = 5;
		}
		double aumento = (salario / 100) * percAumento;
		double novoSalario = salario + aumento;
		
		System.out.println("Salario antes do reajuste: R$ " + salario);
		System.out.println("Percentual de aumento    : " + percAumento + "%");
		System.out.println("Valor do aumento         : R$ " + aumento);
		System.out.println("Novo salario             : R$ " + novoSalario);
	}

}
