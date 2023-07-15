package tv.codely.kata.gildedrose;

public abstract class BaseItem extends Item {
    protected final static Integer MINIMUM_VALUE = 0;
    protected final static Integer MAXIMUM_VALUE = 50;

    protected final Item item;

    public BaseItem(Item item) {
        super(item.name, item.sellIn, item.quality);
        this.item = item;
    }

    protected void validateQuality() {
        if (item.quality < MINIMUM_VALUE) {
            item.quality = MINIMUM_VALUE;
        }

        if (item.quality > MAXIMUM_VALUE) {
            item.quality = MAXIMUM_VALUE;
        }
    }

    public abstract void update();
}
