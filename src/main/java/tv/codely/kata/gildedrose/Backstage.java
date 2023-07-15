package tv.codely.kata.gildedrose;

final public class Backstage extends BaseItem {
    private final static Integer MIDDLE_SELLIN_DAYS = 5;
    private final static Integer MAXIMUM_SELLIN_DAYS = 10;

    public Backstage(Item item) {
        super(item);
    }

    @Override
    public void update() {
        if (super.getSellIn() <= MINIMUM_VALUE) {
            super.setMinimumQuality();
        } else if (super.getSellIn() <= MIDDLE_SELLIN_DAYS) {
            super.incrementQuality(3);
        } else if (super.getSellIn() <= MAXIMUM_SELLIN_DAYS) {
            super.incrementQuality(2);
        } else {
            super.incrementQuality(1);
        }

        super.validateQuality();
    }
}
