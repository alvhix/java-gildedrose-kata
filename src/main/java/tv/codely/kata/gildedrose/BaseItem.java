package tv.codely.kata.gildedrose;

final public class BaseItem {
    public final Integer MINIMUM_VALUE = 0;
    public final Integer MAXIMUM_VALUE = 50;

    private final Item item;

    public BaseItem(Item item) {
        this.item = item;
    }

    public int getSellIn() {
        return item.sellIn;
    }

    public String getName() {
        return item.name;
    }

    public void validateQuality() {
        if (item.quality < MINIMUM_VALUE) this.setMinimumQuality();
        if (item.quality > MAXIMUM_VALUE) this.setMaximumQuality();
    }

    public void decrementSellIn() {
        item.sellIn--;
    }

    public void incrementQuality(int times) {
        item.quality += times;
    }

    public void decrementQuality(int times) {
        item.quality -= times;
    }

    public void setMinimumQuality() {
        item.quality = MINIMUM_VALUE;
    }

    public void setMaximumQuality() {
        item.quality = MAXIMUM_VALUE;
    }
}
