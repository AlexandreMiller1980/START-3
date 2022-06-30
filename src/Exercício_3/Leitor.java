package Exercício_3;

import java.util.ArrayList;
import java.util.List;

public class Leitor {

	private String nome;
	private Livro livroFavorito;
	private List<Livro> estanteLivros = new ArrayList<>();

	public Leitor(String nome, Livro livroFavorito) {
		this.nome = nome;
		this.livroFavorito = livroFavorito;
		this.estanteLivros.add(livroFavorito);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Livro getLivroFavorito() {
		return livroFavorito;
	}

	public void setLivroFavorito(Livro livroFavorito) {
		this.livroFavorito = livroFavorito;
	}

	public List<Livro> getEstanteLivros() {
		return estanteLivros;
	}

	public void setEstanteLivros(List<Livro> estanteLivros) {
		this.estanteLivros = estanteLivros;
	}

	public void adicionarLivro(Livro livro) {
		estanteLivros.add(livro);
	}

	public void removerLivro(Livro livro) {
		estanteLivros.get(estanteLivros.indexOf(livro)).setPaginasLidas(0);
		estanteLivros.remove(livro);
	}
	public String toString() {
		return "Leitor [nome=" + nome + ", livroFavorito=" + livroFavorito + ", estanteLivros=" + estanteLivros + "]";
	}

}

