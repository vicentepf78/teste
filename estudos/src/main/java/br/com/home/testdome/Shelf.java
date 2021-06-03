package br.com.home.testdome;

import java.util.ArrayList;
import java.util.List;

public class Shelf {
    private List<String> items = new ArrayList<>();
    
    public void put(String item) {
        if(item != null && !item.isEmpty()) {
            this.items.add(item);
        }else {
        	new RuntimeException("Não pode adicionar valores nulo.");
        }
    }
	    
    public boolean take(String item) {
        if(items.contains(item)) {
            items.remove(item);
            return true;
        }
        
        return false;
    }
}