package br.com.home.estudos.hackerrank;

import java.util.Scanner;

public class Solution06 {

	public static void main(String[] argh) {

		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();

		for (int i = 0; i < t; i++) {

			try {
				long x = sc.nextLong();
				System.out.println(x + " can be fitted in:");
				
				isByte(x);
				isShort(x);
				isInt(x);
				isLong(x);
				
			} catch (Exception e) {
				System.out.println(sc.next() + " can't be fitted anywhere.");
			}

		}
		
		sc.close();
	}
	
	private static String isByte(long x) {
		String retorno = "";
		
		if(x >= -128 && x <= 127) {
			System.out.println("* byte");			
		}
		
		return retorno;
	}
	
	private static String isShort(long x) {
		String retorno = "";
		
		if(x >= -32768 && x <= 32767) {
			System.out.println("* short");			
		}
		
		return retorno;
	}
	
	private static String isInt(long x) {
		String retorno = "";
		double minimo = Math.pow(-2, 31);
		double maximo = Math.pow(2, 31) - 1;
		
		if(x >= minimo && x <= maximo) {
			System.out.println("* int");			
		}
		
		return retorno;
	}
	
	private static String isLong(long x) {
		String retorno = "";
		double minimo = Math.pow(-2, 63);
		double maximo = Math.pow(2, 63) - 1;
		
		if(x >= minimo && x <= maximo) {
			System.out.println("* long");			
		}
		
		return retorno;
	}

}
