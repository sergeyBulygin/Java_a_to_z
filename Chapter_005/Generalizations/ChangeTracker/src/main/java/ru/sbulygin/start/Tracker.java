package ru.sbulygin.start;


import ru.sbulygin.models.Item;

import java.util.*;

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
    private List<Item> items = new ArrayList<>();

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
            this.items.add(item);
    }

    /**
     * Method for update item.
     * @param item item.
     */
    public void updateItem(Item item) {
        for (int index = 0; index != items.size(); index++) {
            if ((this.items.get(index) != null) && (this.items.get(index).getId().equals(item.getId()))) {
                this.items.set(index, item);
                break;
            }
        }
    }

    /**
     * Method for delete item.
     * @param id id item.
     */
    public void deleteItem(String id) {
        Iterator<Item> iterator = items.iterator();
        while (iterator.hasNext()) {
            if (iterator.next().getId().equals(id)) {
                iterator.remove();
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
    public List<Item> getAll() {
        ArrayList<Item> result = new ArrayList<>();
        for (int index = 0; index != this.items.size(); index++) {
            if (this.items.get(index) != null) {
                result.add(this.items.get(index));
            }
        }
        return result;

    }

    /**
     * Method adding comment to item.
     * @param id string id.
     * @param comment comment.
     */
    public void addComment(String id, String comment) {
        for (int index = 0; index != this.items.size(); index++) {
            if ((this.items.get(index) != null) && (this.items.get(index).getId().equals(id))) {
                this.items.get(index).setComment(comment);
                break;
            }
        }
    }


}
