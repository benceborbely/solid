package com.benceborbely.solid.isp;

public class Bicycle implements Vehicle {

    public void accelerate(int speed) {
        System.out.println("Accelerating...");
    }

    public void brake() {
        System.out.println("Braking...");
    }

}
