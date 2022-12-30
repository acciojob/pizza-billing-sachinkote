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
    private boolean isBillGen;
    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        // your code goes here
        if(isVeg==true)
        {
        	this.price=300;
        	this.extraToppings=70;
        	        }
        else
        {
        	this.price=400;
        	this.extraToppings=120;
        	
        }
        this.extraCheese=80;
        this.paperbag=20;
        this.isCheeseAdded=false;
        this.isToppingAdded=false;
        this.isPaperBagAdded=false;
        this.isBillGen=false;
        this.bill="Base Price Of The Pizza:"+this.price+"\n";
        
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
    	if(isToppingAdded==false )
    	{
    		this.price=this.price+this.extraToppings;
    		isToppingAdded=true;
    	}
    }

    public void addTakeaway(){
        // your code goes here
    	
    	if(isPaperBagAdded==false)
    	{
    	this.price=this.price+this.paperbag;
    	isPaperBagAdded=true;
    	}
    }

    public String getBill(){
        // your code goes here
    	if(isBillGen==false)
    	{
    	if(isCheeseAdded==true)
    		bill=bill+"Extra Cheese Added:"+this.extraCheese+"\n";
    	if(isToppingAdded==true)
    		bill=bill+"Extra Toppings Added:"+this.extraToppings+"\n";
    	if(isPaperBagAdded==true)
    		bill=bill+"Paperbag Added:"+this.paperbag+"\n";
    	
    	bill=bill+"Total Price:"+price+"\n";
    	isBillGen=true;
    	}
        return this.bill;
    
    }
}
