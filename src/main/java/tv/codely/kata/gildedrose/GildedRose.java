package tv.codely.kata.gildedrose;

import java.util.List;

class GildedRose {

    List<BaseItem> items;

    public GildedRose(List<BaseItem> items) {
        this.items = items;
    }

    public void update() {
        items.forEach(BaseItem::update);
    }
}
