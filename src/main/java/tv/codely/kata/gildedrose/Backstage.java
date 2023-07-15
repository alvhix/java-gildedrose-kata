package tv.codely.kata.gildedrose;

final public class Backstage extends BaseItem {
    private final static Integer MIDDLE_SELLIN_DAYS = 5;
    private final static Integer MAXIMUM_SELLIN_DAYS = 10;

    public Backstage(Item item) {
        super(item);
    }

    @Override
    public void update() {
        this.updateBackstage();
        super.validateQuality();
    }

    private void updateBackstage() {
        if (super.item.sellIn <= MINIMUM_VALUE) {
            super.item.quality = MINIMUM_VALUE;
        } else if (super.item.sellIn <= MIDDLE_SELLIN_DAYS) {
            super.item.quality += 3;
        } else if (super.item.sellIn <= MAXIMUM_SELLIN_DAYS) {
            super.item.quality += 2;
        } else {
            super.item.quality++;
        }
    }
}
