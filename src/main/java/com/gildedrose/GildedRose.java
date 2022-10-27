package com.gildedrose;

class GildedRose {
    Item[] items;

    public GildedRose(Item[] items) {
        this.items = items;
    }

    public String getItem;
    public void decreaseValue(Item item, int value) {
        if (item.sellIn < 1)
            item.quality-=value*2;
        else
            item.quality -=value;
        if(item.quality < 0)
            item.quality=0;
    }
    public void increaseValue(Item item, int value) {
        item.quality += value;
        if(item.quality > 50)
            item.quality=50;
    }

    public void decreaseSellIn(Item item){
        item.sellIn--;
    }
    public void updateQuality() {
        for (Item item: items) {
            /*if (!items[i].name.equals("Aged Brie")
                    && !items[i].name.equals("Backstage passes to a TAFKAL80ETC concert")) {
                if (items[i].quality > 0) {
                    if (!items[i].name.equals("Sulfuras, Hand of Ragnaros")) {
                        items[i].quality = items[i].quality - 1;
                    }
                }
            } else {
                if (items[i].quality < 50) {
                    items[i].quality = items[i].quality + 1;

                    if (items[i].name.equals("Backstage passes to a TAFKAL80ETC concert")) {
                        if (items[i].sellIn < 11) {
                            if (items[i].quality < 50) {
                                items[i].quality = items[i].quality + 1;
                            }
                        }

                        if (items[i].sellIn < 6) {
                            if (items[i].quality < 50) {
                                items[i].quality = items[i].quality + 1;
                            }
                        }
                    }
                }
            }

            if (!items[i].name.equals("Sulfuras, Hand of Ragnaros")) {
                items[i].sellIn = items[i].sellIn - 1;
            }

            if (items[i].sellIn < 0) {
                if (!items[i].name.equals("Aged Brie")) {
                    if (!items[i].name.equals("Backstage passes to a TAFKAL80ETC concert")) {
                        if (items[i].quality > 0) {
                            if (!items[i].name.equals("Sulfuras, Hand of Ragnaros")) {
                                items[i].quality = items[i].quality - 1;
                            }
                        }
                    } else {
                        items[i].quality = items[i].quality - items[i].quality;
                    }
                } else {
                    if (items[i].quality < 50) {
                        items[i].quality = items[i].quality + 1;
                    }
                }
            }*/
            // Switch statements are used to deal with multiple cases and are faster than if else ladder statements
            switch(item.name){
                case "Aged Brie":
                    increaseValue(item,1);
                    break;

                case "Sulfuras, Hand of Ragnaros":
                    break;

                case "Backstage passes to a TAFKAL80ETC concert":
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

                case "Conjured Mana Cake":
                    decreaseValue(item,2);
                default:
                    decreaseValue(item,1);
            }
            // Decreasing SellIn for all items except Sulfuras
            if(!item.name.equals("Sulfuras, Hand of Ragnaros"))
                decreaseSellIn(item);
        }
    }
}
