package ru.sbulygin.start;


import ru.sbulygin.models.Item;
import ru.sbulygin.models.Task;
import ru.sbulygin.templates.BaseAction;

import java.util.List;


/**
 * Class MenuTracker.
 *
 * @author ru.sbulygin.start.
 * @since 12.02.2017.
 * @version 1.0.
 */
public class MenuTracker {

    /**
     * The input field.
     */
    private Input input;

    /**
     * The tracker field.
     */
    private Tracker tracker;

    /**
     * The actions field of the array.
     */
    private UserAction[] actions = new UserAction[8];

    /**
     * The position field.
     */
    private int position = 0;

    /**
     * Constructor of MenuTracker class.
     * @param input input stream from user.
     * @param tracker tracker object.
     */
    public MenuTracker(Input input, Tracker tracker) {
        this.input = input;
        this.tracker = tracker;
    }

    /**
     * Method for filling action list.
     */
    public void fillActions() {
        this.actions[position++] = this.new AddItem(0, "Add the new Item.");
        this.actions[position++] = new ShowItems(1,  "Show all items.");
        this.actions[position++] = this.new UpdateItem(2, "Edit Item.");
        this.actions[position++] = this.new DeleteItem(3, "Delete Item.");
        this.actions[position++] = this.new FindItemByName(4,  "Find Item by name.");
        this.actions[position++] = this.new FindItemById(5, "Find Item by ID.");
        this.actions[position++] = this.new AddComment(6, "Add comments.");
    }

    /**
     * Method addAction. Added user actions.
     * @param action user actions.
     */
    public void addAction(UserAction action) {
        this.actions[position++] = action;
    }

    /**
     * Method for selecting action by key.
     * @param key key of action.
     */
    public void select(int key) {
        this.actions[key].execute(this.input, this.tracker);
    }

    /**
     * Method for displaying start menu.
     */
    public void show() {
        for (UserAction action : this.actions) {
            if (action != null) {
                System.out.println(action.info());
            }
        }
    }

    /**
     * Inner class for executing "Add the new item" action.
     */
    private class AddItem extends BaseAction {
        /**
         * Constructor of AddItem class.
         * @param keyAction key action.
         * @param nameAction name action.
         */
        private AddItem(int keyAction, String nameAction) {
            super(keyAction, nameAction);
        }

        /**
         * This method execute adding of the Item.
         * @param input input stream from user.
         * @param tracker tracker object.
         */
        @Override
        public void execute(Input input, Tracker tracker) {
            String name = input.ask("Please, enter the task's name: ");
            String description = input.ask("Please, enter the description: ");
            tracker.addItem(new Task(name, description, System.currentTimeMillis()));
        }
    }

    /**
     * Inner class for executing "Show all items" action.
     */
    private static class ShowItems extends BaseAction {

        /**
         * Constructor of ShowItems class.
         * @param keyAction key action.
         * @param nameAction name action.
         */
        private ShowItems(int keyAction, String nameAction) {
            super(keyAction, nameAction);
        }

        /**
         * This method execute show all Item.
         * @param input input stream from user.
         * @param tracker tracker object.
         */
        @Override
        public void execute(Input input, Tracker tracker) {
            List<Item> allItem = tracker.getAll();
            if (allItem != null) {
                for (Item item : allItem) {
                    System.out.println(String.format("%s. %s  %s", item.getId(), item.getName(), item.getDescription()));
                    String findComm = item.getComment();
                    if (findComm != "") {
                        System.out.println(findComm);
                    }
                }
            }
        }
    }

    /**
     * Inner class for executing "Edit Item" action.
     */
    private class UpdateItem extends BaseAction {
        /**
         * Constructor of UpdateItem class.
         * @param keyAction key action.
         * @param nameAction name action.
         */
        private UpdateItem(int keyAction, String nameAction) {
            super(keyAction, nameAction);
        }

        /**
         * This method execute edit Item.
         * @param input input stream from user.
         * @param tracker tracker object.
         */
        @Override
        public void execute(Input input, Tracker tracker) {
            String id = input.ask("Please, enter the task's id: ");
            String name = input.ask("Please, enter the task's name: ");
            String description = input.ask("Please, enter the description: ");
            Task task = new Task(name, description, System.currentTimeMillis());
            task.setId(id);
            tracker.updateItem(task);
        }
    }

    /**
     * Inner class for executing "Delete Item" action.
     */
    private class DeleteItem extends BaseAction {
        /**
         * Constructor of DeleteItem class.
         * @param keyAction key action.
         * @param nameAction name action.
         */
        private DeleteItem(int keyAction, String nameAction) {
            super(keyAction, nameAction);
        }

        /**
         * This method execute delete Item.
         * @param input input stream from user.
         * @param tracker tracker object.
         */
        @Override
        public void execute(Input input, Tracker tracker) {
            String id = input.ask("Please, enter the task's id: ");
            tracker.deleteItem(id);
        }
    }

    /**
     * Inner class for executing "Find Item by name" action.
     */
    private class FindItemByName extends BaseAction {
        /**
         * Constructor of FindItemByName class.
         * @param keyAction key action.
         * @param nameAction name action.
         */
        private FindItemByName(int keyAction, String nameAction) {
            super(keyAction, nameAction);
        }

        /**
         * This method execute find by name Item.
         * @param input input stream from user.
         * @param tracker tracker object.
         */
        @Override
        public void execute(Input input, Tracker tracker) {
            String name = input.ask("Please, enter the task's name: ");
            Item items = tracker.findByName(name);
            System.out.println(String.format("%s. %s  %s", items.getId(), items.getName(), items.getDescription()));
        }
    }

    /**
     * Inner class for executing "Find Item by ID" action.
     */
    private class FindItemById extends BaseAction {
        /**
         * Constructor of FindItemById class.
         * @param keyAction key action.
         * @param nameAction name action.
         */
        private FindItemById(int keyAction, String nameAction) {
            super(keyAction, nameAction);
        }

        /**
         * This method execute find by ID Item.
         * @param input input stream from user.
         * @param tracker tracker object.
         */
        @Override
        public void execute(Input input, Tracker tracker) {
            String id = input.ask("Please, enter the task's ID: ");
            Item items = tracker.findById(id);
            System.out.println(String.format("%s. %s  %s", items.getId(), items.getName(), items.getDescription()));
        }
    }

    /**
     * Inner class for executing "Add comments" action.
     */
    private class AddComment extends BaseAction {
        /**
         * Constructor of AddComment class.
         * @param keyAction key action.
         * @param nameAction name action.
         */
        private AddComment(int keyAction, String nameAction) {
            super(keyAction, nameAction);
        }

        /**
         * This method execute add comment Item.
         * @param input input stream from user.
         * @param tracker tracker object.
         */
        @Override
        public void execute(Input input, Tracker tracker) {
            String id = input.ask("Please, enter the task's ID: ");
            String commentAdd = input.ask("Please, enter the comment for item: ");
            tracker.addComment(id, commentAdd);
        }
    }

}
