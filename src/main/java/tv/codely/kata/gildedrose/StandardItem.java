package tv.codely.kata.gildedrose;

final public class StandardItem extends BaseItem {
    public StandardItem(Item item) {
        super(item);
    }

    @Override
    public void update() {
        super.decrementQuality(super.getSellIn() <= MINIMUM_VALUE ? 2 : 1);
        super.decrementSellIn();
        super.validateQuality();
    }
}
