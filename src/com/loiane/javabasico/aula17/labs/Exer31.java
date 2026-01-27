package com.loiane.javabasico.aula17.labs;

import java.util.Locale;
import java.util.Scanner;

public class Exer31 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		
		double salario = 1000;
		System.out.println("Salario 1995 R$ " + salario + " - percentual 0%");
		
		double percentual = 1.5;
		
		salario += (salario / 100) * percentual; 
		System.out.println("Salario 1996 R$ " + salario + " - percentual " + percentual + "%");
		
		int ano = 1997; 
		while (ano <= 2025) {
			percentual *= 2;
			salario += (salario / 100) * percentual;
			System.out.println("Salario " + ano + " R$ " + salario + " - percentual " + percentual + "%");
			ano++;
		}
	}

}
