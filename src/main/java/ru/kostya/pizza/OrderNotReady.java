package ru.kostya.pizza;

public class OrderNotReady extends Exception {
    OrderNotReady(String a){
        super(a);
    }
}
