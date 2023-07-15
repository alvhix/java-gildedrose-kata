package tv.codely.kata.gildedrose;

final public class StandardItem extends BaseItem {
    public StandardItem(Item item) {
        super(item.name, item.sellIn, item.quality);
    }

    @Override
    public void update() {
        this.decreaseQuality();
        this.decreaseSellIn();
        super.validateQuality();
    }

    private void decreaseQuality() {
        if (super.sellIn <= MINIMUM_VALUE) {
            super.quality -= 2;
        } else {
            super.quality--;
        }
    }

    private void decreaseSellIn() {
        super.sellIn--;
    }
}
