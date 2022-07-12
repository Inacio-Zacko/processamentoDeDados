package Sequencial;

import java.util.Scanner;

public class Q5 {

	public static void main(String[] args) {
		double a, b, c, d;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Você deve escrever todos os números em ordem crescente menos o 4º numero");
		
		System.out.println("Escreva um numero");
		a= sc.nextDouble();
		System.out.println("Escreva um numero");
		b= sc.nextDouble();
		System.out.println("Escreva um numero");
		c= sc.nextDouble();
		System.out.println("Escreva um numero");
		d= sc.nextDouble();
		
		sc.close();
		if(d > c) {
		System.out.println(d +", "+c+ ", " +b+ ", " +a);
		}
		
		if(d > b && d < c) {
			System.out.println(c+ ", "+d+", " +b+ ", " +a);
			}
		if(d > a && d < c) {
			System.out.println(c+ ", " +b+", " +d+ ", " +a);
			}
		if(d<a) {
			System.out.println(c+ ", " +b+", " +a+ ", " +d);
		}
	}

}
