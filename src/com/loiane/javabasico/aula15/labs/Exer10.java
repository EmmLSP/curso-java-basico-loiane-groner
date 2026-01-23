package com.loiane.javabasico.aula15.labs;

import java.util.Scanner;

public class Exer10 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite o turno que voce estuda [M-V-N]:");
		String turno = scan.next();
		
		if (turno.equalsIgnoreCase("M")) {
			System.out.println("Bom dia!");
		} else if (turno.equalsIgnoreCase("V")) {
			System.out.println("Boa tarde!");
		} else if (turno.equalsIgnoreCase("N")) {
			System.out.println("Boa Noite!");
		} else {
			System.out.println("Valor inválido!");
		}
		
		switch(turno) {
		case "m":
		case "M": System.out.println("Bom dia!"); break;
		case "v":
		case "V": System.out.println("Boa tarde!"); break;
		case "n":
		case "N": System.out.println("Boa noite!"); break;
		default: System.out.println("VaLor inválido!");
		}
	}

}
