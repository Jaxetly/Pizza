package ru.kostya.pizza;

import ru.kostya.pizza.persons.Client;
import ru.kostya.pizza.persons.Cook;

import java.util.Date;

public class OrderList {
    Order main = new Order();
    Order current = main;

    OrderList() {
        main.number = 1;
        for (int i = 2; i < 11; i++) {
            current.next = new Order();
            current = current.next;
            current.number = i;
        }
        current.next = main;
    }

    public Order next(Client client, Cook cook, Date start, OrderMethod method, Pizza pizza) throws OrderNotReady {
        if (current.next.status == Status.ready || current.next.status == null){
            current = current.next;
            current.status = Status.processing;
            current.client = client;
            current.cook = cook;
            current.start = start;
            current.method = method;
            current.pizza = pizza;
        } else {
            throw new OrderNotReady("Очередь не освободилась");
        }
        return current;
    }
}
