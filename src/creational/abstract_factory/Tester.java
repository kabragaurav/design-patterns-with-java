package creational.abstract_factory;

import creational.abstract_factory.factory.CarFactory;

public class Tester {
    public static void main(String[] args) {
        CarFactory marutiFactory = CarFactory.getCarFactory("maruti");
        marutiFactory.createEngine().describeEngine();
        marutiFactory.createTransmission().describeTransmission();

        CarFactory skodaFactory = CarFactory.getCarFactory("skoda");
        skodaFactory.createEngine().describeEngine();
        skodaFactory.createTransmission().describeTransmission();

        CarFactory fordFactory = CarFactory.getCarFactory("ford");
        fordFactory.createEngine().describeEngine();
        fordFactory.createTransmission().describeTransmission();
    }
}
