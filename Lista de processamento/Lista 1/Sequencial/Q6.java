package Sequencial;

import java.util.Scanner;

public class Q6 {

	public static void main(String[] args) {
		int a;
		Scanner sc  = new Scanner(System.in);
		
		System.out.println(" escreva um número");
		a = sc.nextInt();
		
		if(a % 2 == 0) {
			System.out.println("esse numero é par");
		}
		if(a % 2 != 0) {
			System.out.println("esse numero é impar");
		}
	}

}
