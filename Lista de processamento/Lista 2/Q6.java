import java.util.Scanner;

public class Q6 {

	public static void main(String[] args) {
		int opcao;
		double salario;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Qual op??o voc? gostaria de ver? \n"
				+ "1. Imposto\r\n"
				+ "2. Novo sal?rio\r\n"
				+ "3. Classifica??o\n->");
		opcao = sc.nextInt();
		
		switch (opcao) {
		case 1:{
			System.out.println("Qual o seu sal?rio?");
			salario = sc.nextDouble();
			if(salario < 500) {
				System.out.println("O imposto em cima de seu sal?rio ? "+salario*(0.05));
			}else if(salario >=500 && salario <= 850) {
				System.out.println("O imposto em cima de seu sal?rio ? "+salario*(0.1)); 
			}else if(salario > 850) {
				System.out.println("O imposto em cima de seu sal?rio ? "+salario*(0.15));
			}
			break;
		}
		case 2:{
			System.out.println("Qual o seu sal?rio?");
			salario = sc.nextDouble();
			if(salario > 1500) {
				System.out.println("Seu novo sal?rio ? de R$"+salario+(25));
			}else if(salario > 750 && salario <=1500) {
				System.out.println("Seu novo sal?rio ? de R$"+salario+(50));
			}else if(salario >= 450 && salario <750) {
				System.out.println("Seu novo sal?rio ? de R$"+salario+(75));
			}else if(salario <= 450) {
				System.out.println("Seu novo sal?rio ? de R$"+salario+(100));
			}
			
			break;
		}
		case 3:{
			System.out.println("Qual o seu sal?rio?");
			salario = sc.nextDouble();
			if(salario <=750) {
				System.out.println("Mal remunerado");
			}else if(salario > 750) {
				System.out.println("Bem remunerado");
			}
			break;
		}
		}
		sc.close();
	}

}
