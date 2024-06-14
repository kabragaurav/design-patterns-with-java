package behavioral.state.states;

import behavioral.state.Fan;

/**
 * @author gauravkabra
 * @since 2024
 */

public interface State {
    void changeState(Fan fan);
}
