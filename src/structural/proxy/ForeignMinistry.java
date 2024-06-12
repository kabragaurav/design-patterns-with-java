package structural.proxy;

import java.util.HashMap;

/**
 * Proxy
 * 
 * @author gauravkabra
 * @since 2024
 */

public class ForeignMinistry implements State {

    private HashMap<String, String> stateToCapitalMap = new HashMap<>();
    
    @Override
    public String getCapital(String stateName) {
        if (stateToCapitalMap.containsKey(stateName)) {
            return stateToCapitalMap.get(stateName);
        }

        String capital = null;
        switch (stateName) {
            case "Rajasthan":
                capital = new Rajasthan().getCapital(stateName);
                break;
            default:
                throw new UnsupportedOperationException("no such state");
        }

        stateToCapitalMap.put(stateName, capital);
        return capital;
    }
    
}
