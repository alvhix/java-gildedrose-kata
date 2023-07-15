package tv.codely.kata.gildedrose;

final public class Sulfuras extends BaseItem {

    public Sulfuras(Item item) {
        super(item.name, item.sellIn, item.quality);
    }

    @Override
    public void update() {
        return;
    }
}
