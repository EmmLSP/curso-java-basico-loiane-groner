package com.loiane.javabasico.aula15.labs;

import java.util.Locale;
import java.util.Scanner;

public class Exer12 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Entre com o valor/hora:");
		double valorHora = scan.nextDouble();
		System.out.println("Entre com a quantidade de horas trabalhadas no mes:");
		double horas = scan.nextDouble();
		
		double salarioBruto = valorHora * horas;
		
		double percentualIR = 0;
		if (salarioBruto <= 900) {
			percentualIR = 0;
		} else if (salarioBruto <= 1500) {
			percentualIR = 5;
		} else if (salarioBruto <= 2500) {
			percentualIR = 10;
		} else {
			percentualIR = 20;
		}
		double ir = (salarioBruto / 100) * percentualIR;
		double inss = (salarioBruto / 100) * 10;
		double fgts = (salarioBruto / 100) * 11;
		double descontos = ir + inss;
		double salarioLiquido = salarioBruto - descontos;
		
		System.out.println("Salario Bruto        R$ " + salarioBruto);
		System.out.println("(-) IR (" + percentualIR + "%)         R$ " + ir);
		System.out.println("(-) INSS (10%)       R$ " + inss);
		System.out.println("FGTS (11%)           R$ " + fgts);
		System.out.println("Total de descontos   R$ " + descontos);
		System.out.println("Salario liquido      R$ " + salarioLiquido);
	}

}
