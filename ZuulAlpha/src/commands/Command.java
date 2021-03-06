package commands;

import game.*;

/**
 * This class is part of the "World of Zuul" application.
 * "World of Zuul" is a very simple, text based adventure game.
 * <p>
 * This class holds information about a command that was issued by the user.
 * A command currently consists of two strings: a command word and a second
 * word (for example, if the command was "take map", then the two strings
 * obviously are "take" and "map").
 * <p>
 * The way this is used is: Commands are already checked for being valid
 * command words. If the user entered an invalid command (a word that is not
 * known) then the command word is <null>.
 * <p>
 * If the command had only one word, then the second word is <null>.
 *
 * @author Michael Kolling and David J. Barnes
 * @version 2008.03.30
 */

public abstract class Command {
    private CommandWord commandWord;
    private String secondWord;

    public Command() {
    }

    /**
     * Create a command object. First and second word must be supplied, but
     * either one (or both) can be null.
     *
     * @param firstWord  The first word of the command. Null if the command
     *                   was not recognised.
     * @param secondWord The second word of the command.
     */
    public Command(String firstWord, String secondWord) {
        commandWord = CommandWord.getForWord(firstWord);
        this.secondWord = secondWord;
    }

    /**
     * @return The second word of this command. Returns null if there was no
     * second word.
     */
    public String getSecondWord() {
        return secondWord;
    }

    /**
     * @return true if the command has a second word.
     */
    public boolean hasSecondWord() {
        return (secondWord != null);
    }

    /**
     * Given a command, process (that is: execute) the command.
     *
     * @param command The command to be processed.
     * @return true If the command ends the game, false otherwise.
     */
    public abstract String processCommand(Command command);
}

