package vetor;

import java.util.Scanner;

public class exercicio9 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		final int TAM = 10;
		int a[], b[], c[], i, j;
		a = new int[TAM];
		b = new int[TAM];
		c = new int[TAM];
		
		for(j = 0; j < TAM; j++) {
			System.out.println("Digite o " + (j + 1) + " valor do vetor A");
			a[j] = ler.nextInt();
			
		}
		
		for(i = 0; i < TAM; i++) {
			System.out.println("Digite o " + (i + 1) + " valor do vetor B");
			b[i] = ler.nextInt();
			for(j = 9; j >= i; j--) {
				if(a[j] == b[i]) {
					
					c[i] = b[i];
				}
			}
			
		}
		
		 for (j = 0; j < TAM; j++) {
			   System.out.print("Vetor A: " + a[j] + " ");

		   }
		   
		   System.out.println("");
		   
		   for (i = 0; i < TAM; i++) {
	            System.out.print("Vetor B: " + b[i] + " ");
		   }
		   
		   System.out.println("");
		   
		   for (i = 0; i < TAM; i++) {
	            System.out.print("Vetor c: " + c[i] + " ");
		   }

	}

}
