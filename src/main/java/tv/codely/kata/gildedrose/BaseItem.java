package tv.codely.kata.gildedrose;

public abstract class BaseItem extends Item {
    protected final static Integer MINIMUM_VALUE = 0;
    protected final static Integer MAXIMUM_VALUE = 50;

    public BaseItem(String name, int sellIn, int quality) {
        super(name, sellIn, quality);
    }

    protected void validateQuality() {
        if (super.quality < MINIMUM_VALUE) {
            super.quality = MINIMUM_VALUE;
        }

        if (super.quality > MAXIMUM_VALUE) {
            super.quality = MAXIMUM_VALUE;
        }
    }

    public abstract void update();
}
