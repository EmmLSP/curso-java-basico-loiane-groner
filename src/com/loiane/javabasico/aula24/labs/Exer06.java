package com.loiane.javabasico.aula24.labs;

public class Exer06 {

	public static void main(String[] args) {
		
		Contato contato1 = new Contato();
		contato1.nome = "Loiane Groner";
		contato1.endereco = "Av Paulista, 1000";
		contato1.email = "loiane.groner@email.com";
		contato1.telefones = new String[3];
		contato1.telefones[0] = "(14) 9999-5555";
		contato1.telefones[1] = "(14) 9876-4444";
		contato1.telefones[2] = "(14) 9456-3333";
		
		System.out.println("Nome        : " + contato1.nome);
		System.out.println("Email       : " + contato1.email);
		System.out.println("Endereco    : " + contato1.endereco);
		
		for (int i = 0; i < contato1.telefones.length; i++) {
			System.out.println("Telefone " + (i+1) + "  : " + contato1.telefones[i]);
		}
	}

}
