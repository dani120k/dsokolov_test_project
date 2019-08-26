package dsokolov;

import dsokolov.commands.Command;
import java.util.Scanner;

public class App 
{
    public static final CommandReader reader = new CommandReader();
    public static final Scanner sc = new Scanner(System.in);

    public static void main( String[] args ){
        while (true){
            Command cmd = reader.read(sc.nextLine());
            cmd.exec();
        }
    }
}
