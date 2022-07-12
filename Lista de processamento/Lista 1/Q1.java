import java.util.Scanner;

public class Q1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Informe um número");
		double num = sc.nextDouble();

		double quad = Math.pow(num, 2);
		double cubo = Math.pow(num, 3);
		double r2 = Math.sqrt(num);
		double r3 = Math.sqrt(num);

		System.out.printf("Número ao quadrado %.2f", quad);
		System.out.printf("\nNúmero ao cubo %.2f", cubo);
		System.out.printf("\nRaiz quadrada %.2f", r2);
		System.out.printf("\nNúmero ao cúbica %.2f", r3);

		sc.close();
	}
}
