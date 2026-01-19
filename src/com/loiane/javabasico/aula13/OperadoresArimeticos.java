package com.loiane.javabasico.aula13;

public class OperadoresArimeticos {

	public static void main(String[] args) {
		
		int resultado = 1 + 2;
		System.out.println(resultado); // 3
		
		resultado = resultado - 1;
		System.out.println(resultado); // 2
		
		resultado = resultado * 2;
		System.out.println(resultado); // 4
		
		resultado = resultado / 2;
		System.out.println(resultado); // 2
		
		resultado = resultado + 8;
		System.out.println(resultado); // 10
		
		resultado = resultado % 7;
		System.out.println(resultado); // 3
		
		String primeiroNome = "Esta é";
		String segundoNome = " uma String concatenada";
		String terceiroNome = primeiroNome + segundoNome;
		System.out.println(terceiroNome);
		
		resultado = resultado + 1;
		System.out.println(resultado); // 4
		
		resultado++;
		System.out.println(resultado); // 5
		
		// 5
		System.out.println(resultado++); // 5
		// mesma coisa que
		// resultado = resultado + 1;
		// resultado += 1;
		
		System.out.println(++resultado); // 7
		// mesma coisa que
		// resultado += 1;
		// System.out.println(resultado);
		
		resultado--;
		System.out.println(resultado); // 6
		
		System.out.println(resultado--); // 6
		System.out.println(--resultado); // 4
	}

}
