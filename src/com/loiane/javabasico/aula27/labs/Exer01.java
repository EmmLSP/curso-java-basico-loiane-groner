package com.loiane.javabasico.aula27.labs;

public class Exer01 {

	public static void main(String[] args) {
		
		Lampada lampada = new Lampada();
		lampada.modelo = "A60";
		lampada.tensao = "Bivolt";
		lampada.potencia = 7;
		lampada.cor = "Amarela";
		lampada.tipoLuz = "Amarela";
		
		System.out.println("Modelo: " + lampada.modelo);
		System.out.println("Tensao: " + lampada.tensao);
		System.out.println("Potencia: " + lampada.potencia);
		System.out.println("Cor: " + lampada.cor);
		System.out.println("Tipo de luz: " + lampada.tipoLuz);
		
		Lampada.tipos = new String[3];
		Lampada.tipos[0] = "Abajur";
		Lampada.tipos[1] = "Lampeoes";
		Lampada.tipos[2] = "Led";
		
		System.out.println("Tipos de lampadas:");
		for (int i = 0; i < Lampada.tipos.length; i++) {
			System.out.print(Lampada.tipos[i] + " ");
		}
		System.out.println();
		
		System.out.println(lampada.ligada);
		
		lampada.ligar();
		
		lampada.mostrarEstado();
		
		lampada.desligar();
		
		lampada.mostrarEstado();
		
		lampada.ligar();
		
		lampada.mostrarEstado();
		
		lampada.mudarEstado();
		
		lampada.mostrarEstado();
	}

}
