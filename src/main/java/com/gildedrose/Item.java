package com.gildedrose;

abstract public class Item {
    public String name;
    public int sellIn;
    public int quality;

    // Ranges of quality
    private static final int MAX=50;
    private static final int MIN=0;

    public int limitRange() {
        return (this.quality > MAX) ? MAX : (this.quality < MIN ? MIN: this.quality);
    }
    public Item(String name, int sellIn, int quality) {
        this.name = name;
        this.sellIn = sellIn;
        this.quality = quality;
    }
    // Used an abstract method since all items (except sulfuras) will require an sellIn and quality update
    public abstract void updateQ();

    // Common method for all subclasses as it's method doesn't change
    public void updateSellIn(){
        this.sellIn--;
    }
    public Boolean hasItemExpired(){
        return this.sellIn < 1;
    }
   @Override
   public String toString() {
        return this.name + ", " + this.sellIn + ", " + this.quality;
    }
}
