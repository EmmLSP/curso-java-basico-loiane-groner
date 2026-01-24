package com.loiane.javabasico.aula17;

public class LoopFor {

	public static void main(String[] args) {

		// for normal
		
		for (int i = 0; i < 5; i++) { // i - escopo local
			System.out.println("i tem valor de: " + i);
		}
		
		for (int i = 5; i > 0; i--) {
			System.out.println("i tem valor de: " + i);
		}
		
		// for com mais de uma variavel
		for (int i = 0, j = 10; i < j; i++, j--) {
			System.out.println("i tem valor de: " + i + " e j tem valor de: " + j);
		}
		
		// for com partes ausentes
		int count = 0; // count - escopo global
		for (; count < 10; ) {
			System.out.println("i tem valor: " + count);
			count += 2;
		}
		
		System.out.println(count); // 10
		
		for (int cont = 0; cont < 10; cont += 2) {
			System.out.println("cont tem valor: " + cont);
		}
		
		// loop infinito
	    // Unreachable code → código que nunca será executado
		/*for ( ; ; );
		 * 
		for (int i = 0; ; i++) {
			System.out.println(i);
		}*/
		
		// loop sem corpo
		int soma = 0;
		for (int i = 1; i < 5; soma += i++);
		// 1 + 2 + 3 + 4 = 10
		System.out.println("O valor da soma é " + soma);
		
		// bloco de codigo sem chaves, uma linha de codigo
		for (int i = 0; i < 5; i++)
			System.out.println("i tem valor: " + i);
			System.out.println("i tem valor: ");
		
		// melhor utilizar como boa pratica as chaves
		// usar as { } facilita manutencao do codigo
		for (int i = 0; i < 5; i++) {
			System.out.println("i tem valor: " + i);
			System.out.println("i tem valor: ");
		}
	}

}
