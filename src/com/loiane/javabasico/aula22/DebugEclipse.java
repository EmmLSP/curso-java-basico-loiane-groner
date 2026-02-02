package com.loiane.javabasico.aula22;

public class DebugEclipse {

	public static void main(String[] args) {
		
		int[] notas = new int[3];
		
		// ArrayIndexOutOfBoundsException
		// erro tentar uma posicao no array que nao existe
		
		for (int i = 0; i < 4; i++) {
			notas[i] = i;
		}
				

	}

}
