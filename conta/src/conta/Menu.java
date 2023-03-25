package conta;

import java.util.Scanner;

import conta.model.Conta;
import conta.util.Cores;

public class Menu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner leia = new Scanner(System.in);
		
		int opcao, numero, agencia, tipo, aniversario, numeroDestino;
		String titular;
		float saldo, limite, valor;
		
		Conta c1 = new Conta(1, 123, 1, "Jeniffer Souza", 100000.00f);
		c1.visualizar();
		
		System.out.println("Saldo da conta: " + c1.getSaldo());
		
		c1.setTitular("Jeniffer Souza Ribeiro");
		c1.visualizar();
		
		c1.sacar(1000.0f);
		c1.visualizar();
		
		c1.sacar(200000.0f);
		c1.visualizar();
		
		c1.depositar(200000.0f);
		c1.visualizar();
		
		while (true) {
			
			System.out.println(Cores.TEXT_BLUE_BRIGHT + Cores.ANSI_BLACK_BACKGROUND + "*********************************************");
			System.out.println("                                             ");
			System.out.println("               Banco UNIBLACK                ");
			System.out.println("                                             ");
			System.out.println("*********************************************");
			System.out.println("                                             ");
			System.out.println("        1- Criar Conta                       ");
			System.out.println("        2- Listar todas as Contas            ");
			System.out.println("        3- Buscar Conta por Numero           ");
			System.out.println("        4- Atualizar Dados da Conta          ");
			System.out.println("        5- Apagar Conta                      ");
			System.out.println("        6- Sacar                             ");
			System.out.println("        7- Depositar                         ");
			System.out.println("        8- Transferir valores entre Contas   ");
			System.out.println("        9- Sair                              ");
			System.out.println("                                             ");
			System.out.println("*********************************************");
			System.out.println("Entre com a opção desejada:                  ");
			System.out.println("                                             " + Cores.TEXT_RESET);
			
			opcao = leia.nextInt();
			
			if (opcao == 9) {
				System.out.println("\nBanco UNIBLACK - O seu Futuro já começou!");
				sobre();
				leia.close();
				System.exit(0);
			}
			
			switch (opcao) {
			
			case 1-> {
				
				System.out.println("Criar Conta\n\n");
		
		
				System.out.println("Digite o Numero da Agência: ");
	            agencia = leia.nextInt();
	            System.out.println("Digite o Nome do Titular: ");
	            leia.skip("\\R?");
	            titular = leia.nextLine();

	            do {
	                System.out.println("Digite o Tipo da Conta (1-CC ou 2-CP): ");
	                tipo = leia.nextInt();
	            } while (tipo < 1 && tipo > 2);
	
	            System.out.println("Digite o Saldo da Conta (R$): ");
	            saldo = leia.nextFloat();

            switch (tipo) {
            case 1 -> {
                System.out.println("Digite o Limite de Crédito (R$): ");
                limite = leia.nextFloat();
            }
            
            case 2 -> {
                System.out.println("Digite o dia do Aniversario da Conta: ");
                aniversario = leia.nextInt();
            }

            }
            
			}
			
			case 2->System.out.println("Listar todas as Contas\n\n");
			case 3-> {
				System.out.println("Consultar dados da Conta - por número\n\n");
				System.out.println("Digite o número da conta: ");
                numero = leia.nextInt();
			}
			
			case 4-> {
				System.out.println("Atualizar dados da Conta\n\n");
				System.out.println("Digite o número da conta: ");
                numero = leia.nextInt();

                tipo = 1;

                System.out.println("Digite o Numero da Agência: ");
                agencia = leia.nextInt();
                System.out.println("Digite o Nome do Titular: ");
                leia.skip("\\R?");
                titular = leia.nextLine();

                System.out.println("Digite o Saldo da Conta (R$): ");
                saldo = leia.nextFloat();

                switch (tipo) {
                case 1 -> {
                    System.out.println("Digite o Limite de Crédito (R$): ");
                    limite = leia.nextFloat();

                }
                case 2 -> {
                    System.out.println("Digite o dia do Aniversario da Conta: ");
                    aniversario = leia.nextInt();

                }
                default -> {
                    System.out.println("Tipo de conta inválido!");
                }
                }

			}
			case 5-> {
				System.out.println("Apagar a Conta\n\n");
				System.out.println("Digite o número da conta: ");
                numero = leia.nextInt();
			}
	
			case 6-> {
				System.out.println("Saque\n\n");
				System.out.println("Digite o número da conta: ");
                numero = leia.nextInt();
                
                System.out.println("Digite o valor do Saque: ");
                valor = leia.nextFloat();
                
			}
			
			case 7-> {
				System.out.println("Depósito\n\n");
				System.out.println("Digite o número da conta: ");
                numero = leia.nextInt();
                
                System.out.println("Digite o valor do Depósito: ");
                valor = leia.nextFloat();
                
			}
			
			case 8-> {
				System.out.println("Transferência entre Contas\n\n");
				System.out.println("Digite o Numero da Conta de Origem: ");
                numero = leia.nextInt();
                System.out.println("Digite o Numero da Conta de Destino: ");
                numeroDestino = leia.nextInt();

                do {
                    System.out.println("Digite o Valor da Transferência (R$): ");
                    valor = leia.nextFloat();
                } while (valor <= 0);
			}
			default->System.out.println("\nOpção Inválida!\n");
			
			}
			
		}

	}

	public static void sobre() {
		System.out.println("\n**************************************************");
		System.out.println("Joyce Caroline Rodrigues - carolinerodriguesjoyce@gmail.com");
		System.out.println("github.com/Carol20Joyce");
		System.out.println("**************************************************");
		
	}
}