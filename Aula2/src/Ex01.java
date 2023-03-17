import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner leia = new Scanner(System.in);

        int numeroA, numeroB, numeroC;

        System.out.println("Digite o numero A: ");
        numeroA= leia.nextInt();

        System.out.println("Digite o numero B: ");
        numeroB= leia.nextInt();

        System.out.println("Digite o numero C: ");
        numeroC= leia.nextInt();

        if ((numeroA + numeroB) > numeroC)
            System.out.println("A soma do A + B é maior que C");
        else if ((numeroA + numeroB) < numeroC)
            System.out.println("A soma do A + B é menor que C");
        else if ((numeroA + numeroB) == numeroC)
            System.out.println("A soma de A + B é igual a C");


	}

}
