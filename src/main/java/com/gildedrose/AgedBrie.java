package com.gildedrose;

public class AgedBrie extends Item{
    public AgedBrie(String name, int sellIn, int quality){
        super(name,sellIn,quality);
        this.quality=valueCheck();
    }
    @Override
    public void updateQuality(){
        decreaseSellIn();
       this.quality++;
    }
}
