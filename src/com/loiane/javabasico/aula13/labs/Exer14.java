package com.loiane.javabasico.aula13.labs;

import java.text.DecimalFormat;
import java.util.Locale;
import java.util.Scanner;

public class Exer14 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Entre com o tamanho de um arquivo (em MB):");
		double fileMB = scan.nextDouble();
		
		System.out.println("Entre com a velocidade de internet (em Mbps):");
		double velInternet = scan.nextDouble();
		
		// converter MB para megabits (Mb)
		// 1 byte = 8 bits
		// 1024 MB x 8 = 8192 Mb
		double converterMBtoMb = (fileMB * 8);
		
		// dividir pela velocidade
		double tempo = converterMBtoMb / velInternet;
		
		// 60 segundos / 60 = 1 minuto
		// 1 minuto * 60 = 60 segundos
		
		// converter segundos para minutos
		double minutos = tempo / 60;
		
		DecimalFormat df = new DecimalFormat("###,###.##");

		System.out.println("Tempo de download aproximadamente " + df.format(minutos) + " minutos");
	}

}
