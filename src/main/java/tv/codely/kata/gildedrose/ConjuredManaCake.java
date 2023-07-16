package tv.codely.kata.gildedrose;

public class ConjuredManaCake extends BaseItem {
    public ConjuredManaCake(Item item) {
        super(item);
    }

    @Override
    protected void updateQuality() {
        super.decrementQuality(super.getSellIn() <= MINIMUM_VALUE ? 4 : 2);
        super.validateQuality();
    }
}
