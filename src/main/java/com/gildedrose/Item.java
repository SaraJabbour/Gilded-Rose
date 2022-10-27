package com.gildedrose;

public class Item {
    public String name;
    public int sellIn;
    public int quality;

    public int valueCheck(){

        if(quality<0)
            return 0;
        if (quality > 50)
            return 50;
        return quality;
    }
    public Item(String name, int sellIn, int quality) {
        this.name = name;
        this.sellIn = sellIn;
        this.quality = quality;
    }

    public void decreaseSellIn(){
        this.sellIn--;
    }
  public void updateQuality(){

        if(this.sellIn<0)
            this.quality-=2;
        else
            this.quality--;

        this.quality=valueCheck();
  }
   @Override
   public String toString() {
        return this.name + ", " + this.sellIn + ", " + this.quality;
    }
}
