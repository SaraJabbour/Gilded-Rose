package com.gildedrose;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class GildedRoseTest {
    Item[] items = new Item[] { new BackstagePasses("backstage Passes to F1 paddock", 1, 9),
        new Conjured("conjured mellow cake",3,10), new AgedBrie("Aged brie",5,48),
        new Regular("Moonpie",2,5), new Sulfuras("Sulfuras, Hand of Thanos",-3) };
    GildedRose app = new GildedRose(items);
    @Test
    void foo() {
        app.updateQuality();

        //Testing values

        //Backstage
        qualityTest(0,0);
        sellInTest(0,0);

        //Conjured
        qualityTest(1,8);
        sellInTest(1,2);

        app.updateQuality();

        qualityTest(0,0);
        sellInTest(0,-1);

        qualityTest(1,6);
        sellInTest(1,1);

        qualityTest(2,50);
        sellInTest(2,3);

        qualityTest(3,2);
        sellInTest(3,0);

        qualityTest(4,80);
        sellInTest(4,-3);
    }
    void qualityTest(int index, int quality){
        assertEquals(quality, app.items[index].quality);
    }

    void sellInTest(int index, int sellIn){
        assertEquals(sellIn, app.items[index].sellIn);
    }

}
