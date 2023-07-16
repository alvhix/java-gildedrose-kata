package tv.codely.kata.gildedrose;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class GildedRose {

    private static final String DEFAULT = "Default";
    private static final String AGED_BRIE = "Aged Brie";
    private static final String SULFURAS = "Sulfuras, Hand of Ragnaros";
    private static final String BACKSTAGE_CONCERT = "BackstageConcert passes to a TAFKAL80ETC concert";
    private static final String CONJURED_MANA_CAKE = "Conjured Mana Cake";
    private final List<BaseItem> items;
    private final Map<String, Class<?>> typeOfItem = new HashMap<>();

    public GildedRose(List<BaseItem> items) {
        this.items = items;
        this.typeOfItem.put(DEFAULT, StandardItem.class);
        this.typeOfItem.put(AGED_BRIE, AgedBrie.class);
        this.typeOfItem.put(SULFURAS, Sulfuras.class);
        this.typeOfItem.put(BACKSTAGE_CONCERT, BackstageConcert.class);
        this.typeOfItem.put(CONJURED_MANA_CAKE, ConjuredManaCake.class);
    }

    public void update() {
        try {
            for (BaseItem item : items) {
                Class<?> aClass = this.typeOfItem.getOrDefault(item.getName(), this.typeOfItem.get(DEFAULT));

                UpdateItem updatableItem = (UpdateItem) aClass.getDeclaredConstructor(BaseItem.class).newInstance(item);
                updatableItem.update();
            }
        } catch (Exception ex) {
            System.err.println(ex.getMessage());
            System.err.println(Arrays.toString(ex.getStackTrace()));
        }

    }
}
