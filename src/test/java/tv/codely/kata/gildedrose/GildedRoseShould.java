package tv.codely.kata.gildedrose;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import java.util.Collections;

public class GildedRoseShould {

    @Test
    public void testThatSellInValueIsDecreased() {
        Item whateverItem = new Item("whatever", 10, 0);
        BaseItem whateverBaseItem = BaseItemFactory.getBaseItem(whateverItem);

        GildedRose gildedRose = new GildedRose(Collections.singletonList(whateverBaseItem));
        gildedRose.updateQuality();

        assertEquals(whateverItem.sellIn, 9);
    }

    @Test
    public void testThatQualityValueIsDecreased() {
        Item whateverItem = new Item("whatever", 1, 10);
        BaseItem whateverBaseItem = BaseItemFactory.getBaseItem(whateverItem);

        GildedRose gildedRose = new GildedRose(Collections.singletonList(whateverBaseItem));
        gildedRose.updateQuality();

        assertEquals(whateverItem.quality, 9);
    }

    @Test
    public void testThatQualityDecreasesTwiceAsMuchWhenSellByIsPassed() {
        Item whateverItem = new Item("whatever", 0, 10);
        BaseItem whateverBaseItem = BaseItemFactory.getBaseItem(whateverItem);

        GildedRose gildedRose = new GildedRose(Collections.singletonList(whateverBaseItem));
        gildedRose.updateQuality();

        assertEquals(whateverItem.quality, 8);
    }

    @Test
    public void testThatQualityIsNeverNegative() {
        Item whateverItem = new Item("whatever", 0, 0);
        BaseItem whateverBaseItem = BaseItemFactory.getBaseItem(whateverItem);

        GildedRose gildedRose = new GildedRose(Collections.singletonList(whateverBaseItem));
        gildedRose.updateQuality();

        assertEquals(whateverItem.quality, 0);
    }

    @Test
    public void testAgedBrieIncreasesQualityWithAge() {
        Item agedBrie = new Item("Aged Brie", 5, 1);
        BaseItem agedBrieBaseItem = BaseItemFactory.getBaseItem(agedBrie);

        GildedRose gildedRose = new GildedRose(Collections.singletonList(agedBrieBaseItem));
        gildedRose.updateQuality();

        assertEquals(agedBrie.quality, 2);
    }

    @Test
    public void testQualityNeverIncreasesPastFifty() {
        Item agedBrie = new Item("Aged Brie", 5, 50);
        BaseItem agedBrieBaseItem = BaseItemFactory.getBaseItem(agedBrie);

        GildedRose gildedRose = new GildedRose(Collections.singletonList(agedBrieBaseItem));
        gildedRose.updateQuality();

        assertEquals(agedBrie.quality, 50);
    }

    @Test
    public void testSulfurasNeverChanges() {
        Item sulfuras = new Item("Sulfuras, Hand of Ragnaros", 0, 25);
        BaseItem sulfurasBaseItem = BaseItemFactory.getBaseItem(sulfuras);

        GildedRose gildedRose = new GildedRose(Collections.singletonList(sulfurasBaseItem));
        gildedRose.updateQuality();

        assertEquals(sulfuras.quality, 25);
        assertEquals(sulfuras.sellIn, 0);
    }

    @Test
    public void testBackstagePassIncreasesQualityByOneIfSellByGreaterThenTen() {
        Item backstagePasses = new Item("Backstage passes to a TAFKAL80ETC concert", 11, 20);
        BaseItem backstageBaseItem = BaseItemFactory.getBaseItem(backstagePasses);

        GildedRose gildedRose = new GildedRose(Collections.singletonList(backstageBaseItem));
        gildedRose.updateQuality();

        assertEquals(backstagePasses.quality, 21);
    }

    @Test
    public void testBackstagePassIncreasesQualityByTwoIfSellBySmallerThanTen() {
        Item backstagePasses = new Item("Backstage passes to a TAFKAL80ETC concert", 6, 20);
        BaseItem backstageBaseItem = BaseItemFactory.getBaseItem(backstagePasses);

        GildedRose gildedRose = new GildedRose(Collections.singletonList(backstageBaseItem));
        gildedRose.updateQuality();

        assertEquals(backstagePasses.quality, 22);
    }

    @Test
    public void testBackstagePassIncreasesQualityByThreeIfSellBySmallerThanFive() {
        Item backstagePasses = new Item("Backstage passes to a TAFKAL80ETC concert", 5, 20);
        BaseItem backstageBaseItem = BaseItemFactory.getBaseItem(backstagePasses);

        GildedRose gildedRose = new GildedRose(Collections.singletonList(backstageBaseItem));
        gildedRose.updateQuality();

        assertEquals(backstagePasses.quality, 23);
    }

    @Test
    public void testBackstagePassLosesValueAfterSellByPasses() {
        Item backstagePasses = new Item("Backstage passes to a TAFKAL80ETC concert", 0, 20);
        BaseItem backstageBaseItem = BaseItemFactory.getBaseItem(backstagePasses);

        GildedRose gildedRose = new GildedRose(Collections.singletonList(backstageBaseItem));
        gildedRose.updateQuality();

        assertEquals(backstagePasses.quality, 0);
    }
}
