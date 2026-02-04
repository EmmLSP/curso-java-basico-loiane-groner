package com.loiane.javabasico.aula27.labs;

public class Lampada {

	String modelo;
	String tensao;
	int potencia; // Watts
	String cor;
	String tipoLuz;
	int garantiaMeses;
	static String[] tipos;
	boolean tipoAbajur;
	boolean ligada; // false como padrao
	
	void ligar() {
		ligada = true; // muda atributo para true
	}
	
	void desligar() {
		ligada = false; // muda atributo para false
	}
	
	void mostrarEstado() {
		if (ligada) {
			System.out.println("Lampada esta ligada");
		} else {
			System.out.println("Lampada esta desligada");
		}
	}
	
	// metodos dentro de metodos dentro da classe
	void mudarEstado() {
		if (ligada) {
			desligar();
		} else {
			ligar();
		}
	}
}
