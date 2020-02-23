package io.huna.patterns.decorator.impl;

import io.huna.patterns.decorator.Beverage;

public class Espresso extends Beverage {

    private String description;

    public Espresso() {
        description = "Espresso";
    }

    @Override
    public double cost() {
        return 1.9;
    }
}
