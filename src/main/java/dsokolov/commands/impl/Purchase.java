package dsokolov.commands.impl;

import dsokolov.commands.Command;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Purchase implements Command {
    private String name;
    private int amount;
    private int price;
    private Date date;

    @Override
    public Command parse(String[] splitted){
        if (splitted.length != 5)
            return new ErrorCommand();

        String name = splitted[1];
        String amount = splitted[2];
        String price = splitted[3];
        String date = splitted[4];

        try{
            this.name = name;
            this.amount = Integer.valueOf(amount);
            this.price = Integer.valueOf(price);
            this.date = new SimpleDateFormat("dd.MM.yyyy").parse(date);
            return this;
        }catch (Exception ex){
            return new ErrorCommand();
        }
    }

    @Override
    public void exec(){
        System.out.println("purchase");
    }
}
