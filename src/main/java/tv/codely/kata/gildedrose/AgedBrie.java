package tv.codely.kata.gildedrose;

final public class AgedBrie extends BaseItem {

    public AgedBrie(Item item) {
        super(item.name, item.sellIn, item.quality);
    }

    @Override
    public void update() {
        this.updateAgedBrie();
        super.validateQuality();
    }

    private void updateAgedBrie() {
        super.quality++;
    }
}
