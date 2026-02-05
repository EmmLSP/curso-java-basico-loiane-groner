package com.loiane.javabasico.aula27.labs;

import java.util.Scanner;

public class Exer04 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		JogoDaVelha jogoDaVelha = new JogoDaVelha();
		
		jogoDaVelha.jogoVelha = new char[3][3];
		boolean ganhou = false;
		char sinal;
		int linha = 0, coluna = 0;
		
		System.out.println("Jogador 1 = X");
		System.out.println("Jogador 2 = O");
		
		while (!ganhou) {
			
			if (jogoDaVelha.vezJogador1()) {
				System.out.println("Vez do jogador 1. Escolha linha e coluna (1-3):");
 				sinal = 'x';
			} else {
				System.out.println("Vez do jogador 2. Escolha linha e coluna (1-3):");
				sinal = 'o';
			}
			
			linha = valor("linha", scan);
			coluna = valor("coluna", scan);
			
			if (!jogoDaVelha.validarJogada(linha, coluna, sinal)) {
				System.out.println("Posicao ja usada, tente novamente.");
			}
			
			jogoDaVelha.imprimirTabuleiro();
			
			if (jogoDaVelha.verificarGanhador('x')) {
				System.out.println("Parabens! Jogador 1 ganhou!");
				ganhou = true;
			} else if (jogoDaVelha.verificarGanhador('o')) {
				System.out.println("Parabens! Jogador 2 ganhou!");
				ganhou = true;
			} else if (jogoDaVelha.jogada > 9) {
				System.out.println("Ninguem ganhou essa paritida!");
				ganhou = true;
			}
		}
	}
	
	// metodos static nao precisa de uma instancia para ser chamado
	// so consegue chamar outros metodos static se o metodo for static tambem
	static int valor(String tipoValor, Scanner scan) {
		int valor = 0;
		boolean valorValido = false;
		while (!valorValido) {
			System.out.println("Entre com a " + tipoValor + " (1-3):");
			valor = scan.nextInt();
			if (valor >= 1 && valor <= 3) {
				valorValido = true;
			} else {
				System.out.println("Entrada invalida, tente novamente.");
			}
		}
		valor--;
		return valor;
	}

}
