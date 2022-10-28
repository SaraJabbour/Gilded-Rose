package com.gildedrose;

public class Conjured extends Item{
    public Conjured(String name, int sellIn, int quality) {
        super(name, sellIn, quality);
        this.quality=limitRange();
    }

    @Override
    public int getRate() {
        if(hasItemExpired())
            return 4;
        return 2;
    }

    @Override
    public void updateQ() {
        updateSellIn();
        this.quality-=getRate();
        this.quality=limitRange();
    }
}
