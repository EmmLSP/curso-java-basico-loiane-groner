package com.loiane.javabasico.aula27.labs;

public class ContaCorrente {

	String numero;
	String agencia;
	boolean especial; // conta corrente especial
	double limiteEspecial; // limite do cheque especial
	double saldo;
	
	/*boolean realizarSaque(double quantiaASacar) {
		if (saldo >= quantiaASacar) {
			saldo -= quantiaASacar;
			return true;
		} else {
			if (especial) {
				double limite = limiteEspecial + saldo;
				if (limite >= quantiaASacar) {
					saldo -= quantiaASacar;
					return true;
				} else {
					return false;
				}
			}
			return false;
		}
	}*/

	boolean realizarSaque(double quantiaASacar) {
		// tem saldo na conta
		if (saldo >= quantiaASacar) {
			debitarSaldo(quantiaASacar);
			return true;
		} else { // nao tem saldo na conta
			if (especial) {
				// verificar se o limite especial tem saldo
				double limite = limiteEspecial + saldo; // 500 - 110 = 390
				if (limite >= quantiaASacar) {
					debitarSaldo(quantiaASacar);
					return true;
				} else {
					return false; // se nao tiver saldo e nem limite
				}
			} else {
				return false; // nao e especial e nao tem saldo suficiente
			}
		}
	}
	
	void debitarSaldo(double valor) {
		saldo -= valor;
	}
	
	void depositar(double valorDepositado) {
		saldo += valorDepositado;
	}
	
	// saldo ja e atributo da classe e nao precisa de uma instancia. Ex: conta.saldo
	void consultarSaldo() {
		System.out.println("Saldo atual da conta = " + saldo); 
	}
	
	boolean verificarUsoChequeEspecial() {
		return saldo < 0;
	}
}
