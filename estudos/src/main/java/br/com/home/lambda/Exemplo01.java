package br.com.home.lambda;

import java.util.ArrayList;

public class Exemplo01 {

	//Use a lamba expression in the ArrayList's forEach() method to print every item in the list:
	public static void main(String[] args) {
		
		ArrayList<Integer> numbers = new ArrayList<Integer>();
		numbers.add(5);
		numbers.add(9);
		numbers.add(8);
		numbers.add(1);
		
		numbers.forEach((n) -> { System.out.println(n); });
	}

}
