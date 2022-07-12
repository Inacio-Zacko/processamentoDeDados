package Sequencial;

import java.util.Scanner;

public class Q3 {

	public static void main(String[] args) {
		double a, b;
		Scanner sc = new Scanner(System.in);
		System.out.println("escreva um número: ");
		a = sc.nextDouble();
		System.out.println("escreva um número: ");
		b = sc.nextDouble();
		
		sc.close();
		if(a > b) {
			System.out.println("O número "+a+" é maior");
		}
		if(a < b) {
			System.out.println("O número "+b+" é maior");
		}
		if(a == b) {
			System.out.println("Os números são iguais");
		}
	}

}
