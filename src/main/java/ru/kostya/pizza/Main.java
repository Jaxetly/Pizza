package ru.kostya.pizza;

import ru.kostya.pizza.persons.*;
import java.util.Date;

public class Main {
    public static void main(String[] args) throws OrderNotReady {
        Client[] clients = new Client[3];
        for (int i=0; i<3; i++){
            clients[i] = new Client();
        }

        Cook cook1 = new Cook();
        Cook cook2 = new Cook();

        OrderList list = new OrderList();

        Order[] order = new Order[10];

        for (int i=0; i<10; i++){
            order[i] = list.next(clients[i%3], cook1, new Date(), OrderMethod.online, Pizza.pepperoni);
        }

        for (int i=0; i<5; i++){
            //order[i].changeStatus();
            order[i] = list.next(clients[(i+1)%3], cook2, new Date(), OrderMethod.offline, Pizza.carbonara);
        }

    }
}