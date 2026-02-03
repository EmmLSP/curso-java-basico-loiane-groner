package com.loiane.javabasico.aula25;

public class Carro {

	// atributos da Classe Carro
	String marca;
	String modelo;
	int numPassageiros;
	double capCombustivel;
	double consumoCombustivel;

	// metodo da Classe Carro
	// tipo de retorno - void - sem retorno
	// nome de metodo sempre comeca com verbo
	// andar, dirigir, exibir
	void exibirAutonomia() {
		System.out.println("A autonomia do carro           : " + (capCombustivel * consumoCombustivel) + " km");
	}
}
