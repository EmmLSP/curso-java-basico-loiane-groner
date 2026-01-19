package com.loiane.javabasico.aula13;

public class OperadoresRelacionais {

	public static void main(String[] args) {
		
		// sempre que usa comparacao com operadores relacionais
		// o resultado vai ser um boolean
		// muito utilizado com blocos de codigo condicional: if else
		
		int valor1 = 1;
		int valor2 = 2;
		
		System.out.println("valor1 == valor2: " + (valor1 == valor2)); // false
		System.out.println("valor1 != valor2: " + (valor1 != valor2)); // true
		System.out.println("valor1 > valor2: " + (valor1 > valor2)); // // false
		System.out.println("valor1 >= valor2: " + (valor1 >= valor2)); // false
		System.out.println("valor1 < valor2: " + (valor1 < valor2)); // true
		System.out.println("valor1 <= valor2: " + (valor1 <= valor2)); // true
	}

}
