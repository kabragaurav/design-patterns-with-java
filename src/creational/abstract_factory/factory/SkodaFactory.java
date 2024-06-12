package creational.abstract_factory.factory;

import creational.abstract_factory.product.Engine;
import creational.abstract_factory.product.SkodaEngine;
import creational.abstract_factory.product.SkodaTransmission;
import creational.abstract_factory.product.Transmission;

/**
 * ConcreteFactoryB
 * 
 * @author gauravkabra
 * @since 2024
 */


class SkodaFactory implements CarFactory {

    @Override
    public Engine createEngine() {
        return new SkodaEngine();
    }

    @Override
    public Transmission createTransmission() {
        return new SkodaTransmission();
    }
    
}