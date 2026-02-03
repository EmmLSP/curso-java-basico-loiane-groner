package com.loiane.javabasico.aula24.labs;

public class Exer02 {

	public static void main(String[] args) {
		
		Livro livro = new Livro();
		livro.nome = "Mastering ExtJS";
		livro.autor = "Loaine Groner";
		livro.qtdPaginas = 300;
		livro.anoLancamento = 2015;
		
		System.out.println("Nome do livro         : " + livro.nome);
		System.out.println("Autor                 : " + livro.autor);
		System.out.println("Quantidade de paginas : " + livro.qtdPaginas);
		System.out.println("Ano de lancamento     : " + livro.anoLancamento);
	}

}
