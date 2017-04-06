package ru.sbulygin.start;

/**
 * Interface UserAction.
 *
 * @author ru.sbulygin.start.
 * @since 12.02.2017.
 * @version 1.0.
 */
public interface UserAction {

	/**
	 * Method execute.
	 * @param input Input input.
	 * @param tracker Tracker tracker.
	 */
	void execute(Input input, Tracker tracker);

	/**
	 * Method info.
	 * @return information.
	 */
	String info();
}
