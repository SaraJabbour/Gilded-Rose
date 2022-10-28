package com.gildedrose;

public class AgedBrie extends Item{
    public AgedBrie(String name, int sellIn, int quality){
        super(name,sellIn,quality);
        this.quality=limitRange();
    }

    @Override
    public int getRate() {
        return 1;
    }

    @Override
    public void updateQ() {
        updateSellIn();
        this.quality+=getRate();
        this.quality=limitRange();
    }
}
