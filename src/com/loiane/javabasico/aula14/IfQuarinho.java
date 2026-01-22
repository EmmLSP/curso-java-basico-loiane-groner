package com.loiane.javabasico.aula14;

public class IfQuarinho {

	public static void main(String[] args) {
		
		boolean temBatata = true;
		int ovos = 6;
		
		if (temBatata) {
			ovos = 9;
		}

		System.out.println("Compre " + ovos + " ovos.");
	}

}
