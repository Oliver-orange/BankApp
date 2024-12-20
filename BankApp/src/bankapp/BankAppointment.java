/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bankapp;

/**
 *
 * @author Yuhang Cheng
 */
import java.util.*;

import java.util.ArrayList;

/**
 *
 * @author Yuhang Cheng
 */
public class BankAppointment implements BankInterface {

    private ArrayList<Customer> theBQueue;

    public BankAppointment() {
        theBQueue = new ArrayList<>();
    }

    public boolean isEmpty() {
        return theBQueue.isEmpty();
    }

    public int size() {
        return theBQueue.size();
    }

    private int findInsertPosition(int newPriority) {
        int position = 0;
        for (; position < theBQueue.size(); position++) {
            if (theBQueue.get(position).getPriority() < newPriority) {
                break; // Found the correct position to insert
            }
        }
        return position; // Return the correct insert position
    }

    public Customer frontElement() {
        if (theBQueue.size() > 0) {
            return theBQueue.get(0);
        } else {
            return null;
        }
    }

    public void enqueue(String name, double savings, String date) {
        Customer newCustomer = new Customer(name, savings, date);
        int insertPosition = findInsertPosition(newCustomer.getPriority());
        theBQueue.add(insertPosition, newCustomer);
    }

    public Customer dequeue() {
        if (!theBQueue.isEmpty()) {
            return theBQueue.remove(0);
        } else {
            return null; // Queue is empty
        }
    }

    public int getNumOfCustomers() {
        return theBQueue.size();
    }

    public List<Customer> listAllCustomers() {
        return new ArrayList<>(theBQueue); // Return a copy to prevent external modification
    }

    public String printBQueue() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void enqueue(String name, double savings) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public String printPQueue() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
