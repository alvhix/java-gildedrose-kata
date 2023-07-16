package tv.codely.kata.gildedrose;

final public class BackstageConcert implements UpdateItem {
    private final static Integer MINIMUM_SELLIN_DAYS = 0;
    private final static Integer MIDDLE_SELLIN_DAYS = 5;
    private final static Integer MAXIMUM_SELLIN_DAYS = 10;

    private final BaseItem item;

    public BackstageConcert(BaseItem item) {
        this.item = item;
    }

    public void update() {
        if (this.item.getSellIn() <= MINIMUM_SELLIN_DAYS) {
            this.item.setMinimumQuality();
        } else if (this.item.getSellIn() <= MIDDLE_SELLIN_DAYS) {
            this.item.incrementQuality(3);
        } else if (this.item.getSellIn() <= MAXIMUM_SELLIN_DAYS) {
            this.item.incrementQuality(2);
        } else {
            this.item.incrementQuality(1);
        }

        this.item.decrementSellIn();
        this.item.validateQuality();
    }
}
