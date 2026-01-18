package com.loiane.javabasico.aula12;

import java.util.Locale;
import java.util.Scanner;

public class LeituraDadosTeclado {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		scan.useLocale(Locale.US);
		
		System.out.println("Digite seu nome completo:");
		String nomeCompleto = scan.nextLine();
		System.out.println("Seu nome completo é: " + nomeCompleto);
		
		System.out.println("Digite seu primeiro nome:");
		String primeiroNome = scan.next();
		System.out.println("Seu primeiro nome é: " + primeiroNome);
		
		System.out.println("Digite a sua idade:");
		int idade = scan.nextInt();
		System.out.println("Sua idade é: " + idade);
		
		System.out.println("Digite a sua altura:");
		double altura = scan.nextDouble();
		System.out.println("A sua altura é: " + altura);
		System.out.println(String.format("A sua altura é: %.2fm", altura));
		System.out.printf("A sua altura é: %.2fm\n", altura);
		
		System.out.println("Digite o seu primeiro nome, idade, quantidade de filhos, altura e se tem bichinho de estimacao");
		primeiroNome = scan.next();
		idade = scan.nextInt();
		byte qtdFilhos = scan.nextByte();
		float alturaf = scan.nextFloat();
		boolean temPet = scan.nextBoolean();
		
		System.out.println("Voce digitou os seguintes valores:");
		System.out.println("Primeiro nome: " + primeiroNome);
		System.out.println("Idade: " + idade);
		System.out.println("Quantidade de filhos: " + qtdFilhos);
		System.out.println("Altura: " + alturaf);
		System.out.println("Tem bichinho de estimacao? " + temPet);
	}

}
