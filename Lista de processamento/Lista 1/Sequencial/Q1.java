package Sequencial;

import java.util.Scanner;

public class Q1 {

	public static void main(String[] args) {
		double nota[] = new double[3], media = 0, total = 0;
		Scanner sc = new Scanner(System.in);
		
		for(int i = 0 ; i < 1 ; i++) { 
		System.out.println("Qual seu conceito na nota de Trabalho de laboratório?");
		nota[i] = sc.nextDouble();
		nota[i] *= 2;
		i++;
		System.out.println("Qual seu conceito na nota de Avaliação semestral?");
		nota[i] = sc.nextDouble();
		nota[i] *= 3;
		i++;
		System.out.println("Qual seu conceito na nota de Exame final?");
		nota[i] = sc.nextDouble();
		nota[i] *= 5;
		i++;
		}
		
		for(int i = 0 ; i < nota.length ; i++) {
			total += nota[i];
		}
			media = total/10;
			System.out.printf("Sua média é: %.2f",media);
			if(media >=8) {
				System.out.println("\nConseito: A");
		}
			if(media <8 && media >=7) {
				System.out.println("\nConseito: B");
		}
			if(media <7 && media >=6) {
				System.out.println("\nConseito: C");
		}
			if(media <6 && media >=5) {
				System.out.println("\nConseito: D");
		}
			if(media <=5) {
				System.out.println("\nConseito: E");
		}
			sc.close();
	}

}
