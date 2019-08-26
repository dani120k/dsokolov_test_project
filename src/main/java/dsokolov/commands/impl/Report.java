package dsokolov.commands.impl;

import dsokolov.commands.Command;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Report implements Command {
    private String name;
    private Date date;

    @Override
    public Command parse(String[] splitted){
        if (splitted.length != 3)
            return new ErrorCommand();

        try{
            this.name = splitted[1];
            this.date = new SimpleDateFormat("dd.MM.yyyy").parse(splitted[2]);
            return this;
        }catch (Exception ex){
            return new ErrorCommand();
        }
    }

    @Override
    public void exec(){
        System.out.println("report");
    }
}
