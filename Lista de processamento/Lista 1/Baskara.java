import java.util.Scanner;

public class Baskara {
	
public static void main(String[] args) {
	int a, b, c;
	double delta, x1, x2;
	Scanner sc = new Scanner(System.in);
	System.out.println("Informe o a (x²) da equação");
	a = sc.nextInt();
	System.out.println("Informe o b (x) da equação");
	b = sc.nextInt();
	System.out.println("Informe o c da equação");
	c = sc.nextInt();
	
	sc.close();
	delta = Math.pow(b, 2) - (4*a*c);
	x1 = (-b + Math.sqrt(delta))/(2*a);
	x2 = (-b - Math.sqrt(delta))/(2*a);
	
	System.out.printf("O delta da equação é: %.2f",delta);
	System.out.printf("\nO x¹ da equação é: %.2f",x1);
	System.out.printf("\nO x² da equação é: %.2f",x2);
}
}