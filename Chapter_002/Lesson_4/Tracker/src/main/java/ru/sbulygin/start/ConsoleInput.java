package ru.sbulygin.start;

import java.util.Scanner;

/**
 * Class ConsoleInput.
 *
 * @author ru.sbulygin.start.
 * @since 06.02.2017.
 * @version 1.0.
 */
public class ConsoleInput implements Input {

    /**
     * The flow for entering data into the console.
     */
    private Scanner scanner = new Scanner(System.in);

    /**
     *  The method add a question to the user and returns the response from the console.
     * @param question question to the user.
     * @return response from the console.
     */
    @Override
    public String ask(String question) {
        System.out.print(question);
        return scanner.nextLine().trim();
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
