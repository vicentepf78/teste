package br.com.home.estudos.hackerrank;

import org.junit.Assert;
import org.junit.Test;

public class AccountTest {
    private double epsilon = 1e-6;

    @Test
    public void accountCannotHaveNegativeOverdraftLimit() {
        Account account = new Account(-20);
        
        Assert.assertEquals(0d, account.getOverdraftLimit(), epsilon);
    }
    
    @Test
    public void depositoNaoPoseSerNegativo() {
    	Account account = new Account(0);
    	
    	Assert.assertFalse("deposito não pode ser negativo.",account.deposit(-30));
    }
    
    @Test 
    public void retiradaNaoPodeSerNegativa() {
    	Account account = new Account(-20);
    	
    	Assert.assertFalse("Retirada não pode ser negativa.",account.withdraw(-30));
    }
}