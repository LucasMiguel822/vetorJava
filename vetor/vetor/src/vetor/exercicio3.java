package vetor;

import java.util.Scanner;

public class exercicio3 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		final int TAM = 10;
		int primo, a[], i, j;
		
		a= new int [TAM];
		
		for(i =0; i < TAM; i++) {
			System.out.println("Digite o " + (i + 1) + " valor do vetor");
			a[i] = ler.nextInt();
			primo = 0;
			
			for(j = 1; j <= a[i]; j++) {
				if(a[i] > 0 && a[i] % j==0) {
				primo++;
			} 
				
			}
				if(primo == 2) {
					System.out.println(a[i] + " é primo");
				}
				else {
					System.out.println(a[i] + " não é primo");
				}
			
		}

	}

}
