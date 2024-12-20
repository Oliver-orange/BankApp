/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package bankapp;

/**
 *
 * @author 程宇航
 */
public interface BankInterface {

    public void enqueue(String name, double savings);

    public int size();

    public boolean isEmpty();

    public Customer frontElement();

    public void enqueue(String name, double savings, String date);

    public Customer dequeue();

    public String printPQueue();

    public int getNumOfCustomers();

    public String printBQueue();

    
}
