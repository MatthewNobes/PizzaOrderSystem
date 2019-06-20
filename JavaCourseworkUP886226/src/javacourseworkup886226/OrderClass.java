/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javacourseworkup886226;

import java.util.ArrayList;

/**
 *
 * @author Matt
 */
public class OrderClass {
    /*Sets an array to hold the different pizzas in as strings
    The secound array holds a list of the prices of the pizzas*/
    private ArrayList<String> PizzaList;
    private ArrayList<Double> CostList;
     
    public OrderClass(){
        /* */
         this.PizzaList = new ArrayList<String>();
         this.CostList = new ArrayList<Double>();
    }
    
    /*Creates a string for the whole order by complying an array into a single string */
    public String wholeOrder(){
        String completeOrder = "";
        for (int i=0;i < PizzaList.size();i++)
        {
          completeOrder += this.PizzaList.get(i) + "\n";
        }
        return completeOrder;
    }
    
    /*Creates a single prices for the wole order by adding all the pizzas cost together. */
    public Double orderCost(){
        Double orderCost = 0.0;
        for (int i=0;i < CostList.size();i++)
        {
          orderCost += this.CostList.get(i);
        }
        return orderCost;
    }
    
    /*Ouputs the number of pizzas in the pizza array */
    public int numOfPizzas(){
        int numPizzas = PizzaList.size();
        return numPizzas;
    }
    
    /*creates a new pizza and adds it to the pizza array and adds the price to the cost array */
    public void addPizza(String size, String crust, String sauce, String topping1, String topping2){
        PizzaClass oc = new PizzaClass(size, crust, sauce, topping1, topping2);
        Double cost = oc.totalCost();
        String NewPizza = "TOTAL COST: £" + cost + "\n";
        NewPizza += oc.makeCost();
        PizzaList.add(NewPizza);
        CostList.add(cost);
    }
    
    /*removes the passed pizza from the pizza array and cost array. */
    public void removePizza(int pizzaToRemove){
        PizzaList.remove(pizzaToRemove);
        CostList.remove(pizzaToRemove);
    }
    
    /*updates a selected pizza in both arrays with the passed values. */
    public void updatePizza(int pizzaToUpdate, String size, String crust, String sauce, String topping1, String topping2){
        PizzaClass oc = new PizzaClass(size, crust, sauce, topping1, topping2);
        Double cost = oc.totalCost();
        String NewPizza = "TOTAL COST: £" + cost + "\n";
        NewPizza += oc.makeCost();
        PizzaList.set(pizzaToUpdate, NewPizza);
        CostList.set(pizzaToUpdate, cost);
    }
    
    /*grabs the string for specific pizza that it is passed */
    public String getSpecificPizza(int specificPizzaID){
        String specificPizza;
        specificPizza = this.PizzaList.get(specificPizzaID);
        return specificPizza;
    }
}
