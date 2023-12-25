package grafos;

public class Aresta {
	protected Vertice cidade1;
	protected Vertice cidade2;
	protected float distancia;
	
	public Aresta(Vertice cidade1, Vertice cidade2, float distancia) {
		this.cidade1 = cidade1;
		this.cidade2 = cidade2;
		this.distancia = distancia;
	}

	
	
	public void info() {
	    System.out.println(cidade1.nomeCidade + " -> " + distancia + "km -> " + cidade2.nomeCidade);
	  
	  
	}
	
}
