package behavioral.command;

import behavioral.command.commands.Command;
import behavioral.command.commands.NumberCommand;
import behavioral.command.commands.StringCommand;

/**
 * @author gauravkabra
 * @since 2024
 */

public class Runner {
    public static void main(String[] args) {
        Util util = new Util();

        Command numCommand = new NumberCommand(util, 2, 3);
        Command strCommand = new StringCommand(util, "gaurav");

        Invoker invoker = new Invoker();
        invoker.setCommand(strCommand);
        invoker.go();

        invoker.setCommand(numCommand);
        invoker.go();
    }
}
