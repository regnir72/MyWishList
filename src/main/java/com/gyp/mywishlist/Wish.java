package com.gyp.mywishlist;

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
