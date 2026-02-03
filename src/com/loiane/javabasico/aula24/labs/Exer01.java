package com.loiane.javabasico.aula24.labs;

public class Exer01 {
	
	public static void main(String[] args) {
		
		// new -> instanciar a lampada, objeto do tipo Lampada
		Lampada lampada = new Lampada();
		lampada.modelo = "A60";
		lampada.tensao = "Bivolt";
		lampada.garantiaMeses = 36;
		lampada.potencia = 7;
		lampada.cor = "Amarela";
		lampada.tipoLuz = "Amarela";
		lampada.tipoAbajur = true;
		
		Lampada.tipos = new String[5];
		lampada.tipos[0] = "Abajur";
		lampada.tipos[1] = "lampeoes";
		
		System.out.println("Caracteristicas do objeto Lampada:");
		System.out.println("Marca: " + lampada.modelo);
		System.out.println("Tensao: " + lampada.tensao);
		System.out.println("Garantia em meses: " + lampada.garantiaMeses);
		System.out.println("Potencia: " + lampada.potencia);
		System.out.println("Cor: " + lampada.cor);
		System.out.println("Tipo de luz: " + lampada.tipoLuz);
		System.out.println("Lampada tipo Abajur: " + lampada.tipoAbajur);
		System.out.println("Tipos de lampada: " + lampada.tipos[0]);
		System.out.println("Tipos de lampada: " + lampada.tipos[1]);
	}

}
