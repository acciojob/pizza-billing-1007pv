package com.driver;

public class DeluxePizza extends Pizza {
    public DeluxePizza(boolean isveg) {
        super(isveg);
        super.addExtraCheese();
        super.addExtraToppings();
    }

    @Override
    public void addExtraCheese() {}

    @Override
    public void addExtraToppings() {}
}
