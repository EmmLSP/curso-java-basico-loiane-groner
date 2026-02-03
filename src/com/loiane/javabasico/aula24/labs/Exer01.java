package com.loiane.javabasico.aula24.labs;

public class Exer01 {
	
	public static void main(String[] args) {
		
		// new -> instanciando objeto lampada do tipo Lampada
		Lampada lampada = new Lampada();
		lampada.modelo = "A60";
		lampada.tensao = "Bivolt";
		lampada.potencia = 7;
		lampada.cor = "Amarela";
		lampada.tipoLuz = "Amarela";
		lampada.garantiaMeses = 36;
		lampada.tipoAbajur = true;
		
		// array instanciado
		Lampada.tipos = new String[5];
		lampada.tipos[0] = "Abajur";
		lampada.tipos[1] = "lampeoes";
		
		System.out.println("Modelo          " + lampada.modelo);
		System.out.println("Tensao          " + lampada.tensao);
		System.out.println("Potencia        " + lampada.potencia);
		System.out.println("Cor             " + lampada.cor);
		System.out.println("Tipo de luz     " + lampada.tipoLuz);
		System.out.println("Garantia meses  " + lampada.garantiaMeses);
		System.out.println("Tipo Abajur     " + lampada.tipoAbajur);
		System.out.println("Tipo de luz 1   " + lampada.tipos[0]);
		System.out.println("Tipo de luz 2   " + lampada.tipos[1]);
		
		System.out.println("\nArray de tipos:");
		for (String tipo : lampada.tipos) {
			System.out.println(tipo);
		}
	}

}
