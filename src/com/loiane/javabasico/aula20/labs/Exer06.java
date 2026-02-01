package com.loiane.javabasico.aula20.labs;

import java.util.Scanner;

public class Exer06 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		char[][] jogoVelha = new char[3][3];
		
		System.out.println("Jogador 1 = X"); // impar
		System.out.println("Jogador 2 = O"); // par
		
		boolean ganhou = false;
		boolean linhaValida;
		boolean colunaValida;
		int jogada = 1;
		char sinal;
		int linha = 0, coluna = 0;
	
		while (!ganhou) {
			
			if (jogada % 2 == 1) { // jogador1
				System.out.println("Vez do jogador 1. Escolha linha e coluna (1-3):");
				sinal = 'x';
			} else {
				System.out.println("Vez do jogador 2. Escolha linha e coluna (1-3):");
				sinal = 'o';	
			}
			
			linhaValida = false;
			while (!linhaValida) {
				System.out.println("Entre com a linha (1, 2 ou 3):");
				linha = scan.nextInt();
				if (linha >= 1 && linha <= 3) {
					linhaValida = true;
				} else {
					System.out.println("Entrada invalida, tente novamente.");
				}
			}
			
			colunaValida = false;
			while (!colunaValida) {
				System.out.println("Entre com a coluna (1, 2 ou 3):");
				coluna = scan.nextInt();
				if (coluna >= 1 && coluna <= 3) {
					colunaValida = true;
				} else {
					System.out.println("Entrada invalida, tente novamente.");
				}
			}
			linha--;
			coluna--;
			
			// verificar se a jogada e valida
			if (jogoVelha[linha][coluna] == 'x' || jogoVelha[linha][coluna] == 'o') {
				System.out.println("Posicao ja usada, tente novamente.");
			} else { // jogada valida
				jogoVelha[linha][coluna] = sinal;
				jogada++;	
			}
			
			// imprimir o tabuleiro
			for (int i = 0; i < jogoVelha.length; i++) {
				for (int j = 0; j < jogoVelha[i].length; j++) {
					System.out.print(jogoVelha[i][j] + " | ");
				}
				System.out.println();
			}
			
			// verificar se tem ganhador
			if ((jogoVelha[0][0] == 'x' && jogoVelha[0][1] == 'x' && jogoVelha[0][2] == 'x') ||
				(jogoVelha[1][0] == 'x' && jogoVelha[1][1] == 'x' && jogoVelha[1][2] == 'x') ||
				(jogoVelha[2][0] == 'x' && jogoVelha[2][1] == 'x' && jogoVelha[2][2] == 'x') ||
				(jogoVelha[0][0] == 'x' && jogoVelha[1][0] == 'x' && jogoVelha[2][0] == 'x') ||
				(jogoVelha[0][1] == 'x' && jogoVelha[1][1] == 'x' && jogoVelha[2][1] == 'x') ||
				(jogoVelha[0][2] == 'x' && jogoVelha[1][2] == 'x' && jogoVelha[2][2] == 'x') ||
				(jogoVelha[0][0] == 'x' && jogoVelha[1][1] == 'x' && jogoVelha[2][2] == 'x') ||
				(jogoVelha[0][2] == 'x' && jogoVelha[1][1] == 'x' && jogoVelha[2][0] == 'x')) {
				ganhou = true;
				System.out.println("Parabens! Jogador 1 ganhou!");
			} else if ((jogoVelha[0][0] == 'o' && jogoVelha[0][1] == 'o' && jogoVelha[0][2] == 'o') ||
				(jogoVelha[1][0] == 'o' && jogoVelha[1][1] == 'o' && jogoVelha[1][2] == 'o') ||
				(jogoVelha[2][0] == 'o' && jogoVelha[2][1] == 'o' && jogoVelha[2][2] == 'o') ||
				(jogoVelha[0][0] == 'o' && jogoVelha[1][0] == 'o' && jogoVelha[2][0] == 'o') ||
				(jogoVelha[0][1] == 'o' && jogoVelha[1][1] == 'o' && jogoVelha[2][1] == 'o') ||
				(jogoVelha[0][2] == 'o' && jogoVelha[1][2] == 'o' && jogoVelha[2][2] == 'o') ||
				(jogoVelha[0][0] == 'o' && jogoVelha[1][1] == 'o' && jogoVelha[2][2] == 'o') ||
				(jogoVelha[0][2] == 'o' && jogoVelha[1][1] == 'o' && jogoVelha[2][0] == 'o')) {
				ganhou = true;
				System.out.println("Parabens! Jogador 2 ganhou!");
			} else if (jogada > 9) { 
				ganhou = true;
				System.out.println("EMPATE! Ninguem ganhou essa partida.");
			}
		}
	}

}
