package com.loiane.javabasico.aula24.labs;

public class Exer05 {

	public static void main(String[] args) {
		
		ContaCorrente conta = new ContaCorrente();
		conta.numero = "123456";
		conta.agencia = "1234";
		conta.contaEspecial = true;
		conta.limiteEspecial = 500; // cheque especial
		conta.saldo = 100;

		System.out.println("Numero da conta           : " + conta.numero);
		System.out.println("Agencia                   : " + conta.agencia);
		System.out.println("Conta especial            : " + conta.contaEspecial);
		System.out.println("Limite cheque especial    : " + conta.limiteEspecial);
		System.out.println("Saldo da conta            : " + conta.saldo);
		System.out.println("----------------------------------");
		System.out.println("Saldo da conta " + conta.numero + "    R$ " + conta.saldo);
	}

}
