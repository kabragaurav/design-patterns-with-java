package creational.abstract_factory.factory;

import creational.abstract_factory.product.Engine;
import creational.abstract_factory.product.MarutiEngine;
import creational.abstract_factory.product.MarutiTransmission;
import creational.abstract_factory.product.Transmission;

/**
 * ConcreteFactoryA
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