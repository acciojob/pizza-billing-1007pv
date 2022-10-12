package com.driver;
public class Pizza {
    private int price;
    private Boolean isVeg;
    private String bill;
    private int addExtraCheese;
    private int addExtraToppings;
    private int bag;
    private boolean extraCheese;
    private boolean extraToppings;
    private boolean takeAway;
    private boolean isBillGenerated;
    public Pizza(Boolean isVeg){
        this.extraCheese = false;
        this.extraToppings = false;
        this.takeAway = false;
        this.addExtraCheese=80;
        this.isVeg = isVeg;

        this.bag=20;

        if(this.isVeg){
            this.price = 300;
            this.addExtraToppings=70;
        }else {
            this.price = 400;
            this.addExtraToppings=120;
        }
        this.bill="Base Price Of The Pizza: "+this.price+"\n";
    }

    public int getPrice(){
        return this.price;
    }

    public void addExtraCheese(){
        if(extraCheese==false) {
            this.price = this.price + this.addExtraCheese;
            extraCheese = true;
        }
    }

    public void addExtraToppings(){
        if(extraToppings==false){
            this.price+=this.addExtraToppings;
            extraToppings = true;
        }
    }

    public void addTakeaway(){
        if(takeAway==false) {
            this.price += bag;
            takeAway = true;
        }
    }

    public String getBill(){
        if(isBillGenerated==false) {
            isBillGenerated = true;
            if (extraCheese) {
                this.bill += "Extra Cheese Added: " + this.addExtraCheese + "\n";
            }
            if (extraToppings) {
                this.bill += "Extra Toppings Added: " + this.addExtraToppings + "\n";
            }
            if (takeAway) {
                this.bill += "Paperbag Added: " + this.bag + "\n";
            }
            this.bill += "Total Price: " + this.price + "\n";
        }
            return this.bill;
        }
    }
