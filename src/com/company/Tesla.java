package com.company;

public class Tesla implements Driveable {

    private final String model;
    private final int horsePower;
    private int xPos;
    private int yPos;

    public Tesla(String m, int hp, int x, int y) {
        this.model = m;
        this.horsePower = hp;
        this.xPos = x;
        this.yPos = y;
    }

    public void drive(int x, int y) {
        this.xPos += x;
        this.yPos += y;
        System.out.println("The " + this.model + " (" + this.horsePower + " PS)" + " has just gotten the drive inputs " + x + ", and " + y + ", and then drives to the coordinates X: " + this.xPos + ", Y: " + this.yPos);
        System.out.println();
    }

    public void printPosition() {
        System.out.println("The " + this.model + " (" + this.horsePower + " PS)" + " is currently parked at the coordinates X: " + this.xPos + ", Y: " + this.yPos);
        System.out.println();
    }
}
