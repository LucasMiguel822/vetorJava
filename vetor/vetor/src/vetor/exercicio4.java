package vetor;

import java.util.Scanner;

public class exercicio4 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		final int TAM = 10;
		int a[], n, i;
		a = new int[TAM];
		
		for(i = 0; i < TAM; i++) {
			System.out.println("Digite o " + (i + 1) + " valor do vetor");
			a[i] = ler.nextInt();
			
			n = 0;
			
			while(n <= a[i]) {
				System.out.print(n + " ");
				n = n + 2;
			}
			System.out.println("");
		}

	}

}
