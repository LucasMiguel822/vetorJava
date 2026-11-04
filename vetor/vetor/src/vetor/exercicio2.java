package vetor;

import java.util.Scanner;

public class exercicio2 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		final int TAM = 5;
		int a[], n, resultado, i;
		a = new int[TAM];
		
		for(i=0; i < TAM; i++) {
			System.out.println("Digite o " + (i + 1) + " valor do vetor");
			a[i]= ler.nextInt();
			n=0;
			
			while(n <= 10) {
				resultado = a[i] * n;
				System.out.println(a[i] + " x " + n + " = " + resultado);
				n++;
			}
			

	}
		
	}

}
