package com.loiane.javabasico.aula20.labs;

import java.util.Scanner;

public class Exer05 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		// valor incial da String = null, nulo
		
		String[][][] compromissos = new String[12][31][8];

		boolean sair = false;
		int opcao;

		while (!sair) {

			System.out.println("Digite 1 para adicionar compromisso.");
			System.out.println("Digite 2 para verificar compromisso.");
			System.out.println("Digite 0 para sair.");
			opcao = scan.nextInt();

			if (opcao == 1) {
				boolean mesValido = false;
				int mes;
				do {
					System.out.println("Entre com o mes do ano:");
					mes = scan.nextInt();
					if (mes > 0 && mes <= 12) {
						mesValido = true;
					} else {
						System.out.println("Mes invalido, digite novamente.");
					}
				} while (!mesValido);
				
				boolean diaValdo = false;
				int dia;
				do {
					System.out.println("Entre com o dia do mes:");
					dia = scan.nextInt();
					if (dia > 0 && dia <= 31) {
						diaValdo = true;
					} else {
						System.out.println("Dia invalido, digite novamente.");
					}
				} while (!diaValdo);
				
				boolean horaInvalida = false;
				int hora;
				do {
					System.out.println("Entre com o hora do compromisso:");
					hora = scan.nextInt();
					if (hora > 0 && hora <= 8) {
						horaInvalida = true;
					} else {
						System.out.println("Hora invalida, digite novamente.");
					}
				} while (!horaInvalida);
				
				System.out.println("Digite o compromisso:");
				compromissos[--mes][--dia][--hora] = scan.next();
			} else if (opcao == 2) {
				boolean mesValido = false;
				int mes;
				do {
					System.out.println("Entre com o mes do ano:");
					mes = scan.nextInt();
					if (mes > 0 && mes <= 12) {
						mesValido = true;
					} else {
						System.out.println("Mes invalido, digite novamente.");
					}
				} while (!mesValido);
				
				boolean diaValdo = false;
				int dia;
				do {
					System.out.println("Entre com o dia do mes:");
					dia = scan.nextInt();
					if (dia > 0 && dia <= 31) {
						diaValdo = true;
					} else {
						System.out.println("Dia invalido, digite novamente.");
					}
				} while (!diaValdo);
				
				boolean horaInvalida = false;
				int hora;
				do {
					System.out.println("Entre com o hora do compromisso:");
					hora = scan.nextInt();
					if (hora > 0 && hora <= 8) {
						horaInvalida = true;
					} else {
						System.out.println("Hora invalida, digite novamente.");
					}
				} while (!horaInvalida);
				
				System.out.println("O compromisso agendadado é:");
				System.out.println(compromissos[--mes][--dia][--hora]);
			} else if (opcao == 0) {
				sair = true;
			} else {
				System.out.println("Opcao inválida, digite novamente.");
			}
		}
		
		System.out.println("<<< Agenda Encerrada >>>");
	}

}
