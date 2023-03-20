import java.util.Arrays;
import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner leia = new Scanner(System.in);

        int numero;

        System.out.println("Digite um numero:");

        int vetorInt[]={2,5,1,3,4,9,7,8,10,6};
        numero = leia.nextInt();


        Arrays.sort(vetorInt);


        for (int contador =0; contador < vetorInt.length; contador ++) {
            if(vetorInt[contador]== numero) {
                System.out.println("O numero " + numero + " esta na posição [ " + contador +" ]");

            }
            if (numero >= 10) {

                System.out.println("Número " + numero + " não encontrado! ");
                break;

        }

        }

    }}