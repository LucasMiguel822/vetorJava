package vetor;

import java.util.Scanner;

public class exercicio5 {

	public static void main(String[] args) {
	Scanner ler = new Scanner(System.in);
	final int TAM = 10;
	int a[], n,  i;
	
	a = new int[TAM];
	
	for(i = 0; i < TAM; i++) {
		System.out.println("Digite o " + (i + 1) + " valor do vetor");
		a[i] = ler.nextInt();
		n = 0;
		
		 for (n = 1; n <= a[i]; n++) {
             if (a[i] % n == 0) {
                 System.out.print(n + " ");
             }
         }
		 System.out.println(" ");
	}

	}

}
