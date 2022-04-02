package Familia51;

import java.util.Scanner;
public class questaoextra4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner leia = new Scanner(System.in);
		double A, B, C, D, R, S;
		
		System.out.println("\nInsira o valor de A: ");
		A = leia.nextInt();
		System.out.println("\nInsira o valor de B: ");
		B = leia.nextInt();
		System.out.println("\nInsira o valor de C: ");
		C = leia.nextInt();
		
		R = Math.pow((A+B), 2);
		S = Math.pow(B+C, 2);
		D = (R + S)/2;
		
		System.out.printf("\nMedia aritmética arredondada: %2.2f" , D ,".");
		
		
	}

}
