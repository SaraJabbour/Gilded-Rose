package com.gildedrose;

public class Item {

    /*Used enums since we have specific types of item that don't change, helpful when using switch cases
    since for example we might have backstage passes for many concerts and not necessarily the TAFKAL80ETC concert*/
    enum Type{
        AgedBrie,
        Sulfuras,
        Backstage,
        Conjured,
        Regular
    }
    public String name;

    public int sellIn;

    public int quality;

    public Type type;

    // Classify item based on name
    public Type createType(String name){
        name=name.toLowerCase();
        if(name.contains("aged brie"))
            return Type.AgedBrie;
        if(name.contains("sulfuras"))
            return Type.Sulfuras;
        if(name.contains("backstage passes"))
            return Type.Backstage;
        if(name.contains("conjured"))
            return Type.Conjured;
        return Type.Regular;
    }

    public Item(String name, int sellIn, int quality) {
        this.name = name;
        this.sellIn = sellIn;

        //Ensuring user can't add a negative or a greater than 50 quality
        if (quality < 0)
            this.quality=0;
        else if (quality > 50)
            this.quality=50;
        else
            this.quality = quality;
        this.type=createType(name);
    }

   @Override
   public String toString() {
        return this.name + ", " + this.sellIn + ", " + this.quality;
    }
}
