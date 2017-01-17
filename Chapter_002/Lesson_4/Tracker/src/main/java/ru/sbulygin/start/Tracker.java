package ru.sbulygin.start;

import ru.sbulygin.models.Comment;
import ru.sbulygin.models.Item;

import java.util.Arrays;
import java.util.Random;

/**
 * @author ru.sbulygin.start.
 * @since 10.01.2017.
 */
public class Tracker {

    /**
     * The item field of the array.
     */
    private Item[] items = new Item[10];

    /**
     * The field position in the array.
     */
    private int positionItem = 0;

    /**
     * The field random for generate id items.
     */
    private static final Random RN = new Random();

    /**
     * Method for generate random id to item.
     * @return random id.
     */
    private String generateId() {
        return String.valueOf(System.currentTimeMillis() + RN.nextInt());
    }

    /**
     * Method for adding item.
     * @param item new item.
     */
    public void addItem(Item item) {
        item.setId(this.generateId());
        this.items[positionItem++] = item;
        }

    /**
     * Method for update item.
     * @param item item.
     */
    public void updateItem(Item item) {
        for (int index = 0; index != this.positionItem; index++) {
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
        for (int index = 0; index < this.positionItem; index++) {
            if ((this.items[index] != null) && (this.items[index].getId().equals(id))) {
                System.arraycopy(items, index + 1, items, index, this.positionItem - index - 1);
                this.items[positionItem--] = null;
                break;
            }
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
        return this.positionItem == 0 ? null : Arrays.copyOf(this.items, this.positionItem);
    }

    /**
     * Method adding comment to item.
     * @param id string id.
     * @param comment comment.
     */
    public void addComment(String id, Comment comment) {
        for (int index = 0; index < this.items.length; index++) {
            if ((this.items[index] != null) && (this.items[index].getId().equals(id))) {
                this.items[index].addComment(comment);
                break;
            }
        }
    }


}
