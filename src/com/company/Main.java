package com.company;

public class Main {

    public static void main(String[] args) {

        Audi audi1 = new Audi("Audi A4", 170, 5, 5);
        Audi audi2 = new Audi("Audi A7", 330, 10, 10);

        Tesla tesla1 = new Tesla("Tesla Model 3", 200, 15, 15);
        Tesla tesla2 = new Tesla("Tesla Model S", 400, 20, 20);
        Tesla tesla3 = new Tesla("Tesla Model X", 360, 25, 25);

        Driveable[] myGarage = new Driveable[5];
        myGarage[0] = audi1;
        myGarage[1] = audi2;
        myGarage[2] = tesla1;
        myGarage[3] = tesla2;
        myGarage[4] = tesla3;

        myGarage[3].printPosition();
        myGarage[3].drive(20, -5);
        myGarage[3].printPosition();
    }
}
