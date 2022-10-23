package org.factory;

import org.simplefactary.Pizza;

public class NYStylePizzaStore extends PizzaStore {

    @Override
    public Pizza createPizza(String type) {
        Pizza pizza = null;

        if (type.equals("cheese")) {
            pizza = new NYStyleCheesePizza();

        } else if (type.equals("pepperoni")) {
            pizza = new NYStylePepperoniPizza();
        }
        return pizza;
    }
}
