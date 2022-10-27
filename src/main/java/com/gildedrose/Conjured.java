package com.gildedrose;

public class Conjured extends Item{
    public Conjured(String name, int sellIn, int quality) {
        super(name, sellIn, quality);
        this.quality=valueCheck();
    }
    @Override
    public void updateQuality(){
        decreaseSellIn();
        if(this.sellIn<0)
            this.quality-=4;
        else
            this.quality-=2;

        this.quality=valueCheck();
    }
}
