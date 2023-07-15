package tv.codely.kata.gildedrose;

class GildedRose {
    private final static String AGED_BRIE = "Aged Brie";
    private final static String BACKSTAGE = "Backstage passes to a TAFKAL80ETC concert";
    private final static String SULFURAS = "Sulfuras, Hand of Ragnaros";
    private final static Integer MINIMUM_VALUE = 0;
    private final static Integer MAXIMUM_VALUE = 50;
    Item[] items;

    public GildedRose(Item[] items) {
        this.items = items;
    }

    public void updateQuality() {
        for (Item item : items) {
            switch (item.name) {
                case AGED_BRIE:
                    this.updateAgedBrie(item);
                    this.validateQuality(item);
                    break;
                case BACKSTAGE:
                    this.updateBackstage(item);
                    this.validateQuality(item);
                    break;
                case SULFURAS:
                    break;
                default:
                    this.decreaseQuality(item);
                    this.decreaseSellIn(item);
                    this.validateQuality(item);
            }
        }
    }

    private void updateBackstage(Item item) {
        if (item.sellIn <= MINIMUM_VALUE) {
            item.quality = MINIMUM_VALUE;
        } else if (item.sellIn <= 5) {
            item.quality += 3;
        } else if (item.sellIn <= 10) {
            item.quality += 2;
        } else {
            item.quality++;
        }
    }

    private void updateAgedBrie(Item item) {
        item.quality++;
    }

    private void validateQuality(Item item) {
        if (item.quality < MINIMUM_VALUE) {
            item.quality = MINIMUM_VALUE;
        }

        if (item.quality > MAXIMUM_VALUE) {
            item.quality = MAXIMUM_VALUE;
        }
    }

    private void decreaseQuality(Item item) {
        if (item.sellIn <= MINIMUM_VALUE) {
            item.quality -= 2;
        } else {
            item.quality--;
        }
    }

    private void decreaseSellIn(Item item) {
        item.sellIn--;
    }
}
