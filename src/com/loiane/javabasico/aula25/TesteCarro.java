package com.loiane.javabasico.aula25;

public class TesteCarro {

	public static void main(String[] args) {
		
		Carro van = new Carro();
		van.marca = "Fiat";
		van.modelo = "Ducato";
		van.numPassageiros = 10;
		van.capCombustivel = 100;
		van.consumoCombustivel = 0.2;
		
		System.out.println("Marca                          : " + van.marca);
		System.out.println("Modelo                         : " + van.modelo);
		System.out.println("Numero de passageiros          : " + van.numPassageiros);
		System.out.println("Capacidade de combustivel      : " + van.capCombustivel);
		System.out.println("Consumo de combustivel         : " + van.consumoCombustivel);
		
		van.exibirAutonomia();
	}

}
