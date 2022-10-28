package com.gildedrose;

public class Conjured extends Item{
    public Conjured(String name, int sellIn, int quality) {
        super(name, sellIn, quality);
        this.quality=limitRange();
    }

    @Override
    public void updateQ() {
        updateSellIn();
        if (hasItemExpired())
            this.quality-=4;
        else
            this.quality-=2;
        this.quality=limitRange();
    }
}
