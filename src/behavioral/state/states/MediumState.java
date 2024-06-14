package behavioral.state.states;

import behavioral.state.Fan;

/**
 * @author gauravkabra
 * @since 2024
 */

public class MediumState implements State {

    @Override
    public void changeState(Fan fan) {
        fan.setState(new HighState());
        fan.runWithHighSpeed();
    }
    
}
