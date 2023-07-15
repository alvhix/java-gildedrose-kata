package tv.codely.kata.gildedrose;

final public class AgedBrie extends BaseItem {

    public AgedBrie(Item item) {
        super(item);
    }

    @Override
    public void updateQuality() {
        super.incrementQuality(1);
        super.validateQuality();
    }
}
