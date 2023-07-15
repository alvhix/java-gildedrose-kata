package tv.codely.kata.gildedrose;

public abstract class BaseItem {
    protected final static Integer MINIMUM_VALUE = 0;
    protected final static Integer MAXIMUM_VALUE = 50;

    protected final Item item;

    public BaseItem(Item item) {
        this.item = item;
    }

    public void update() {
        updateQuality();
        updateSellIn();
    }

    protected abstract void updateQuality();

    protected void updateSellIn() {
        item.sellIn--;
    }

    protected int getSellIn() {
        return item.sellIn;
    }

    protected void validateQuality() {
        if (item.quality < MINIMUM_VALUE) this.setMinimumQuality();
        if (item.quality > MAXIMUM_VALUE) this.setMaximumQuality();
    }

    protected void incrementQuality(int times) {
        item.quality += times;
    }

    protected void decrementQuality(int times) {
        item.quality -= times;
    }

    protected void setMinimumQuality() {
        item.quality = MINIMUM_VALUE;
    }

    protected void setMaximumQuality() {
        item.quality = MAXIMUM_VALUE;
    }
}
