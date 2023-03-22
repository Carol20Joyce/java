import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class ExPilha {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		  Stack<String> pilhaLivros = new Stack<String>();

	        Scanner leia = new Scanner(System.in);

	        int opcao = 0;
	        String livro = "";

	        do {

	            System.out.println("----------------------------------------");
	            System.out.println("1 - Adicionar um novo livro na pilha");
	            System.out.println("2 - Listar todos os  livros da Pilha");
	            System.out.println("3 - Retirar um livro da pilha");
	            System.out.println("0 - Finalizar programa\n");
	            System.out.println("Entre com a opção desejada: ");

	            opcao = leia.nextInt();

	            switch (opcao) {

	            case 1:
	                System.out.println("----- Adicionar um novo cliente ----- ");
	                System.out.println("Digite o nome do cliente: ");

	                livro = leia.next();
	                pilhaLivros.push(livro);

	                System.out.println("Livro Adicionado! \n");
	                break;

	            case 2:
	                System.out.println("----- Listagem de Livros ----- ");

	                for (var elemento : pilhaLivros)
	                    System.out.println(elemento);

	                break;

	            case 3:
	                if (pilhaLivros.size() > 0) {
	                    System.out.println("----- Retirar o último livro da pilha -----");
	                    pilhaLivros.pop();

	                    System.out.println("O livro foi retirado! \n");
	                    break;
	                } else {
	                    System.out.println("A pilha está vazia! ");
	                }

	            default:
	                if (opcao > 3)
	                    System.out.println("Opção invalida \n");
	                break;
	            }

	        } while (opcao != 0);

	        System.out.println("Programa finalizado! ");

	        leia.close();

	    }

	}