package Sequencial;

import java.util.Scanner;

public class Q6 {

	public static void main(String[] args) {
		int a;
		Scanner sc  = new Scanner(System.in);
		
		System.out.println(" escreva um n�mero");
		a = sc.nextInt();
		
		if(a % 2 == 0) {
			System.out.println("esse numero � par");
		}
		if(a % 2 != 0) {
			System.out.println("esse numero � impar");
		}
	}

}
