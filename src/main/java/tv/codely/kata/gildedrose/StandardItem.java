package tv.codely.kata.gildedrose;

final public class StandardItem implements UpdateItem {
    private final BaseItem item;

    public StandardItem(BaseItem item) {
        this.item = item;
    }

    public void update() {
        this.item.decrementQuality(this.item.getSellIn() <= this.item.MINIMUM_VALUE ? 2 : 1);
        this.item.decrementSellIn();
        this.item.validateQuality();
    }
}
