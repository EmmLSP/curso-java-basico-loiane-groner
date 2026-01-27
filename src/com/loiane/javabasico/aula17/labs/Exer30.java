package com.loiane.javabasico.aula17.labs;

import java.util.Scanner;

public class Exer30 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Entre com um numero para gerar a tabuada:");
		int num = scan.nextInt();
		
		boolean invalido = true;
		int numFinal, numInicial;
		
		do {
			System.out.println("Entre com o inicio da tabuada:");
			numInicial = scan.nextInt();
			System.out.println("Entre com o final da tabuada:");
			numFinal = scan.nextInt();
			if (numInicial > numFinal) {
				System.out.println("Numero inicial precisa ser menor do que numero final");
			} else {
				invalido = false;
			}
		} while (invalido);
		
		System.out.println("Montar tabuada de: " + num);
		System.out.println("Comecar por: " + numInicial);
		System.out.println("Terminar em: " + numFinal + "\n");
		System.out.print("Vou montar a tabuada de " + num + " comecando em ");
		System.out.println(numInicial + " e terminando em " + numFinal + ":");
		
		for (int i = numInicial; i <= numFinal; i++) {
			System.out.println(num + " x " + i + " = " + (num*i));
		}
	}

}
