package dsokolov.commands;

public interface Command {
    Command parse(String[] splitted);

    void exec();
}
