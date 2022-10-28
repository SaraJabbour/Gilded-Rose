package com.gildedrose;

public class Regular extends Item{
    public Regular(String name, int sellIn, int quality) {
        super(name, sellIn, quality);
        this.quality=limitRange();
    }

    @Override
    public void updateQ() {
        updateSellIn();
        if(hasItemExpired())
            this.quality-=2;
        else
            this.quality--;
        this.quality=limitRange();
    }
}
