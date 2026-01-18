package com.loiane.javabasico.aula10;

public class Variaveis {

	public static void main(String[] args) {
		
		// padrao de nomenclatura em Java é camelCase
		// classe sempre comeca com letra maiscula
		// String e uma classe em Java
		// Java e case sensitive
		
		// convencao Java
		int idade = 20;
		String nome = "Loiane";
		String nomeDoMeuCachorro = "toto"; // camelCase
		String ano2014 = "2014";
		
		// aceito, mas  nao utilizado
		int _idade;
		int $idade;
		
		// nao e convencao Java
		String nome_do_meu_cachorro; // nomenclatura de Python, c++
		
		idade = 25;
		
		System.out.println("Idade = " + idade);
		System.out.println("Nome = " + nome);
		
		// má prática
		int a = 10;
		String b = "Loaine";
	}

}
