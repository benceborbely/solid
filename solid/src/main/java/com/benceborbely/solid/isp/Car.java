package com.benceborbely.solid.isp;

public class Car implements MotorizedVehicle {

    public void engineStart() {
        System.out.println("Starting...");
    }

    public void engineStop() {
        System.out.println("Stopping...");
    }

    public void accelerate(int speed) {
        System.out.println("Accelerating...");
    }

    public void brake() {
        System.out.println("Braking...");
    }

}
