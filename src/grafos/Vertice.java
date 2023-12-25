package grafos;

import java.util.ArrayList;
import java.util.Scanner;

public class Vertice {
	protected String nomeCidade;
	protected ArrayList<Vertice> vizinhanca = new ArrayList<>();
	protected ArrayList<Aresta> conexoes = new ArrayList<>();


	public Vertice(String nomeCidade) {
		this.nomeCidade = nomeCidade;
		ArrayList<Vertice> vizinhanca = new ArrayList<>();
	
	}
	public Vertice() {
		this.nomeCidade = nomeCidade;
	}

	public String getNomeCidade() {
		return nomeCidade;
	}


	void info_vizinhos(Vertice cidade) {
	    for(int i=0; i < cidade.vizinhanca.size(); i++) {
	    	cidade.vizinhanca.get(i).info_vizinhos(cidade);
	    }
	  }
	
	

}
