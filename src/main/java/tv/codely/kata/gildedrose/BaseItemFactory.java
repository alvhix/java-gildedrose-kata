package tv.codely.kata.gildedrose;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

final public class BaseItemFactory {
    private final static String AGED_BRIE = "Aged Brie";
    private final static String BACKSTAGE = "Backstage passes to a TAFKAL80ETC concert";
    private final static String SULFURAS = "Sulfuras, Hand of Ragnaros";


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
            case BACKSTAGE:
                return new Backstage(item);
            case SULFURAS:
                return new Sulfuras(item);
        }
        return new StandardItem(item);
    }

    public static List<BaseItem> getBaseItems(Item[] items) {
        List<Item> iterableItems = Arrays.asList(items);
        return iterableItems.stream().map(BaseItemFactory::getBaseItem).collect(Collectors.toList());
    }
}
