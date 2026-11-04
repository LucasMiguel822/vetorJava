package vetor;

import java.util.Scanner;

public class exercicio1 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		final int TAM = 20;
		int a[], b[], contadorP = 0, contadorI = 19, i;
		a = new int[TAM];
		b = new int[TAM];
		
		  for(i = 0; i < TAM; i++) {
	            System.out.println("Digite o " + (i + 1) + " valor do vetor A");
	            a[i] = ler.nextInt();
	            
	            if(a[i] % 2 == 0) {
	            	b[contadorP] = a[i];
	            	contadorP++;
	            }
	            
	            else {
	            	b[contadorI] = a[i];
	            	contadorI--;
	            }
	        }
		  
		  for(i = 0; i < TAM; i++) {
	            System.out.print("Vetor A: " + a[i] + " ");
	        }

	        System.out.println("");

	        for(i = 0; i < TAM; i++) {
	            System.out.print("Vetor B: " + b[i] + " ");
	        }


	}

}
