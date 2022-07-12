import java.util.Scanner;

public class Q2 {

	public static void main(String[] args) {
		int i, pais, qntG = 0;
		double total = 0, total1 = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Qual o seu pai de origem? (1 , 2 ou 3)");
		pais = sc.nextInt();

		switch (pais) {
		case 1:
			System.out.println("Qual o produto que você comprou? (1 a 4 || 5 a 7 || 8 a 10)");
			i = sc.nextInt();
			switch (i) {
			case 1:
				System.out.println("Quantas gramas você comprou?");
				qntG = sc.nextInt();
				total = qntG * 10;
				total1 = qntG * 10;
				break;
			case 2:
				System.out.println("Quantas gramas você comprou?");
				qntG = sc.nextInt();
				total = qntG * 10;
				total1 = qntG * 10;
				break;
			case 3:
				System.out.println("Quantas gramas você comprou?");
				qntG = sc.nextInt();
				total = qntG * 10;
				total1 = qntG * 10;
				break;
			case 4:
				System.out.println("Quantas gramas você comprou?");
				qntG = sc.nextInt();
				total = qntG * 10;
				total1 = qntG * 10;
				break;
			case 5:
				System.out.println("Quantas gramas você comprou?");
				qntG = sc.nextInt();
				total = qntG * 25;
				total1 = qntG * 25;
				break;
			case 6:
				System.out.println("Quantas gramas você comprou?");
				qntG = sc.nextInt();
				total = qntG * 25;
				total1 = qntG * 25;
				break;
			case 7:
				System.out.println("Quantas gramas você comprou?");
				qntG = sc.nextInt();
				total = qntG * 25;
				total1 = qntG * 25;
				break;
			case 8:
				System.out.println("Quantas gramas você comprou?");
				qntG = sc.nextInt();
				total = qntG * 35;
				total1 = qntG * 35;
				break;
			case 9:
				System.out.println("Quantas gramas você comprou?");
				qntG = sc.nextInt();
				total = qntG * 35;
				total1 = qntG * 35;
				break;
			case 10:
				System.out.println("Quantas gramas você comprou?");
				qntG = sc.nextInt();
				total = qntG * 35;
				total1 = qntG * 35;
				break;
			}
			break;
		case 2:
			System.out.println("Qual o produto que você comprou? (1 a 4 || 5 a 7 || 8 a 10)");
			i = sc.nextInt();
			switch (i) {
			case 1:
				System.out.println("Quantas gramas você comprou?");
				qntG = sc.nextInt();
				total = qntG * 10 * 0.15;
				total1 = qntG * 10 * 1.15;
				break;
			case 2:
				System.out.println("Quantas gramas você comprou?");
				qntG = sc.nextInt();
				total = qntG * 10 * 0.15;
				total1 = qntG * 10 * 1.15;
				break;
			case 3:
				System.out.println("Quantas gramas você comprou?");
				qntG = sc.nextInt();
				total = qntG * 10 * 0.15;
				total1 = qntG * 10 * 1.15;
				break;
			case 4:
				System.out.println("Quantas gramas você comprou?");
				qntG = sc.nextInt();
				total = qntG * 10 * 0.15;
				total1 = qntG * 10 * 1.15;
				break;
			case 5:
				System.out.println("Quantas gramas você comprou?");
				qntG = sc.nextInt();
				total = qntG * 25 * 0.15;
				total1 = qntG * 25 * 1.15;
				break;
			case 6:
				System.out.println("Quantas gramas você comprou?");
				qntG = sc.nextInt();
				total = qntG * 25 * 0.15;
				total1 = qntG * 25 * 1.15;
				break;
			case 7:
				System.out.println("Quantas gramas você comprou?");
				qntG = sc.nextInt();
				total = qntG * 25 * 0.15;
				total1 = qntG * 25 * 1.15;
				break;
			case 8:
				System.out.println("Quantas gramas você comprou?");
				qntG = sc.nextInt();
				total = qntG * 35 * 0.15;
				total1 = qntG * 35 * 1.15;
				break;
			case 9:
				System.out.println("Quantas gramas você comprou?");
				qntG = sc.nextInt();
				total = qntG * 35 * 0.15;
				total1 = qntG * 35 * 1.15;
				break;
			case 10:
				System.out.println("Quantas gramas você comprou?");
				qntG = sc.nextInt();
				total = qntG * 35 * 0.15;
				total1 = qntG * 35 * 1.15;
				break;
			}
			break;
		case 3:
			System.out.println("Qual o produto que você comprou? (1 a 4 || 5 a 7 || 8 a 10)");
			i = sc.nextInt();
			switch (i) {
			case 1:
				System.out.println("Quantas gramas você comprou?");
				qntG = sc.nextInt();
				total = qntG * 10 * 0.25;
				total1 = qntG * 10 * 1.25;
				break;
			case 2:
				System.out.println("Quantas gramas você comprou?");
				qntG = sc.nextInt();
				total = qntG * 10 * 0.15 * 0.25;
				total1 = qntG * 10 * 1.25;
				break;
			case 3:
				System.out.println("Quantas gramas você comprou?");
				qntG = sc.nextInt();
				total = qntG * 10 * 0.15 * 0.25;
				total1 = qntG * 10 * 1.25;
				break;
			case 4:
				System.out.println("Quantas gramas você comprou?");
				qntG = sc.nextInt();
				total = qntG * 10 * 0.15 * 0.25;
				total1 = qntG * 10 * 1.25;
				break;
			case 5:
				System.out.println("Quantas gramas você comprou?");
				qntG = sc.nextInt();
				total = qntG * 25 * 0.15 * 0.25;
				total1 = qntG * 25 * 1.25;
				break;
			case 6:
				System.out.println("Quantas gramas você comprou?");
				qntG = sc.nextInt();
				total = qntG * 25 * 0.15 * 0.25;
				total1 = qntG * 25 * 1.25;
				break;

			case 7:
				System.out.println("Quantas gramas você comprou?");
				qntG = sc.nextInt();
				total = qntG * 25 * 0.15 * 0.25;
				total1 = qntG * 25 * 1.25;
				break;
			case 8:
				System.out.println("Quantas gramas você comprou?");
				qntG = sc.nextInt();
				total = qntG * 35 * 0.15 * 0.25;
				total1 = qntG * 35 * 1.25;
				break;
			case 9:
				System.out.println("Quantas gramas você comprou?");
				qntG = sc.nextInt();
				total = qntG * 35 * 0.15 * 0.25;
				total1 = qntG * 35 * 1.25;
				break;
			case 10:
				System.out.println("Quantas gramas você comprou?");
				qntG = sc.nextInt();
				total = qntG * 35 * 0.15 * 0.25;
				total1 = qntG * 35 * 1.25;
				break;
			}
			break;

		}
		System.out.println("Você comprou " + qntG + "g o total comprado foi de " + total
				+ ", o valor de imposto cobrado será de R$: " + total + " O preço total será de R$"+ total1);
		sc.close();
	}
}
