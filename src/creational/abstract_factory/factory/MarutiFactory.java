package creational.abstract_factory.factory;

import creational.abstract_factory.product.Engine;
import creational.abstract_factory.product.MarutiEngine;
import creational.abstract_factory.product.MarutiTransmission;
import creational.abstract_factory.product.Transmission;

/**
 * ConcreteFactoryA
 * 
 * We can also bring MarutiEngine and MarutiTransmission here as inner class, 
 * instead of their own classes
 * 
 * @author gauravkabra
 * @since 2024
 */

class MarutiFactory implements CarFactory {

    @Override
    public Engine createEngine() {
        return new MarutiEngine();
    }

    @Override
    public Transmission createTransmission() {
        return new MarutiTransmission();
    }
    
}