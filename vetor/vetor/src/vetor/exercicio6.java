package vetor;

import java.util.Scanner;

public class exercicio6 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		final int TAM = 11;
		int a[], potencia = 1, i;
		a = new int[TAM];
		
		for(i = 0; i < TAM; i++) {
			
			a[i] = potencia;
			
			potencia = potencia * 2; 
			
			System.out.print(a[i] + " ");
			
	
			
		}

	}

}
