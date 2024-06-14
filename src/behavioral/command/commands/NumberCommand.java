package behavioral.command.commands;

import behavioral.command.Util;

/**
 * @author gauravkabra
 * @since 2024
 */

public class NumberCommand implements Command {

    private Util util;
    private int num1;
    private int num2;

    public NumberCommand(Util util, int num1, int num2) {
        this.util = util;
        this.num1 = num1;
        this.num2 = num2;
    }

    @Override
    public void execute() {
        util.addNumbers(num1, num2);
    }
    
}
