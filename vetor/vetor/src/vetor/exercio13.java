package vetor;

import java.util.Scanner;

public class exercio13 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		final int TAM = 10;
		int a[], test = 0, m = 4, i, j = 9;
		 a = new int[TAM];
		
		  for(i = 0; i < TAM; i++) {
	            System.out.println("Digite o " + (i + 1) + " valor do vetor");
	            a[i] = ler.nextInt();
	        }
		  
		  for(i = 0; i <= m; i++) {
	            
			  if(a[i] == a[j]) {
				  test++;
			  }
			  else {
				  
			  }
			  j--;
	        }
		  
		  if(test == 5) {
			  System.out.println("O vetor é um palindromo");
		  }
		  else {
			  System.out.println("O vetor não é um palindromo");
		  }

	}

}
