package com.gildedrose;

class GildedRose {
    Item[] items;

    public GildedRose(Item[] items) {
        this.items = items;
    }

    public String getItem;
    public void decreaseValue(Item item, int value) {
        // No need to go through conditions if value is already 0
        if(item.quality==0)
            return;

        // Items deteriorate twice as fast past their sellIn date
        if (item.sellIn < 1)
            item.quality-= value*2;
        else
            item.quality -= value;

        // Quality can never be negative
        if(item.quality < 0)
            item.quality = 0;
    }
    public void increaseValue(Item item, int value) {
        //No need to go through function if quality already 50
        if(item.quality == 50)
            return;

        item.quality += value;

        // Quality can never be more than 50
        if(item.quality > 50)
            item.quality = 50;
    }

    public void decreaseSellIn(Item item){
        item.sellIn--;
    }
    public void updateQuality() {
        for (Item item: items) {
            // Switch statements are used to deal with multiple cases and are faster than if else ladder statements
            switch(item.type){
                case AgedBrie:
                    increaseValue(item,1);
                    break;
                // Sulfuras is an item that isn't sold and doesn't change in quality
                case Sulfuras:
                    break;
                // Backstage passes increase in quality
                case Backstage:
                    //Value added to the passes depends on nb of days left in sellIn
                    if(item.sellIn<1)
                        item.quality=0;
                    else if (item.sellIn<=5)
                        increaseValue(item,3);
                    else if (item.sellIn<=10)
                        increaseValue(item,2);
                    else
                        increaseValue(item,1);
                    break;
                //Conjured items decrease twice as fast
                case Conjured:
                    decreaseValue(item,2);
                    break;
                // Regular items
                default:
                    decreaseValue(item,1);
            }
            // Decreasing SellIn for all items except Sulfuras
            if(!item.type.equals(Item.Type.Sulfuras))
                decreaseSellIn(item);
        }
    }
}
