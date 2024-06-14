package behavioral.state.states;

import behavioral.state.Fan;

/**
 * @author gauravkabra
 * @since 2024
 */

public class OffState implements State {

    @Override
    public void changeState(Fan fan) {
        fan.setState(new LowState());
        fan.runWithLowSpeed();
    }
    
}
