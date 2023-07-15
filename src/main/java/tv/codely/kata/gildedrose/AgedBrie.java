package tv.codely.kata.gildedrose;

final public class AgedBrie extends BaseItem {

    public AgedBrie(Item item) {
        super(item);
    }

    @Override
    public void update() {
        this.updateAgedBrie();
        super.validateQuality();
    }

    private void updateAgedBrie() {
        super.item.quality++;
    }
}
