import java.util.Scanner;

public class Q3 {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		int qnt;
		double total1, total2;
		
		System.out.print("Digite a quantidade de livros você deseja comprar: ");
		qnt = sc.nextInt();
		
		total1 = 0.25*qnt+7.50;
		
		total2 = 0.5*qnt+2.50;
		
		if(total1 > total2) {
			System.out.println("O critéio A é mais vantajoso");
		}else if(total2 > total1) {
			System.out.println("O critéio B é mais vantajoso");
		}else System.out.println("Ambos são o mesmo valor");
		
		sc.close();
		
	}

}
