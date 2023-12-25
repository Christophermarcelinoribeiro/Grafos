package grafos;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void menu() {
		System.out.println("0 --> encerrar");
		System.out.println("1 --> Adiciona cidade");
		System.out.println("2 --> mostrar cidade");
		System.out.println("3 --> Adiciona conexão");
		System.out.println("4 --> mostra conexão");
		System.out.println("5 --> mostra vizinho");
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Grafo g = new Grafo();
		Vertice c = new Vertice();
		
		
		
		int escolha = -1;
		
		while(escolha != 0) {
			menu();
			System.out.println("Escolha um opção: ");
		    escolha = sc.nextInt();
		   
			switch(escolha) {
			case 0 -> escolha = 0;
			case 1 -> g.adicionaCidade();
			case 2 -> g.infoCidades();
			case 3 -> g.adicionaConexao();
			case 4 -> g.infoConexoes();
			case 5 -> g.infoVizinho();
			
			
			}
			
		}
	
		
	
	}

}
