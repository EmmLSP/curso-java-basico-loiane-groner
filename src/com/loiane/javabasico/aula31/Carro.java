package com.loiane.javabasico.aula31;

public class Carro {

	public String marca;
	String modelo;
	int numPassageiros;
	double capCombustivel;
	private double consumoCombustivel;

	public Carro() { }

	public void exibirAutonomia() {
		System.out.println("A autonomia do carro é: " + this.capCombustivel * this.consumoCombustivel + " km");
	}
	
	public double obterAutonomia() {
		System.out.println("Metodo obterAutonomia foi chamado.");
		return this.capCombustivel * this.consumoCombustivel;
	}
	
	// metodo private para organizar o codigo, visivel somente dentro da classe
	private double divideKmPorConsumoCombustivel(double km) {
		return km / this.consumoCombustivel;
	}
	
	public double calcularCombustivel(double km) {
		return this.divideKmPorConsumoCombustivel(km);
	}
}
