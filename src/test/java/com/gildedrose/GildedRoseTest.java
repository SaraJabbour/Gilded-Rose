package com.gildedrose;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class GildedRoseTest {
    @Test
    void foo() {
        Item[] items = new Item[] { new BackstagePasses("backstage Passes to F1 paddock", 1, 9),
            new Conjured("conjured mellow cake",3,10), new AgedBrie("Aged brie",5,48),
            new Regular("Moonpie",2,5), new Sulfuras("Sulfuras, Hand of Thanos",-3) };
        GildedRose app = new GildedRose(items);

        app.updateQuality();

        //Testing values
        assertEquals(0, app.items[0].quality);
        assertEquals(0, app.items[0].sellIn);


        assertEquals(8, app.items[1].quality);
        assertEquals(2, app.items[1].sellIn);


        app.updateQuality();

        assertEquals(0, app.items[0].quality);
        assertEquals(-1, app.items[0].sellIn);

        assertEquals(6, app.items[1].quality);
        assertEquals(1, app.items[1].sellIn);


        assertEquals(50, app.items[2].quality);
        assertEquals(3, app.items[2].sellIn);


        assertEquals(2, app.items[3].quality);
        assertEquals(0, app.items[3].sellIn);


        assertEquals(80, app.items[4].quality);
        assertEquals(-3, app.items[4].sellIn);


    }

}
