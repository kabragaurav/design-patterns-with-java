package behavioral.command.commands;

import behavioral.command.Util;

/**
 * @author gauravkabra
 * @since 2024
 */

public class StringCommand implements Command {

    private Util util;
    private String name;

    public StringCommand(Util util, String name) {
        this.util = util;
        this.name = name;
    }

    @Override
    public void execute() {
        util.sayHi(name);
    }
    
}
