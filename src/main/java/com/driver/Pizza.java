package com.driver;

public class Pizza {

    private int price;
    private Boolean isVeg;
    private String bill;
    private int extraCheese;
    private int extraToppings;
    private int paperbag;
    private boolean isCheeseAdded;
    private boolean isToppingAdded;
    private boolean isPaperBagAdded;
    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        // your code goes here
        if(isVeg==true)
        {
        	this.price=300;
        	this.extraToppings=70;
        	this.bill="Base Price Of The Pizza: 300"+"\n";
        }
        else
        {
        	this.price=400;
        	this.extraToppings=120;
        	this.bill="Base Price Of The Pizza: 400"+"\n";
        }
        this.extraCheese=80;
        this.paperbag=20;
        this.isCheeseAdded=false;
        this.isToppingAdded=false;
        this.isPaperBagAdded=false;
        
    }

    public int getPrice(){
        return this.price;
    }

    public void addExtraCheese(){
        // your code goes here
    	
    	if(isCheeseAdded==false) {
    		price=price+extraCheese;
    		isCheeseAdded=true;
    	}
    }

    public void addExtraToppings(){
        // your code goes here
    	if(isToppingAdded==false && isCheeseAdded==true)
    	{
    	if(isVeg==true)
    	{
    		
    		price=price+this.extraToppings;
    		isToppingAdded=true;
    		
    	}
    	else
    	{
    		price=price+this.extraToppings;
    		isToppingAdded=true;
    	}
    	}
    }

    public void addTakeaway(){
        // your code goes here
    	
    	if(isPaperBagAdded==false)
    	{
    	price=price+this.paperbag;
    	isPaperBagAdded=true;
    	}
    }

    public String getBill(){
        // your code goes here
    	
    	if(isCheeseAdded==true)
    		bill=bill+"Extra Cheese Added: 80"+"\n";
    	if(isToppingAdded==true)
    		bill=bill+"Extra Toppings Added:"+extraToppings+"\n";
    	if(isPaperBagAdded==true)
    		bill=bill+"Paperbag Added: 20"+"\n";
    	
    	bill=bill+"Total Price:"+price+"\n";
        return this.bill;
    }
}
