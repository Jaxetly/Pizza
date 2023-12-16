package ru.kostya.pizza;

public enum Sale {
    pensioner(10), student(5), coupon(7);

    final int sale;
    Sale(int _sale){
        this.sale=_sale;
    }
}
