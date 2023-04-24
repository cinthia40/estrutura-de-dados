package estrutura_de_dados;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Fila {

	public static void main(String[] args) {
		Queue<String> fila = new LinkedList<String>();
		int selecao;
		String nome;
		
		Scanner leia = new Scanner (System.in);
		
		
		do {
			
		System.out.println("Lista de Espera");
		System.out.println("1 - Adicionar Cliente na Fila");
		System.out.println("2 - Listar todos os Clientes");
		System.out.println("3 - Retirar Cliente da Fila");
		System.out.println("0 - Sair");
		selecao = leia.nextInt();
		
		
		
		 switch (selecao) {
		 case 1: 
			 leia.nextLine();
			 System.out.println("Digite o nome do Cliente: ");
			 nome = leia.nextLine();
			 fila.add(nome);
			 System.out.println("Cliente Adicionado!");
			 break;
		 case 2:
			 leia.nextLine();
			 if (fila.isEmpty()) {
				 System.out.println("A Fila está vazia!");
			 }
			 else {
			 System.out.println("Lista de Clientes: "+fila);
			 }
			 break;
		 case 3:
			 leia.nextLine();
			 System.out.println("Digite o nome do Cliente que deseja remover: ");
			 nome = leia.nextLine();
			 fila.remove(nome);
			 System.out.println("O Cliente foi Chamado!");
			 break;
		 case 0:  System.out.println("Programa Finalizado!");
		 break;
		 }
		
		} while (selecao != 0);

	}

}
