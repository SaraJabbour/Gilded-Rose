package com.gildedrose;

public class BackstagePasses extends Item{
    public BackstagePasses(String name, int sellIn, int quality) {
        super(name, sellIn, quality);
        this.quality=limitRange();
    }

    @Override
    public int getRate(){
        if(hasItemExpired())
            return -(this.quality);
        if(this.sellIn <= 5)
            return 3;
        if(this.sellIn <= 10)
            return 2;
        return 1;
    }
    @Override
    public void updateQ() {
        updateSellIn();
        this.quality+=getRate();
        this.quality=limitRange();
    }
}
