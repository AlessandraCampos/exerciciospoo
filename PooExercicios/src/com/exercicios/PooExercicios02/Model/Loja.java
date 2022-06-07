package com.exercicios.PooExercicios02.Model;
import com.exercicios.PooExercicios02.Model.Livro;
import com.exercicios.PooExercicios02.Model.Loja;
import com.exercicios.PooExercicios02.Model.VideoGame;
import java.util.ArrayList;
import java.util.List;

public class Loja  {
	private String nome;
	private String numeroDaLoja;
	List<Livro> livros;
	List<VideoGame> videoGames;
	
	
	



	public Loja() {
		super();
		
	}
	public Loja(String nome, String string, List<Livro> livros, List<VideoGame> videoGame) {
		super();
		this.nome = nome;
		this.numeroDaLoja = string;
		this.livros = livros;
		this.videoGames = videoGame;
	}
	
	public void  listadeLivros() {	
		if(this.livros.isEmpty()) {
			System.out.println("A loja não tem livros no seu estoque.");
		}else {
			System.out.println("A loja " +this.getNome()+ " possui este livros para venda: ");
			for (int i=0;i < this.livros.size();i++) {
				
				System.out.println("Titulo: " + this.livros.get(i).getAutor()
					+ ", Preço: "+ this.livros.get(i).getPreco() + 	", Quantidade: " + this.livros.get(i).getQuantidade() + " em estoque");
		}
	
		}
			
		
	}
	public  void listaVideoGames() {	
		if(this.videoGames.isEmpty()) {
			System.out.println("A loja não tem video-games no seu estoque.");
		}else {
			System.out.println("A loja " +this.getNome()+ " possui estes video-games para venda: ");
			for (int i=0;i < this.videoGames.size();i++) {
				
				System.out.println("Video-Game: " + this.videoGames.get(i).getNome()
					+ ", Preço: "+ this.videoGames.get(i).getPreco() + 	", Quantidade: " + this.videoGames.get(i).getQuantidade() + " em estoque"	);
			}
		}
		
			
		
		
	}
	
	public void calculaPatrimonio() {		
		double patrimonio = 0;
		
		for (int i=0; livros.size()>i; i++)
		{
			patrimonio += (livros.get(i).getPreco() * livros.get(i).getQuantidade());
		}
		
		for (int i=0; videoGames.size()>i; i++)
		{
			patrimonio += (videoGames.get(i).getPreco() * videoGames.get(i).getQuantidade());
		}
			
		System.out.println("O patrimonio da loja :" + this.getNome() + " é de " + patrimonio);

		
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getNumeroDaLoja() {
		return numeroDaLoja;
	}
	public void setNumeroDaLoja(String numeroDaLoja) {
		this.numeroDaLoja = numeroDaLoja;
	}
	public List<Livro> getLivros() {
		return livros;
	}
	public void setLivros(List<Livro> livros) {
		this.livros = livros;
	}
	public List<VideoGame> getVideoGames() {
		return videoGames;
	}
	public void setVideoGames(List<VideoGame> videoGames) {
		this.videoGames = videoGames;
	}
	
	


}
