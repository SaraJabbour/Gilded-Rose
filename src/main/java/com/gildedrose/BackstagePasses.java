package com.gildedrose;

public class BackstagePasses extends Item{
    public BackstagePasses(String name, int sellIn, int quality) {
        super(name, sellIn, quality);
        this.quality=valueCheck();
    }
    @Override
    public void updateQuality(){
        decreaseSellIn();
        if(this.sellIn < 1)
            this.quality = 0;
        else if (this.sellIn <= 5)
            this.quality +=3;
        else if (this.sellIn <= 10)
            this.quality+=2;
        else
            super.updateQuality();
    }
}
