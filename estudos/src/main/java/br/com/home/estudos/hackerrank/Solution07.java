package br.com.home.estudos.hackerrank;

import java.util.Scanner;

public class Solution07 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int i = 1;
		
		while (sc.hasNext()) {
			
			String str = sc.nextLine();
			
			if(!str.equalsIgnoreCase("exit")) {
				System.out.println(i + " " + str);
				i++;
			} else {
				break;
			}
			
		}
		sc.close();
	}

}
