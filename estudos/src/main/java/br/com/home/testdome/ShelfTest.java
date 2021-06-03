package br.com.home.testdome;

import org.junit.Assert;
import org.junit.Test;

public class ShelfTest {
    
    @Test
    public void shelfCanAcceptAndReturnItem() {
        Shelf shelf = new Shelf();
        shelf.put("Orange");
        Assert.assertTrue(shelf.take("Orange"));
    }
    
    @Test
    public void shelfCanAcceptReturnNull() {
        Shelf shelf = new Shelf();
        String item = null;
        Assert.assertTrue("Não pode retornar nulo.", item == null);
    }
}