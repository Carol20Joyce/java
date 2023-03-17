import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner leia = new Scanner(System.in);

        int numero;

        System.out.println("Digite o 1º número: ");
        numero = leia.nextInt();

        System.out.println("Digite o 2º número: ");
        numero = leia.nextInt();

        System.out.println("Digite o 3º número: ");
        numero = leia.nextInt();

        System.out.println("Digite o 4º número: ");
        numero = leia.nextInt();

        System.out.println("Digite o 5º número: ");
        numero = leia.nextInt();

        System.out.println("Digite o 6º número: ");
        numero = leia.nextInt();

        System.out.println("Digite o 7º número: ");
        numero = leia.nextInt();

        System.out.println("Digite o 8º número: ");
        numero = leia.nextInt();

        System.out.println("Digite o 9º número: ");
        numero = leia.nextInt();

        System.out.println("Digite o 10º número: ");
        numero = leia.nextInt();

        for(int contador = 0; contador <= 1 ; ++ contador) {
            if(contador%2 == 0)
                System.out.println("Total de números pares: " + (contador / 2));

        }

        for(int contador = 0; contador <= 1 ; contador ++) 
            if(contador%2 == 1)
                System.out.println("Total de números impares: " + (numero));
	}
 }
