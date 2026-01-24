package com.loiane.javabasico.aula17.labs;

import java.util.Scanner;

public class Exer03 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		boolean infoValida = false;
		String nome, sexo, estCivil;
		int idade;
		double salario;

		do {
			System.out.println("Emtre com o nome:");
			nome = scan.next();
			if (nome.length() >= 3) {
				infoValida = true;
			} else {
				System.out.println("Nome precisa ser no minimo 3 caracteres");
			}
		} while (!infoValida);
		
		infoValida = false; // reuso de variavel, resetando a flag
		do {
			System.out.println("Entre com a idade:");
			idade = scan.nextInt();
			if (idade >= 0 && idade <= 150) {
				infoValida = true;
			} else {
				System.out.println("Idade precisa ser entre 0 e 150");
			}
		} while (!infoValida);
		
		infoValida = false; // reuso de variavel, resetando a flag
		do {
			System.out.println("Entre com o salario:");
			salario = scan.nextDouble();
			if (salario > 0) {
				infoValida = true;
			} else {
				System.out.println("Salario precisa ser maior que 0");
			}
		} while (!infoValida);

		infoValida = false; // reuso de variavel, resetando a flag
		do {
			System.out.println("Entre com o sexo (M/f):");
			sexo = scan.next();
			if (sexo.equalsIgnoreCase("m") || sexo.equalsIgnoreCase("f")) {
				if (sexo.equalsIgnoreCase("m")) {
					sexo = "Masculino";
				} else {
					sexo = "Feminino";
				}
				infoValida = true;
			} else {
				System.out.println("Sexo precisa ser 'm' ou 'f'");
			}
		} while (!infoValida);
		
		infoValida = false; // reuso de variavel, resetando a flag
		do {
			System.out.println("Entre com o estado civil (s/c/v/d):");
			estCivil = scan.next();
			if (estCivil.equalsIgnoreCase("s") || 
				estCivil.equalsIgnoreCase("c") ||
				estCivil.equalsIgnoreCase("v") ||
				estCivil.equalsIgnoreCase("d")) {
				
				switch(estCivil) {
				case "s":
				case "S": estCivil = "Solteiro(a)"; break;
				case "c":
				case "C": estCivil = "Casado(a)"; break;
				case "v":
				case "V": estCivil = "Viuvo(a)"; break;
				case "d":
				case "D": estCivil = "Divorciado(a)";
				}
				
				infoValida = true;
			} else {
				System.out.println("Estado civil precisa ser 's', 'c', 'v' ou 'd'");
			}
		} while (!infoValida);
		
		System.out.println("---------------------------");
		System.out.println("INFORMACOES de " + nome + ":");
		System.out.println("---------------------------");
		System.out.println("Nome         : " + nome);
		System.out.println("Idade        : " + idade);
		System.out.println("Salario      : " + salario);
		System.out.println("Sexo         : " + sexo);
		System.out.println("Estado civil : " + estCivil);
		System.out.println("---------------------------");
	}

}
