package ch.bbw.zork;/** * Class Game - the main class of the "Zork" game. * <p> * Author:  Yanis Meichtry & Oliver Zenger, September 2023 * refactoring: Yanis Meichtry, 2.10.2023 */public class Command {    private String commandWord;    private String secondWord;    public Command(String commandWord) {        this(commandWord, null);    }    public Command(String commandWord, String secondWord) {        this.commandWord = commandWord;        this.secondWord = secondWord;    }    public String getCommandWord() {        return commandWord;    }    public String getSecondWord() {        return secondWord;    }    public boolean isUnknown() {        return (commandWord == null);    }    public boolean hasSecondWord() {        return (secondWord != null);    }}