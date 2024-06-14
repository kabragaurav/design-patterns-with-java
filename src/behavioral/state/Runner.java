package behavioral.state;

import java.util.Scanner;

/**
 * @author gauravkabra
 * @since 2024
 */

public class Runner {
    public static void main(String[] args) {
        Fan fan = new Fan();
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("I am Alexa, hit Enter/Return and I will change speed of fan...");

            while (true) {
                sc.nextLine();
                fan.rotateKnob();
            }
        }
    }
}
