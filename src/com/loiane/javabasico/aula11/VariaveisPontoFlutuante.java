package com.loiane.javabasico.aula11;

import java.text.DecimalFormat;
import java.util.Locale;

public class VariaveisPontoFlutuante {

	public static void main(String[] args) {
		
		// Forçar o Java a usar ponto como separador decimal (Locale.US)
		Locale.setDefault(Locale.US);
		
		DecimalFormat df = new DecimalFormat("#,##0.00");
		
		double valorPassagem = 2.90;
		float valorTomate = 3.95f;
		
		System.out.println("Valor da passagem R$ " + df.format(valorPassagem));
		System.out.println("Valor do Kg do tomate R$ " + valorTomate);
	}

}
