import java.util.ArrayList;
import java.util.Scanner;

public class ExList1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner leia = new Scanner(System.in);

        ArrayList<String> cores = new ArrayList<String>();
        // Le agregamos datos

        String cor;

        System.out.println("Digite 5 cores ");

        for(int contador = 1; contador <=5; contador++) {

            System.out.println("\nDigite a " + contador + "º cor: ");
            cor = leia.nextLine();
            cores.add(cor);

        }

        System.out.println("\nCores Adicionadas: ");
        for ( var oCor: cores) 
            System.out.println(oCor);

        //sort para ordenar
        System.out.println("/nCores em Ordem:  ");
        cores.sort(null);
            for ( var oCor: cores) {
            System.out.println(oCor);


            leia.close();

	}

}
