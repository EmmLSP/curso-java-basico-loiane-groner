package com.loiane.javabasico.aula29;

public class Carro {

	String marca;
	String modelo;
	int numPassageiros; // numero de passageiros
	double capCombustivel; // capacidade do tanque de combustivel
	double consumoCombustivel; // consumo de combustivel por km
	
	// construtor
	Carro() {
		System.out.println("Classe Carro foi instanciada");
		numPassageiros = 4;
	}
	
	// construtor com parametros
	Carro(String marca_, String modelo_, int numPassageiros_, 
		double capCombustivel_, double consumoCombustivel_) {
		marca = marca_;
		modelo = modelo_;
		numPassageiros = numPassageiros_;
		capCombustivel = capCombustivel_;
		consumoCombustivel = consumoCombustivel_;
	}
	
	void exibirAutonomia() {
		System.out.println("A autonomia do carro é: " + capCombustivel * consumoCombustivel + " km");
	}
	
	double obterAutonomia() {
		System.out.println("Metodo obterAutonomia foi chamado.");
		return capCombustivel * consumoCombustivel;
	}
	
	double calcularCombustivel(double km) {
		double qtdCombustivel = km / consumoCombustivel;
		return qtdCombustivel;
	}
}
