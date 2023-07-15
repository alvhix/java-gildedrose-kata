package tv.codely.kata.gildedrose;

public class ConjuredManaCake extends BaseItem {
    public ConjuredManaCake(Item item) {
        super(item);
    }

    @Override
    protected void updateQuality() {
        super.decrementQuality(2);
    }
}
