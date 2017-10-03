package com.benceborbely.not.solid.isp;

public class Bicycle implements Vehicle {

    public void engineStart() {
        //Skip
    }

    public void engineStop() {
        //Skip
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
