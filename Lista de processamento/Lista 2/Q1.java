import java.util.Scanner;

public class Q1 {

	public static void main(String[] args) {
		int num1, num2, escolha;
		Scanner sc = new Scanner(System.in);
		System.out.print("Qual operação você gostaria de fazer?"
				+ "\nSoma"
				+ "\nRaiz\n->");
		escolha = sc.nextInt();
		
		switch (escolha) {
		case 1:{
			System.out.println("Escreva um numero: ");
			num1 = sc.nextInt();
			System.out.println("Escreva um numero: ");
			num2 = sc.nextInt();
			
			num1+=num2;
			
			System.out.println("A soma é: "+num1);
			
		}
			
			break;
		case 2:{
			System.out.println("Escreva um numero: ");
			num1 = sc.nextInt();
			
			System.out.println(Math.sqrt(num1));
			
			break;
		}
		default:{
			System.out.println("Numero 1 ou 2 CARALHO");
		}
			break;
		}
		sc.close();
	}

}
