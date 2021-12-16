package com.tosan.example1;

public class Car {
    String brand;
    private final int maxSpeed;
    int currentSpeed;
    int accelate;
    String color;

    public Car(){
        this(200, 10);
        System.out.println("No Arg Constructor called");
    }

    public Car(int maxSpeedFromOut, int accelate2){
        maxSpeed = maxSpeedFromOut;
        accelate = accelate2;
        System.out.println("Arg Constructor called");
    }

    void show(){
        System.out.println(color + " " + brand + " is moving with speed " + currentSpeed);
    }

    void move(){
        System.out.println("Speed increase by " + accelate);
        currentSpeed = currentSpeed + accelate;
    }

    void stop(){
        System.out.println("Speed decrease by " + (accelate / 2));
        currentSpeed = currentSpeed - (accelate / 2);
    }

    void showMaxSpeed(){
        System.out.println("Max Speed is " + maxSpeed);
    }
}
