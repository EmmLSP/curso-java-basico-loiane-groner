package com.loiane.javabasico.aula24;

public class TesteCarro {

	public static void main(String[] args) {
		
		Carro van = new Carro();
		van.marca = "Fiat";
		van.modelo = "Ducato";
		van.numPassageiros = 10;
		van.capCombustivel = 100;
		van.consumoCombustivel = 0.2;

		// System.out.println(van);
		// com.loiane.javabasico.aula24.Carro@6f539caf
		// 6f539caf -> referencia para o endereco de
		// memoria que foi alocado
		
		System.out.println("Atributos do objeto van do tipo Carro:");
		System.out.println("Marca: " + van.marca);
		System.out.println("Modelo: " + van.modelo);
		System.out.println("Numero de passageiros: " + van.numPassageiros);
		System.out.println("Capacidade do tanque de combustivel: " + van.capCombustivel);
		System.out.println("Consumo de combustivel por km: " + van.consumoCombustivel);
		
		System.out.println();
		
		Carro fusca = new Carro();
		fusca.marca = "Volkswagen";
		fusca.modelo = "Fusca";
		fusca.numPassageiros = 4;
		fusca.capCombustivel = 30;
		fusca.consumoCombustivel = 0.15;
		
		System.out.println("Atributos do objeto fusca do tipo Carro:");
		System.out.println("Marca: " + fusca.marca);
		System.out.println("Modelo: " + fusca.modelo);
		System.out.println("Numero de passageiros: " + fusca.numPassageiros);
		System.out.println("Capacidade do tanque de combustivel: " + fusca.capCombustivel);
		System.out.println("Consumo de combustivel por km: " + fusca.consumoCombustivel);
	}

}
