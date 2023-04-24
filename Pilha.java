package estrutura_de_dados;

import java.util.Scanner;
import java.util.Stack;

public class Pilha {

	public static void main(String[] args) {
		Stack<String> pilha = new Stack<String>();
		
		String livro;
		int opcao;
		
		Scanner leia = new Scanner (System.in);
		
		do {
		
		System.out.println("Pilha de Livros");
		System.out.println("1 - Adicionar Livro na Pilha");
		System.out.println("2 - Listar todos os Livros");
		System.out.println("3 - Retirar Livro da Pilha");
		System.out.println("0 - Sair");
		System.out.println("Entre com a opção desejada: ");
		opcao = leia.nextInt();
		
		switch (opcao) {
		case 1:
			leia.nextLine();
			System.out.println("Digite o nome: ");
			livro = leia.nextLine();
			pilha.push(livro);
			break;
		case 2:
			leia.nextLine();
			if (pilha.isEmpty()) {
				System.out.println("A Pilha está vazia!");
			}
			
			else {
				System.out.println("Lista de Livros: "+pilha);
			}
			break;
		case 3:
			leia.nextLine();
			if (pilha.isEmpty()) {
				System.out.println("A Pilha está vazia!");
			}
			else {
			pilha.pop();
			System.out.println("Um Livro foi retirado da Pilha!");
			}
			break;
		case 0:
			leia.nextLine();
			System.out.println("Programa Finalizado!");
			break;
		}
		
		}while (opcao != 0);

	}

}
