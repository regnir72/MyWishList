package com.gyp.mywishlist;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class WishTest
{
    
    Wish instance = new Wish("Könyv", 2500);  

    @Test    
    public void testGettersDefault()
    {
        instance = new Wish("Könyv", 2500);
        assertEquals("Könyv", instance.getName(), "Get-Name");
        assertEquals(2500, instance.getPrice(), "Get-Price");
        assertEquals(0, instance.getAvailableAmount(), "Get-AvailableAmount");
    }    
    @Test    
    public void testAvailableAmount()
    {      
        assertEquals(0, instance.getAvailableAmount(), "Get-AvailableAmount-Original");
        
        instance.setAvailableAmount(1000);
        assertEquals(1000, instance.getAvailableAmount(), "Get-AvailableAmount");
    }
}
