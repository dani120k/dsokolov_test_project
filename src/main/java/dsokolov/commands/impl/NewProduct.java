package dsokolov.commands.impl;

import dsokolov.commands.Command;

public class NewProduct implements Command {
    private String name;

    @Override
    public Command parse(String[] splitted){
        if (splitted.length != 2)
            return new ErrorCommand();

        this.name = name;
        return this;
    }

    @Override
    public void exec(){
        System.out.println("new product");
    }
}
