package Sequencial;

import java.util.Scanner;

public class Q2 {

	public static void main(String[] args) {
		double a = 0;
		Scanner sc = new Scanner(System.in);
		for(int i = 0 ; i <= 2 ; i++) {
		System.out.println("Escreva a sua "+(i+1)+"� nota: ");
		a += sc.nextDouble();
		}
		sc.close();
		a /= 3;
		if(a <=3) {
			System.out.printf("Sua m�dia foi: %.2f\nStatus: Reprovado", a);
		}
		if(a >3 && a <=7) {
			System.out.printf("Sua m�dia foi: %.2f\nStatus: Em exame", a);
		}
		if(a >7) {
			System.out.printf("Sua m�dia foi: %.2f\nStatus: Aprovado", a);
		}
	}

}
