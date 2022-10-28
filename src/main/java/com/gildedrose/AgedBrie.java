package com.gildedrose;

public class AgedBrie extends Item{
    public AgedBrie(String name, int sellIn, int quality){
        super(name,sellIn,quality);
        this.quality=limitRange();
    }
    @Override
    public void updateQ() {
        updateSellIn();
        this.quality++;
        this.quality=limitRange();
    }
}
