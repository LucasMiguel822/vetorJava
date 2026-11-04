package vetor;

import java.util.Scanner;

public class exercicio12 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		final int TAM = 10;
		int a[], c,  i, j;
		a = new int[TAM];
		
		  for(i = 0; i < TAM; i++) {
	            System.out.println("Informe o seu codigo da merenda");
	            a[i] = ler.nextInt();
	            
	            c = a[i];
	            
	            for(j = 0; j < i; j++) {

	                if(c == a[j]) {
	                    break;
	                }

	            }

	            if(j < i) {
	                System.out.println("Você já comeu");
	            } 
	            else {
	                System.out.println("Pegue o seu lanche");
	            }
	        }
		  

	}

}
