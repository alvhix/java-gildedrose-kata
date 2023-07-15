package tv.codely.kata.gildedrose;

final public class StandardItem extends BaseItem {
    public StandardItem(Item item) {
        super(item);
    }

    @Override
    public void update() {
        this.decreaseQuality();
        this.decreaseSellIn();
        super.validateQuality();
    }

    private void decreaseQuality() {
        if (super.item.sellIn <= MINIMUM_VALUE) {
            super.item.quality -= 2;
        } else {
            super.item.quality--;
        }
    }

    private void decreaseSellIn() {
        super.item.sellIn--;
    }
}
