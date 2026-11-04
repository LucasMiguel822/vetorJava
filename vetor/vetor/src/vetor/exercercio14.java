package vetor;

import java.util.Scanner;

public class exercercio14 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		final int TAM = 10;
		int a[], b[], i;
		a = new int[TAM];
		b = new int[TAM];
		
		  for(i = 0; i < TAM; i++) {
	            System.out.println("Digite o " + (i + 1) + " valor do vetor");
	            a[i] = ler.nextInt();
	            
	            if(a[i] % 2 == 0) {
	            	b[i] = 1;
	            }
	            else {
	            	b[i] = 0;
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
