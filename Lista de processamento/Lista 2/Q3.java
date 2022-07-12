import java.util.Scanner;

public class Q3 {

	public static void main(String[] args) {
		int dia1, mes1, ano1;
		int dia2, mes2, ano2;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Escreva um dia: ");
		dia1 = sc.nextInt();
		System.out.print("Escreva um mes: ");
		mes1 = sc.nextInt();
		System.out.print("Escreva um ano: ");
		ano1 = sc.nextInt();
		
		System.out.print("Escreva um dia: ");
		dia2 = sc.nextInt();
		System.out.print("Escreva um mes: ");
		mes2 = sc.nextInt();
		System.out.print("Escreva um ano: ");
		ano2 = sc.nextInt();
		
		sc.close();
		
		if(ano1 == ano2) {
			if(mes1 == mes2) {
				if(dia1 == dia2) {
					System.out.println("As duas datas são iguais");
				}else if(dia1 > dia2) {
					System.out.println("a data "+dia1+"\\"+mes1+"\\"+ano1+" é a maior");
				}else if(dia1 < dia2) {
					System.out.println("a data "+dia2+"\\"+mes2+"\\"+ano2+" é a maior");
				}
			}else if(mes1 > mes2) {
				System.out.println("a data "+dia1+"\\"+mes1+"\\"+ano1+" é a maior");
			}else if(mes1 < mes2) {
				System.out.println("a data "+dia2+"\\"+mes2+"\\"+ano2+" é a maior");
			}
		}else if(ano1 > ano2) {
			System.out.println("a data "+dia1+"\\"+mes1+"\\"+ano1+" é a maior");
		}else if(ano1 < ano2) {
			System.out.println("a data "+dia2+"\\"+mes2+"\\"+ano2+" é a maior");
		}

	}

}
