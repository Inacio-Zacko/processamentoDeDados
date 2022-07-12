import java.util.Scanner;

public class Q4 {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		int pagamento;
		double preco, total = 0, desconto = 0, total1 = 0;
		
		System.out.println("Digite você pagou no produto: ");
		preco = sc.nextDouble();
		
		System.out.print("Digite tipo de pagamento vai ser: (1 - À vista"
				+ "\n2 - Cheque Pré-Datado"
				+ "\n3 - Parcelado em 6 vezes "
				+ "\n4 - Parcelado em 12 vezes)\n->");
		pagamento = sc.nextInt();
		
		switch (pagamento) {
		case 1:
			desconto = preco*0.15;
			total1 = preco*1.15;
			System.out.println("O total do desconto foi de "+desconto+ " com um desconto de 15% do preço "+total1);
			break;
		case 2:
			desconto = preco*0.1;
			total1 = preco*1.1;

			System.out.println("O total do desconto foi de "+desconto+ " com um desconto de 10% do preço "+total1);

			break;
		case 3:
			desconto = preco/6;
			System.out.println("O total foi de "+preco+" cada parcela custa "+desconto+" cada");

			break;
		case 4:
			desconto = preco*1.08;
			total = desconto/12;
			System.out.println("O total foi de "+desconto+" cada parcela custa " +total+ " cada com juros negativo com um acrecimo de 8% do preço "+preco);
			break;
		}
	}

}
