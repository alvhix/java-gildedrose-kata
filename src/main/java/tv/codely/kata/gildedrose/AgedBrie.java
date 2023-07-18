package tv.codely.kata.gildedrose;

final public class AgedBrie implements UpdateItem {

    private final BaseItem item;

    public AgedBrie(BaseItem item) {
        this.item = item;
    }

    public void update() {
        this.item.incrementQuality(1);
        this.item.decrementSellIn();
        this.item.validateQuality();
    }
}
