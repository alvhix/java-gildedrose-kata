package tv.codely.kata.gildedrose;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

final public class BaseItemFactory {
    private final static String AGED_BRIE = "Aged Brie";
    private final static String BACKSTAGE_CONCERT = "BackstageConcert passes to a TAFKAL80ETC concert";
    private final static String SULFURAS = "Sulfuras, Hand of Ragnaros";
    private final static String CONJURED_MANA_CAKE = "Conjured Mana Cake";


    /**
     * Udpate item.
     *
     * @param item the item
     * @return the item
     */
    public static BaseItem getBaseItem(Item item) {
        switch (item.name) {
            case AGED_BRIE:
                return new AgedBrie(item);
            case BACKSTAGE_CONCERT:
                return new BackstageConcert(item);
            case SULFURAS:
                return new Sulfuras(item);
            case CONJURED_MANA_CAKE:
                return new ConjuredManaCake(item);
        }
        return new StandardItem(item);
    }

    public static List<BaseItem> getBaseItems(Item[] items) {
        List<Item> iterableItems = Arrays.asList(items);
        return iterableItems.stream().map(BaseItemFactory::getBaseItem).collect(Collectors.toList());
    }
}
