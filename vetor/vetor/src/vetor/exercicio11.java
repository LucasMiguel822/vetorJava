package vetor;

import java.util.Scanner;

public class exercicio11 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		final int TAM = 10;
		int a[], n, test = 0, i;
		a = new int[TAM];
		
		   for(i = 0; i < TAM; i++) {
	            System.out.println("Digite o " + (i + 1) + " valor do vetor");
	            a[i] = ler.nextInt();
	        }
		   
		   System.out.println("pesquise um numero");
		   n = ler.nextInt();
		   
		   for(i = 0; i < TAM; i++) {
			   if(n == a[i]) {
				   test++;
			   }
		   }
		   
		   if(test > 0) {
			   System.out.println("o numero " + n + " esta no vetor");
		   }
		   
		   else {
			System.out.println("o numero " + n + " não esta no vetor");   
		   }
	}

}
