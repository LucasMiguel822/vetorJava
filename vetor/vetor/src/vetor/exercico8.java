package vetor;

import java.util.Scanner;

public class exercico8 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		final int TAM = 10;
		int a[], b[], soma = 0, i, j;
		a = new int[TAM];
		b = new int[TAM];
		
		for(j = 0; j < TAM; j++) {
			System.out.println("Digite o " + (j + 1) + " valor do vetor A");
			a[j] = ler.nextInt();
			
		}
		
		
		for(i = 0; i < TAM; i++) {
			for(j = 9; j >= i; j--) {
				soma = a[j] + soma;
			}
			b[i] = soma;
			soma = 0;
		}
		
		
		   for (j = 0; j < TAM; j++) {
			   System.out.print("Vetor A: " + a[j] + " ");

		   }
		   
		   System.out.println("");
		   
		   for (i = 0; i < TAM; i++) {
	            System.out.print("Vetor B: " + b[i] + " ");
		   }

	}

}
