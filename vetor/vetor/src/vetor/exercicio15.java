package vetor;

import java.util.Scanner;

public class exercicio15 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		final int TAM = 10;
		int a[], b[], c[], i;
		a = new int[TAM];
		b = new int[TAM];
		c = new int[TAM];
		
		  for(i = 0; i < TAM; i++) {
	            System.out.println("Digite o " + (i + 1) + " valor do vetor A");
	            a[i] = ler.nextInt();
	        }
		  
		  for(i = 0; i < TAM; i++) {
	            System.out.println("Digite o " + (i + 1) + " valor do vetor B");
	            b[i] = ler.nextInt();
	        }
		  
		  for(i = 0; i < TAM; i++) {
	            if(a[i] > b[i]) {
	            	c[i] = 1;
	            }
	            
	            else if(a[i] == b[i]) {
	            	c[i] = 0;
	            }
	            
	            else {
	            	c[i] = -1;
	            }
	        }
		  
	        for(i = 0; i < TAM; i++) {
	            System.out.print("Vetor A: " + a[i] + " ");
	        }

	        System.out.println("");

	        for(i = 0; i < TAM; i++) {
	            System.out.print("Vetor B: " + b[i] + " ");
	        }

	        System.out.println("");

	        for(i = 0; i < TAM; i++) {
	            System.out.print("Vetor C: " + c[i] + " ");
	        }

	}

}
