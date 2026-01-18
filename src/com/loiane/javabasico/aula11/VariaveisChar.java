package com.loiane.javabasico.aula11;

public class VariaveisChar {

	public static void main(String[] args) {
		
		char o = 'o';
		char i = 'i';
		char aAcentuado = 0x00E1;
		char interrogacao = 0x003F;
		char interrogacaoEspanhol = 0x00BF;
		
		System.out.println(o + i); // 2016
		
		// transformar para char
		System.out.println("" + o + i);
		System.out.println("" + o + i + interrogacao);
		System.out.println("" + o + i + interrogacaoEspanhol);
		System.out.println("" + aAcentuado);
		
		// valores da tabela ascii
		o = 111;
		i = 105;
		interrogacao = 0x003f;
		
		System.out.println(o + i);
		
		// transformar para char
		System.out.println("" + o + i);
		System.out.println("" + o + i + interrogacao);
	}

}
