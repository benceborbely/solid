package com.benceborbely.not.solid.isp;

public class Car implements Vehicle {

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
        //Skip
    }

    public void land() {
        //Skip
    }

}
