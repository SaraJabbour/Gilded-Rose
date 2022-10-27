package com.gildedrose;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class GildedRoseTest {
    @Test
    void foo() {
        Item[] items = new Item[] { new Item("backsTage Passes to F1 paddock", 1, 9),
            new Item("cONjuRed mellow cake",3,10), };
        GildedRose app = new GildedRose(items);
        app.updateQuality();

        //Testing values
        assertEquals(12, app.items[0].quality);
        assertEquals(0, app.items[0].sellIn);
        assertEquals(Item.Type.Backstage, app.items[0].type);

        assertEquals(8, app.items[1].quality);
        assertEquals(2, app.items[1].sellIn);
        assertEquals(Item.Type.Conjured, app.items[1].type);

        app.updateQuality();

        assertEquals(0, app.items[0].quality);
        assertEquals(0, app.items[0].sellIn);
        assertEquals(Item.Type.Backstage, app.items[0].type);

        assertEquals(6, app.items[1].quality);
        assertEquals(1, app.items[1].sellIn);
        assertEquals(Item.Type.Conjured, app.items[1].type);

    }

}
