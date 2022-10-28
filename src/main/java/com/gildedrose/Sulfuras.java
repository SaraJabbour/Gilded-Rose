package com.gildedrose;

public class Sulfuras extends Item {
    public Sulfuras(String name, int sellIn) {
        super(name, sellIn, 80);
    }

    // Empty method as no changes are required to quality or sellIn
    @Override
    public void updateQ() {
    }
}
