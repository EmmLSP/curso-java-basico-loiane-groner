package com.loiane.javabasico.aula11;

public class CuriosidadeInt {

	public static void main(String[] args) {
		
		int var1 = 2147483647; // valor maximo de inteiro
		int var2 = 1;
		
		System.out.println(var1 + var2);
		
		// os numeros no Java funcionam como uma roleta
		// do momento que excede o limite do int o proximo
		// numero vai ser negativo, voltando para o menor
		// numero de int em Java
		// serve para qualquer tipo inteiro no Java
		
		// +2147483647 -> maior valor
		// -2147483648 -> menor valor
	}

}
