package ru.sbulygin.start;

/**
 * Class StubInput.
 *
 * @version 1.0.
 * @author ru.sbulygin.start.
 * @since 06.02.2017.
 * @version 1.0.
 */
public class StubInput implements Input {

    /**
     * The answer field of the array.
     */
    private String[] answers;

    /**
     * The field position in the array.
     */
    private int position = 0;

    /**
     * Constructor of StubInput class.
     * @param answers string array answers.
     */
    public StubInput(String[] answers) {
        this.answers = answers;
    }

    /**
     * The overridden method ask.
     * @param question question to the user.
     * @return response .
     */
    @Override
    public String ask(String question) {
        return answers[position++];
    }

    /**
     * Method for asking questions to users.
     * @param question String users question.
     * @param range int range key.
     * @return user answer.
     */
    @Override
    public int ask(String question, int[] range) {
        int key = Integer.valueOf(this.ask(question));
        boolean exist = false;
        for (int value : range) {
            if (value == key) {
                exist = true;
                break;
            }
        }
        if (exist) {
            return key;
        } else {
            throw new MenuOutException("Out of menu range.");
        }

    }
}
