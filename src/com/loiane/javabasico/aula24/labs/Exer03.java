package com.loiane.javabasico.aula24.labs;

public class Exer03 {

	public static void main(String[] args) {
		
		LivroLivraria livro = new LivroLivraria();
		livro.nome = "Mastering ExtJS";
		livro.autor = "Loiane Groner";
		livro.qtdPaginas = 300;
		livro.anoLancamento = 2015;
		livro.preco = 63.39;
		
		System.out.println("Nome do livro         : " + livro.nome);
		System.out.println("Autor                 : " + livro.autor);
		System.out.println("Quantidade de paginas : " + livro.qtdPaginas);
		System.out.println("Ano de lancamento     : " + livro.anoLancamento);
		System.out.println("Preco do livro        : " + livro.preco);
	}

}
