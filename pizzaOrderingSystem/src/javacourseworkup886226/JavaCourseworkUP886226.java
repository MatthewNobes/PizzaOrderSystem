/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javacourseworkup886226;

/**
 *
 * @author Matt
 */
import java.text.NumberFormat; 
public class JavaCourseworkUP886226 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /* Task one test code*/
        System.out.println("Task 1 Output");
        PizzaClass cw = new PizzaClass("Medium", "Thin", "Pesto", "Extra Cheese", "Chilli");
        System.out.println("TOTAL COST: £" + cw.totalCost());
        System.out.println(cw.makeCost());
        
        
        /*Task two test code*/
        System.out.println("Task 2 Output");
        OrderClass oc = new OrderClass();
        oc.addPizza("Medium", "Thin", "Pesto", "Extra Cheese", "Chilli");
        oc.addPizza("Medium", "Stuffed", "Pesto", "Olive", "Onion");
        oc.addPizza("Small", "Thin", "Pesto", "Chilli", "Pepperoni");
        oc.addPizza("Small", "Thin", "Pesto", "Olive", "Olive");
        
        /*Task two output the whole order*/
        System.out.println("Task 2 Output of whole order");
        System.out.println(oc.wholeOrder());
        
        /*Task two removing test code*/
        oc.removePizza(2);
        
        /*Task two output the whole order*/
        System.out.println("Task 2 Output of order after removing third pizza");
        System.out.println(oc.wholeOrder());
        
        /*Task two updating test code
        the number 1 is the number of pizza in the order that will be changed*/
        oc.updatePizza(1, "Medium", "Stuffed", "Pesto", "Olive", "Onion");
     
        /*Task two output the whole order*/
        System.out.println("Task 2 Output of order after updating secound pizza");
        System.out.println(oc.wholeOrder());
        
        NumberFormat formatter = NumberFormat.getCurrencyInstance();
        
        /*Task two outputs the number of pizzas*/
        System.out.println("Number of pizzas in order: " + oc.numOfPizzas());
        
        /*Task two outputs the total cost*/
        System.out.println("TOTAL ORDER COST: " + formatter.format(oc.orderCost()));
        
      
                
    }
    
}
