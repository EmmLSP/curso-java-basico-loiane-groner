package com.loiane.javabasico.aula19;

public class Arrays {

	public static void main(String[] args) {
		
		// Array ou Vetores
		// e a estrutura de dados mais simples
		// que existe
		// lista ordenada de dados
		
		double tempDia001 = 31.3;
		double tempDia002 = 32;
		double tempDia003 = 33.7;
		double tempDia004 = 34;
		double tempDia005 = 33.1;
		
		// criar e inicializar um array, vetor
		double[] temperaturas = new double[365];
		temperaturas[0] = 31.3;
		temperaturas[1] = 32;
		temperaturas[2] = 33.7;
		temperaturas[3] = 34;
		temperaturas[4] = 33.1;
		
		System.out.println("O valor da temperatura do dia 1 é: " + temperaturas[0]);
		System.out.println("O valor da temperatura do dia 2 é: " + temperaturas[1]);
		System.out.println("O valor da temperatura do dia 3 é: " + temperaturas[2]);
		System.out.println("O valor da temperatura do dia 4 é: " + temperaturas[3]);
		System.out.println("O valor da temperatura do dia 5 é: " + temperaturas[4]);
		
		System.out.println("O tamanho do array: " + temperaturas.length);
		
		// [D@6193b845
		// endereco de memoria que o array esta apontando na memoria
		System.out.println("Valores do array: " + temperaturas);
		
		// o valor inicial de um numero em Java em 0
		// pode ser um int, double, float, short, byte
		
		// loop for para iteracao de um array
		for (int i = 0; i < temperaturas.length; i++) {
			System.out.println("O valor da temperatura do dia " + (i+1) + " é: " + temperaturas[i]);
		}
		
		// for melhorado
		for (double temp : temperaturas) {
			System.out.println(temp);
		}
	}

}
