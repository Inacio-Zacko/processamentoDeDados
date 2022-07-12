package Sequencial;

import java.util.Scanner;

public class Q4 {

	public static void main(String[] args) {
		double a, b, c;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Escreva um número: ");
		a = sc.nextDouble();
		System.out.println("Escreva um número: ");
		b = sc.nextDouble();
		System.out.println("Escreva um número: ");
		c = sc.nextDouble();
		
		sc.close();
		
		if(a > b && a > c && b < c) {
			System.out.println(b + ", " +c+ ", "+a);
		}
		if(a > b && a > c && b > c) {
			System.out.println(c + ", " +b+ ", "+a);
		}
		// ===========================================
		if(b > a && b > c && a < c) {
			System.out.println(a + ", " +c+ ", "+b);
		}
		if(b > a && b > c && a > c) {
			System.out.println(c + ", " +a+ ", "+b);
		//=============================================
		}
		if(c > a && c > b && b < a) {
			System.out.println(b + ", " +a+ ", "+c);
		}
		if(c > a && c > b && b > a) {
			System.out.println(a + ", " +b+ ", "+c);
		}
		
	}

}
