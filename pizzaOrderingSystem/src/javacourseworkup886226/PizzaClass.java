/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javacourseworkup886226;
import java.text.NumberFormat;
/**
 *
 * @author Matt
 */
public class PizzaClass {
    /*Sets a string for the parts of the pizza */
    private String size;
    private String crust;
    private String sauce;
    private String topping1;
    private String topping2;
    
    
    
    public PizzaClass(String size, String crust, String sauce, String topping1, String topping2){
       /*Sets all the varaibles about the pizza */
       this.size = size;
       this.crust = crust;
       this.sauce = sauce; 
       this.topping1 = topping1;
       this.topping2 = topping2;
    }
    
    public String makeCost (){
        
        NumberFormat formatter = NumberFormat.getCurrencyInstance();
        
        
        /*This creates the full pizza string with prices */
        String priceOfPizza = "";
        priceOfPizza += this.size + " Size: " + String.valueOf(formatter.format(sizeCost())) + "\n";
        priceOfPizza += this.crust + " Crust: " + String.valueOf(formatter.format(crustCost())) + "\n";
        priceOfPizza += "BASE COST: " + String.valueOf(formatter.format(baseCost())) + "\n";
        priceOfPizza += this.topping1 + " Topping: 5* " + String.valueOf(formatter.format(toppingCost(this.topping1, 5)))+ "\n";
        priceOfPizza += this.topping2 + " Topping: 4* " + String.valueOf(formatter.format(toppingCost(this.topping2, 4))) + "\n";
        priceOfPizza += this.sauce + " Sauce: " + String.valueOf(formatter.format(sauceCost()))+ "\n";
        return priceOfPizza;
    }
    
    public Double sizeCost(){
        /*this calculates the cost of for the size. */
        Double cost;
        if (this.size == "Small"){
            return cost = 9.45;
        }
        else if (this.size == "Medium"){
            return cost = 11.87;
        }
        else if (this.size == "Large"){
            return cost = 15.90;
        }
        else {
            return cost = 0.0;
        }
    }
    
    public Double crustCost(){
        /*This calculates the cost for the crust. */
        Double cost;
        if (this.crust == "Thin"){
            return cost = 1.08;
        }
        else if (this.crust == "Deep"){
            return cost = 1.10;
        }
        else if (this.crust == "Stuffed"){
            return cost = 2.14;
        }
        else {
            return cost = 0.0;
        }
    }
    
    public Double sauceCost(){
        /*This returns the cost of the sauce. */
        Double cost;
        if (this.sauce == "Pesto"){
            return cost = 0.50;
        }
        else {
            return cost = 0.0;
        }
    }
    
    public Double toppingCost(String toppingType, int amountOfToppings){
        /*Ths calculates the cost for the toppings both times */
        if (toppingType == "Olive"){
            Double cost = 0.08 * amountOfToppings; 
            return cost;
        }
        else if (toppingType == "Extra Cheese"){
            Double cost = 0.02 * amountOfToppings; 
            return cost;
        }
        else if (toppingType == "Chilli"){
            Double cost = 0.06 * amountOfToppings; 
            return cost;
        }
        else if (toppingType == "Pepperoni"){
            Double cost = 0.10 * amountOfToppings; 
            return cost;
        }
        else if (toppingType == "Mushroom"){
            Double cost = 0.03 * amountOfToppings; 
            return cost;
        }
        else if (toppingType == "Rocket"){
            Double cost = 0.05 * amountOfToppings; 
            return cost;
        }
        else if (toppingType == "Jalapenos"){
            Double cost = 0.20 * amountOfToppings; 
            return cost;
        }
        else if (toppingType == "Onion"){
            Double cost = 0.7 * amountOfToppings; 
            return cost;
        }
        else if (toppingType == "Anchovy"){
            Double cost = 0.09 * amountOfToppings; 
            return cost;
        }
        else {
            Double cost;
            return cost = 0.0;
        }
    }
    
    public Double totalCost(){
        /*This adds up the whole cost for the pizza */
        Double totalCost = baseCost()+ toppingCost(this.topping1, 5) + toppingCost(this.topping2, 4) + sauceCost(); 
        return totalCost;
    }
    
    public Double baseCost(){
        /*This calcuates the cost of the base */
        Double basePrice = sizeCost() + crustCost();
        return basePrice;
    }
}

