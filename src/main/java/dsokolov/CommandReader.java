package dsokolov;

import dsokolov.commands.Command;
import dsokolov.commands.impl.*;

import java.text.SimpleDateFormat;
import java.util.Date;

public class CommandReader {
    public Command read(String cmd){
        String[] splitted = cmd.split(" ");

        String com = splitted[0];
        switch (com) {
            case "NEWPRODUCT":
                return new NewProduct().parse(splitted);
            case "PURCHASE":
                return new Purchase().parse(splitted);
            case "DEMAND":
                return new Demand().parse(splitted);
            case "SALESREPORT":
                return new Report().parse(splitted);
            default:
                return new ErrorCommand();
        }
    }

}
