package com.loiane.javabasico.aula13.labs;

import java.util.Locale;
import java.util.Scanner;

public class Exer13 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Entre com o valor/hora:");
		double valorHora = scan.nextDouble();
		System.out.println("Entre com a quantidade de horas trabalhadas no mes:");
		double horas = scan.nextDouble();
		
		double salarioBruto = valorHora * horas;
		
		double ir = (salarioBruto * 11) / 100;
		double inss = (salarioBruto * 8) / 100;
		double sindicato = (salarioBruto * 5) / 100;
		double descontos = ir + inss + sindicato;
		double salarioLiquido = salarioBruto - descontos;
		
		System.out.println("Salario bruto:     R$ " + salarioBruto);
		System.out.println("(-) IR             R$ " + ir);
		System.out.println("(-) INSS           R$ " + inss);
		System.out.println("Sindicato          R$ " + sindicato);
		System.out.println("Total de descontos R$ " + descontos);
		System.out.println("Salario liquido    R$ " + salarioLiquido);
	}

}
