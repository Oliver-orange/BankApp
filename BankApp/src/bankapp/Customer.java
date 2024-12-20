/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bankapp;

/**
 *
 * @author 程宇航
 */
public class Customer {

    private String name;
    private double savings;
    private int priority;
    private String date;

    public Customer(String name, double savings, String date) {
        this.name = name;
        this.savings = savings;
        this.priority = calculatePriority();
        this.date = date;
    }

    private int calculatePriority() {
        if (savings > 500000.00) {
            return 3; // Priority 3
        } else if (savings >= 50001 && savings <= 499999) {
            return 2; // Priority 2
        } else {
            return 1; // Priority 1
        }
    }

    // Getter methods
    public String getName() {
        return name;
    }

    public String getDate() {
        return date;
    }

    public double getSavings() {
        return savings;
    }

    public int getPriority() {
        return priority;
    }
}
