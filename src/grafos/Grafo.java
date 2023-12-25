package grafos;

import java.util.ArrayList;
import java.util.Scanner;

public class Grafo {
	protected ArrayList<Vertice> cidades = new ArrayList<>();
	protected ArrayList<Aresta> conexoes = new ArrayList<>();

	public Grafo() {
		ArrayList<Vertice> cidades = new ArrayList<>();
		ArrayList<Aresta> conexoes = new ArrayList<>();
	}

	public void infoCidades() {
		for (int i = 0; i < this.cidades.size(); i++) {
			for (int j = cidades.size() - 1; j > i; j--) {
				if (this.cidades.get(i).nomeCidade.compareToIgnoreCase(this.cidades.get(j).getNomeCidade()) > 0) {

					Vertice tmp = cidades.get(i);
					this.cidades.set(i, cidades.get(j));
					this.cidades.set(j, tmp);
				}
			}
		}
		for (Vertice v : cidades) {

			System.out.println(v.nomeCidade);
		}

	}

	public void infoConexoes() {
		for (Aresta c : conexoes) {
			System.out.println(c.cidade1.nomeCidade + " ===================== " + c.cidade2.nomeCidade);
			System.out.println("                 " + c.distancia + " KM");
		}
	}

	public void adicionaCidade() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Informe o nome da cidade: ");
		String nomeCidade = sc.nextLine();
		Vertice vertice = new Vertice(nomeCidade);
		cidades.add(vertice);

	}

	public void adicionaConexao() {
		Scanner sc = new Scanner(System.in);
		int contador = 0;
		Aresta aresta = null;
		Vertice cidade1 = null;
		Vertice cidade2 = null;;
		System.out.println("Cidade 1:");
		String escolheCidade = sc.nextLine();
		System.out.println("\nCidade 2:");
		String escolheCidade2 = sc.nextLine();
		System.out.println("\ndistância entre as duas cidades:");
		Float distancia = sc.nextFloat();
		System.out.println();

		for (int i = 0; i < cidades.size(); i++) {
			if (cidades.get(i).nomeCidade.equalsIgnoreCase(escolheCidade) ) {
				cidade1 = cidades.get(i);
				aresta = new Aresta(cidade1, cidade2, distancia);
				break;
			}

		}
		for (int i = 0; i < cidades.size(); i++) {
			if (cidades.get(i).nomeCidade.equalsIgnoreCase(escolheCidade2)) {
				cidade2 = cidades.get(i);
				aresta = new Aresta(cidade1, cidade2, distancia);
				contador++;
				break;
			}

		}
		
		//aresta = new Aresta(cidade1, cidade2, distancia);
		if (contador ==0) {
			System.out.println("Não foi possivel encontrar conexão entre as cidades!");
		}else {
			System.out.println("Conexão estabelecida!");
			conexoes.add(aresta);
		}
			
		

	}



	public void infoVizinho() {
		Scanner sc = new Scanner(System.in);
		Aresta novaConexao = null;
		ArrayList<Aresta> novaLista = new ArrayList();
		System.out.print("Digiente o nome da cidade para saber seus vizinhos: ");
		String escolhaCidade = sc.nextLine();
		Aresta distancia = null;
		Aresta pegaDistancia = null;

		for (int i = 0; i < this.conexoes.size(); i++) {
			for (int j = conexoes.size() - 1; j > i; j--) {
				if (this.conexoes.get(i).cidade1.nomeCidade
						.compareToIgnoreCase(this.conexoes.get(j).cidade1.nomeCidade) > 0
						&& this.conexoes.get(i).cidade2.nomeCidade
								.compareToIgnoreCase(this.conexoes.get(j).cidade2.nomeCidade) > 0) {

					Aresta tmp = conexoes.get(i);
					this.conexoes.set(i, conexoes.get(j));
					this.conexoes.set(j, tmp);
				}
			}
		}
		for (int i = 0; i < conexoes.size(); i++) {
			if (conexoes.get(i).cidade1.nomeCidade.equalsIgnoreCase(escolhaCidade)
					|| conexoes.get(i).cidade2.nomeCidade.equalsIgnoreCase(escolhaCidade)) {
				System.out.println(conexoes.get(i).cidade1.nomeCidade + " ==================== "
						+ conexoes.get(i).cidade2.nomeCidade);
				System.out.println("                  " + conexoes.get(i).distancia + " KM");
			}

		}

	}

}
