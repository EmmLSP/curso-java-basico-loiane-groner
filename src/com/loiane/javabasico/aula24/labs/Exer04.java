package com.loiane.javabasico.aula24.labs;

import java.util.Date;

public class Exer04 {

	public static void main(String[] args) {
		
		LivroDeBiblioteca livro = new LivroDeBiblioteca();
		livro.nome = "Mastering ExtJS";
		livro.autor = "Loiane Groner";
		livro.qtdPaginas = 300;
		livro.anoLancamento = 2015;
		
		livro.emprestado = true;
		// instanciar a classe Date
		livro.dataEntrega = new Date(); // dia da semana, mes, dia, horario, ano atual
		livro.emprestadoA = "Loaine";
		
		System.out.println("Nome do livro         : " + livro.nome);
		System.out.println("Autor                 : " + livro.autor);
		System.out.println("Quantidade de paginas : " + livro.qtdPaginas);
		System.out.println("Ano de lancamento     : " + livro.anoLancamento);
		System.out.println("Emprestado            : " + livro.emprestado);
		System.out.println("Data de entrega       : " + livro.dataEntrega);
		System.out.println("Emprestado a          : " + livro.emprestadoA);
	}

}
