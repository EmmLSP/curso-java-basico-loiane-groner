package com.loiane.javabasico.aula27;

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
		double autonomia = van.obterAutonomia();
		
		System.out.println("A autonomia do carro é         : " + autonomia + " km");
		System.out.println("A autonomia do carro é         : " + van.obterAutonomia() + " km");
		
		double qtdCombustivel10 = van.calcularCombustivel(10);
		double qtdCombustivel15 = van.calcularCombustivel(15);

		System.out.println("qtdCombustivel10 = " + qtdCombustivel10);
		System.out.println("qtdCombustivel15 = " + qtdCombustivel15);
	}

}
