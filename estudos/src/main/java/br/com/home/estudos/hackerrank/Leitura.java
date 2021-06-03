package br.com.home.estudos.hackerrank;

import java.util.Scanner;

public class Leitura {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		int c = scanner.nextInt();
		scanner.close();
		
		System.out.println("A is : " + a);
		System.out.println("B is : " + b);
		System.out.println("C is : " + c);
	}

}
