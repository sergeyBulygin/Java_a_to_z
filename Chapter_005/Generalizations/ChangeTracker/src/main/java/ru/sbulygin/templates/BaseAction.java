package ru.sbulygin.templates;

import ru.sbulygin.start.Input;
import ru.sbulygin.start.Tracker;
import ru.sbulygin.start.UserAction;

/**
 * Abstract class BaseAction implement UserAction..
 *
 * @author ru.sbulygin.start.
 * @since 21.02.2017.
 * @version 1.0.
 */
public abstract class BaseAction implements UserAction {

    /**
     * The nameAction field.
     */
    private String nameAction;

    /**
     * The keyAction field.
     */
    private int keyAction;

    /**
     *Constructor of BaseAction.
     * @param nameAction name action for menu.
     * @param keyAction key action for menu.
     */
    public BaseAction(int keyAction, String nameAction) {
        this.nameAction = nameAction;
        this.keyAction = keyAction;
    }

    /**
     * Method execute.
     * @param input Input input.
     * @param tracker Tracker tracker.
     */

    public abstract void execute(Input input, Tracker tracker);

    /**
     * Method info.
     * @return formatted string
     */

    public String info() {
        return String.format("%s. %s", this.keyAction, this.nameAction);
    }
}
