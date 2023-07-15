package tv.codely.kata.gildedrose;

final public class Backstage extends BaseItem {
    private final static Integer MIDDLE_SELLIN_DAYS = 5;
    private final static Integer MAXIMUM_SELLIN_DAYS = 10;

    public Backstage(Item item) {
        super(item.name, item.sellIn, item.quality);
    }

    @Override
    public void update() {
        this.updateBackstage();
        super.validateQuality();
    }

    private void updateBackstage() {
        if (super.sellIn <= MINIMUM_VALUE) {
            super.quality = MINIMUM_VALUE;
        } else if (super.sellIn <= MIDDLE_SELLIN_DAYS) {
            super.quality += 3;
        } else if (super.sellIn <= MAXIMUM_SELLIN_DAYS) {
            super.quality += 2;
        } else {
            super.quality++;
        }
    }
}
