package com.gildedrose;

abstract public class Item {
    public String name;
    public int sellIn;
    public int quality;

    // Ranges of quality
    private static final int MAX=50;
    private static final int MIN=0;

    public int limitRange() {
        return (this.quality > MAX) ? MAX : (Math.max(this.quality, MIN));
    }
    public Item(String name, int sellIn, int quality) {
        this.name = name;
        this.sellIn = sellIn;
        this.quality = quality;
    }
    // Used an abstract method since all items (except sulfuras) will require an sellIn and quality update
    // updateQ unique for each function as operations to quality differ
    public abstract void updateQ();
    // Rates define the value by which quality increases/decreases
    public abstract int getRate();

    // Common method for all subclasses as its method doesn't change
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
