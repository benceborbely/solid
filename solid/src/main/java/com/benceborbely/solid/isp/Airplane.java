package com.benceborbely.solid.isp;

public class Airplane implements MotorizedVehicle, Flyable {

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

    public void takeOff() {
        System.out.println("Taking off...");
    }

    public void land() {
        System.out.println("Landing...");
    }

}
