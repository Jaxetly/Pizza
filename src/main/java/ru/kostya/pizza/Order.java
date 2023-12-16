package ru.kostya.pizza;

import ru.kostya.pizza.persons.*;

import java.util.Date;

public class Order {
    Client client;
    Cook cook;
    Status status;
    Date start;
    Order next;
    OrderMethod method;
    Pizza pizza;
    int number;

    public void changeStatus(){
        if (this.status == Status.ready){
            this.status = Status.processing;
        } else {
            this.status = Status.ready;
        }
    }

}
