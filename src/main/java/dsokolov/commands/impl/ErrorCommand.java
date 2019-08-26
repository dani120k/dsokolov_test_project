package dsokolov.commands.impl;

import dsokolov.commands.Command;

public class ErrorCommand implements Command {


    @Override
    public Command parse(String[] splitted){
        return new ErrorCommand();
    }

    @Override
    public void exec(){
        System.out.println("error");
    }
}
