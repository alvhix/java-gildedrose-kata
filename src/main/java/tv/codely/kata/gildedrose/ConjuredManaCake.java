package tv.codely.kata.gildedrose;

public class ConjuredManaCake implements UpdateItem {
    private final BaseItem item;

    public ConjuredManaCake(BaseItem item) {
        this.item = item;
    }

    public void update() {
        this.item.decrementQuality(this.item.getSellIn() <= this.item.MINIMUM_VALUE ? 4 : 2);
        this.item.decrementSellIn();
        this.item.validateQuality();
    }
}
