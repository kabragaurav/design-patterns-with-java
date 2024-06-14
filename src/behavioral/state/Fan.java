package behavioral.state;

import behavioral.state.states.OffState;
import behavioral.state.states.State;

/**
 * @author gauravkabra
 * @since 2024
 */

public class Fan {

    private State state;

    public Fan() {
        this.state = new OffState();
    }

    public void switchOff() {
        System.out.println("Switching off...");
    }

    public void runWithLowSpeed() {
        System.out.println("Running at low speed now");
    }

    public void runWithMediumSpeed() {
        System.out.println("Running at medium speed now");
    }

    public void runWithHighSpeed() {
        System.out.println("Running at high speed now");
    }

    public void rotateKnob() {
        state.changeState(this);
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

}
