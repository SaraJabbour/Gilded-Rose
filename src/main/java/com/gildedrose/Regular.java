package com.gildedrose;

public class Regular extends Item{
    public Regular(String name, int sellIn, int quality) {
        super(name, sellIn, quality);
        this.quality=limitRange();
    }

    @Override
    public int getRate() {
        if(hasItemExpired())
            return 2;
        return 1;
    }

    @Override
    public void updateQ() {
        updateSellIn();
        this.quality-=getRate();
        this.quality=limitRange();
    }
}
