package com.driver;

import java.sql.SQLOutput;

public class Pizza {

    private int price;
    private Boolean isVeg;
    private String bill;
    private int addExtraCheese = 80;
    private int addExtraToppings = 100;
    private int bag = 20;
    private boolean extraCheese = false;
    private boolean extraToppings = false;
    private boolean takeAway = false;
    private int basePricePizza;

    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        if(this.isVeg){
            this.price = 300;
        }else {
            this.price = 400;
        }
        basePricePizza =this.price;
    }

    public int getPrice(){
        return this.price;
    }

    public void addExtraCheese(){
        extraCheese = true;
        this.price += addExtraCheese;
    }

    public void addExtraToppings(){
        extraToppings = true;
        this.price+=addExtraToppings;
    }

    public void addTakeaway(){
        takeAway = true;
        this.price+= bag;
    }

    public String getBill(){
        // your code goes here
        String bill ="";
        System.out.println("Base Price of the Pizza: "+basePricePizza);
        if(extraCheese){
            bill+="Extra Cheese Added: "+addExtraCheese+"\n";
        }
        if(extraToppings){
            bill+="Extra Toppings Added: "+addExtraToppings+"\n";
        }
        if (takeAway){
            bill+="Take away Added: "+bag+"\n";
        }
        bill+="Total Price: "+this.price+"\n";
        return bill;

    }
}
