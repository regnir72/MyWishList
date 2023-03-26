package com.gyp.mywishlist;

import java.util.ArrayList;

public class WishInfo
{
    com.gyp.mywishlist.Wish wish;
    ArrayList<com.gyp.mywishlist.Wish> wishes = new ArrayList<>();
 
    public void newWish(String name, int price)
    {
        
    }    
    public void removeWish()
    {
        
    }    
    public int numberOfWishes()
    {
        return 0;
    }
    public int totalValueOfWishes()
    {
        return 0;
    }
    public boolean isBuyable()
    {
        return false;
    }
    
    
    public class Wish
    {
        private String name;
        private int price;
        private int availableAmount;

        public Wish(String name, int price)
        {
            this.name = name;
            this.price = price;
            this.availableAmount = 0;
        }  

        public String getName()
        {
            return name;
        }

        public int getPrice()
        {
            return price;
        }

        public int getAvailableAmount()
        {
            return availableAmount;
        }

        public void setAvailableAmount(int availableAmount)
        {
            this.availableAmount = availableAmount;
        }
    }
}
