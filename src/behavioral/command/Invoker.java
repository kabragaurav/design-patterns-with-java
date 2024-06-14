package behavioral.command;

import behavioral.command.commands.Command;

/**
 * @author gauravkabra
 * @since 2024
 */

public class Invoker {
    private Command command;

    void setCommand(Command command) {
        this.command = command;
    }

    void go() {
        command.execute();
    }
}
