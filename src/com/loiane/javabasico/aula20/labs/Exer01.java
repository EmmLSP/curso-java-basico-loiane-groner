package com.loiane.javabasico.aula20.labs;

import java.util.Random;

public class Exer01 {

	public static void main(String[] args) {
		
		Random numerosRandom = new Random();
		
		int[][] numerosAleatorios = new int[4][4];
		
		for (int i = 0; i < numerosAleatorios.length; i++) {
			for (int j = 0; j < numerosAleatorios[i].length; j++) {
				// numerosAleatorios[i][j] = (int) Math.round(Math.random() * 9);
				numerosAleatorios[i][j] = numerosRandom.nextInt(100);
			}
		}
		
		// int maiorNum = numerosAleatorios[0][0];
		// int maiorNum = Integer.MIN_VALUE;
		int maior = 0; // 0 a 100
		int linha = 0;
		int col = 0;
		for (int i = 0; i < numerosAleatorios.length; i++) {
			for (int j = 0; j < numerosAleatorios[i].length; j++) {
				if (numerosAleatorios[i][j] > maior) {
					maior = numerosAleatorios[i][j];
					linha = i;
					col = j;
				}
			}
		}
		
		for (int i = 0; i < numerosAleatorios.length; i++) {
			for (int j = 0; j < numerosAleatorios[i].length; j++) {
				System.out.print(numerosAleatorios[i][j] + " ");
			}
			System.out.println();
		}
		
		System.out.println("numerosAleatorios[" + linha + "][" + col + "] = " + maior);
		System.out.println("Maior valor: " + maior);
		System.out.println("Linha: " + linha);
		System.out.println("Coluna: " + col);
	}

}
