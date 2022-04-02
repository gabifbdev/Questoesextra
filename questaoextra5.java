package Familia51;

import java.util.Scanner;

public class questaoextra5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		float n1,n2,n3,media;
		Scanner leia = new Scanner(System.in);
		System.out.println("Primeira nota:");
		n1 = leia.nextInt();
		System.out.println("Segunda nota:");
		n2 = leia.nextInt();
		System.out.println("Terceira nota:");
		n3 = leia.nextInt();
		
		media = ((n1 * 2) + (n2* 3) + (n3 * 5)) / (2 + 3 + 5);
		
		System.out.printf("\nA média final do aluno é:" +media);



			
	}

}
