package behavioral.state;

import java.util.Scanner;

public class Runner {
    public static void main(String[] args) {
        Fan fan = new Fan();
        Scanner sc = new Scanner(System.in);

        System.out.println("I am Alexa, hit Enter/Return to change speed of fan...");

        while (true) {
            sc.nextLine();
            fan.rotateKnob();
        }
    }
}
