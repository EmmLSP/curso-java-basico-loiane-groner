package com.loiane.javabasico.aula17.labs;

import java.util.Scanner;

public class Exer02 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		String usuario;
		String senha;
		
		// comparacao de String
		// equals() - o case importa
		// equalsIgoreCase() - o case nao importa
		
		boolean infoValidas = false;
		do {
			System.out.println("Entre com o nome do usuario:");
			usuario = scan.next();
			System.out.println("Entre com a senha:");
			senha = scan.next();
			if (usuario.equals(senha)) { // o case importa
				System.out.println("Senha igual a usuario, digite novamente.");
			} else {
				System.out.println("Senha e usuario validos!");
				infoValidas = true;
			}
		} while (!infoValidas);
		
		System.out.println("Usuario: " + usuario);
		System.out.println("Senha: " + senha);
	}

}
