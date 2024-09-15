package view.commands;

import model.human.Human;
import view.ConsoleUi;

public class AddHuman extends Command{

    public AddHuman(ConsoleUi consoleUi) {
        super("Добавить человека", consoleUi);
    }


    @Override
    public void execute() {
        getConsoleUi().addHuman();
    }
}
