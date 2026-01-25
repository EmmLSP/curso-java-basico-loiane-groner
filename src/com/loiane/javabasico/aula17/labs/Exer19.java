package com.loiane.javabasico.aula17.labs;

import java.util.Locale;
import java.util.Scanner;

public class Exer19 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Entre com o numero de notas:");
		int notas = scan.nextInt();
		
		double nota;
		double soma = 0;
		double media;
		String notas_str = "";
		
		for (int i = 0; i < notas; i++) {
			System.out.println("Entre com a nota " + (i+1) + ":");
			nota = scan.nextDouble();
			soma += nota;
			notas_str += nota + " ";
		}
		media = soma / notas;
		
		System.out.println("Notas: " + notas_str);
		System.out.println("Soma: " + soma);
		System.out.println("Media: " + media);
	}

}
