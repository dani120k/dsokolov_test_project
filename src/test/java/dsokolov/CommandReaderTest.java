package dsokolov;

import dsokolov.commands.Command;
import dsokolov.commands.impl.Demand;
import dsokolov.commands.impl.Purchase;
import org.junit.Assert;
import org.junit.Test;

public class CommandReaderTest {
    @Test
    public void testBuy(){
        String command = "PURCHASE iphone 1 1000 01.01.2017";
        CommandReader reader = new CommandReader();
        Command cmd = reader.read(command);
        Assert.assertTrue(cmd instanceof Purchase);

        command = "DEMAND iphone 1 1000 01.01.2017";
        cmd = reader.read(command);
        Assert.assertTrue(cmd instanceof Demand);


    }
}
