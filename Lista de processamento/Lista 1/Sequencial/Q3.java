package Sequencial;

import java.util.Scanner;

public class Q3 {

	public static void main(String[] args) {
		double a, b;
		Scanner sc = new Scanner(System.in);
		System.out.println("escreva um n�mero: ");
		a = sc.nextDouble();
		System.out.println("escreva um n�mero: ");
		b = sc.nextDouble();
		
		sc.close();
		if(a > b) {
			System.out.println("O n�mero "+a+" � maior");
		}
		if(a < b) {
			System.out.println("O n�mero "+b+" � maior");
		}
		if(a == b) {
			System.out.println("Os n�meros s�o iguais");
		}
	}

}
