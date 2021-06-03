package br.com.home.testdome;

import java.util.ArrayList;
import java.util.Arrays;

public class MovingTotal {
    /**
     * Adds/appends list of integers at the end of internal list.
     */
	private int[] lista;
	private ArrayList lista2;
	
    public void append(int[] list) {
    	if(Arrays.asList(this.lista).isEmpty()) {
    		this.lista = list;	
    	}else {
    		this.lista = Arrays.copyOf(this.lista, 3);
    	}
    	
    }

    /**
     * Returns boolean representing if any three consecutive integers in the
     * internal list have given total.
     */
    public boolean contains(int total) {
    	int copy[] = Arrays.copyOf(this.lista, 3);
    	int result = Arrays.stream(copy).sum();
    	
    	if(result == total) {
    		return true;
    	}else {
    		return false;
    	}
    }

    public static void main(String[] args) {
        MovingTotal movingTotal = new MovingTotal();

        movingTotal.append(new int[] { 1, 2, 3, 4 });

        System.out.println(movingTotal.contains(6));
        System.out.println(movingTotal.contains(9));
        System.out.println(movingTotal.contains(12));
        System.out.println(movingTotal.contains(7));

        movingTotal.append(new int[] { 5 });

        System.out.println(movingTotal.contains(6));
        System.out.println(movingTotal.contains(9));        
        System.out.println(movingTotal.contains(12));
        System.out.println(movingTotal.contains(7));
    }
}