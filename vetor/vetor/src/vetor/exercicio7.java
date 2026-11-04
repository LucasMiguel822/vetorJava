package vetor;

import java.util.Scanner;

public class exercicio7 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		final int TAM = 15;
		int a[], b[], fatorial = 1, i, j = 1;
		a = new int[TAM];
		b = new int[TAM];
		
		for(i = 0; i < TAM; i++) {
			System.out.println("Digite o " + (i + 1) + " valor do vetor");
			a[i] = ler.nextInt();
			
			while(j <= a[i]) {
				fatorial = j * fatorial;
				j++;
			}
			
			b[i] = fatorial;
			
		}

		
		   for (i = 0; i < TAM; i++) {
			   System.out.print("Vetor A: " + a[i] + " ");

		   }
		   
		   System.out.println("");
		   
		   for (i = 0; i < TAM; i++) {
	            System.out.print("Vetor B: " + b[i] + " ");
		   }
		   
	}

}
