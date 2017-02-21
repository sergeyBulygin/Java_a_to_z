package ru.sbulygin.start;


import ru.sbulygin.models.Item;

import java.util.Arrays;
import java.util.Random;

/**
 * Class Tracker.
 *
 * @author ru.sbulygin.start.
 * @since 10.01.2017.
 */
public class Tracker {

    /**
     * The item field of the array.
     */
    private Item[] items;

    /**
     * The field position in the array.
     */
    private int countItem = 0;

    /**
     * The field random for generate id items.
     */
    private static final Random RN = new Random(System.currentTimeMillis());

    /**
     * Method for generate random id to item.
     * @return random id.
     */
    private String generateId() {
        return String.valueOf(RN.nextInt(10000));
    }

    /**
     * Method for adding item.
     * @param item new item.
     */
    public void addItem(Item item) {
        item.setId(this.generateId());
        if (items == null) {
            items = new Item[1];
        } else {
            Item[] temp = new Item[countItem + 1];
            System.arraycopy(items, 0, temp, 0, countItem);
            this.items = temp;
        }
        this.items[countItem++] = item;
        }

    /**
     * Method for update item.
     * @param item item.
     */
    public void updateItem(Item item) {
        for (int index = 0; index < this.countItem; index++) {
            if ((this.items[index] != null) && (this.items[index].getId().equals(item.getId()))) {
                this.items[index] = item;
                break;
            }
        }
    }

    /**
     * Method for delete item.
     * @param id id item.
     */
    public void deleteItem(String id) {
        int index = getPositionOfId(id);
        if (index >= 0) {
            removeIndex(index);
        }

    }

    /**
     * Method search position item in array.
     * @param id string id item.
     * @return result .
     */
    private int getPositionOfId(String id) {
        int result = -1;
        for (int index = 0; index <= this.countItem; index++) {
            if ((this.items[index] != null) && (this.items[index].getId().equals(id))) {
                result = index;
                break;
            }
        }
        return result;
    }

    /**
     * Method removes a cell array.
     * @param index found id from the method getPositionOfId.
     */
    private void removeIndex(int index) {
        if (index >= 0 && index < items.length) {
            Item[] temp = new Item[items.length - 1];
            System.arraycopy(items, 0, temp, 0, index);
            System.arraycopy(items, index + 1, temp, index, items.length - index - 1);
            items = temp;
            countItem--;
        }
    }

     /**
     * Method for find item by name.
     * @param name name item.
     * @return items found by name.
     */
    public Item findByName(String name) {
        Item result = null;
        for (Item item : this.items) {
            if ((item != null) && (item.getName().equals(name))) {
                result = item;
                break;
            }
        }
        return result;
    }

    /**
     * Method for find item by id.
     * @param id id item.
     * @return items found by id.
     */
    public Item findById(String id) {
        Item result = null;
        for (Item item : this.items) {
            if ((item != null) && (item.getId().equals(id))) {
                result = item;
                break;
            }
        }
        return result;
    }

    /**
     * Receiving all the elements of the method .
     * @return all items.
     */
    public Item[] getAll() {
        return this.countItem == 0 ? null : Arrays.copyOf(this.items, this.countItem);
    }

    /**
     * Method adding comment to item.
     * @param id string id.
     * @param comment comment.
     */
    public void addComment(String id, String comment) {
        for (int index = 0; index < this.items.length; index++) {
            if ((this.items[index] != null) && (this.items[index].getId().equals(id))) {
                this.items[index].setComment(comment);
                break;
            }
        }
    }


}
