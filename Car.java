/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter4.Practice;

import java.util.Scanner;

/**
 *
 * @author DANIEL
 */

class Car extends Vehicle {
    private int numWheels;
    private int numDoors;
    private Engine engine;

    Car(String model, String make, int year, int numWheels, int numDoors) {
        super(model, make, year);
        this.numWheels = numWheels;
        this.numDoors = numDoors;
    }

    String startEngine() {
        engine = new Engine();
        return "Engine Started";
    }

    // Made Private Because You must Park before killing the Engine
    private void killEngine() {
        engine = null;
        System.gc();
    }

    // Move Forward Method
    String moveForward() {
        return "Moving Forward";
    }

    // Reverse Method
    String reverse() {
        return "Reversing";
    }

    // Park Method Call killEngine Method to kill Engine And Then Park
    String park() {
        killEngine();
        return "Parking";
    }

    // Finalize Method Is Called By killEngine()
    @Override
    public void finalize() throws Throwable {
        System.out.println("Destroyed Car Object");
        super.finalize();
    }

    @Override
    public String toString() {
        return "The Name Of This Car Is " + getModel() + ", Made By " + getMake() + ". It's Year Is " + getYear();
    }

    void nextAction() {
        String[] act = { "1. Move Forward", "2. Reverse", "3. Park Car", "4. Show Decription" };
        for (int i = 0; i < act.length; i++) {
            System.out.println(act[i]);
        }

        Scanner sc = new Scanner(System.in);
        System.out.println("Choose An Option");
        int opt = sc.nextInt();

        switch (opt) {
        case 1:
            moveForward();
            break;
        case 2:
            reverse();
            break;
        case 3:
            park();
        case 4:
            System.out.println(toString());
            break;
        }

        sc.close();
    }

    public static void main(String[] args) {
        int noWheels;
        int noDoors;
        int year;

        String make;
        String model;

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter The Name Of The Car's Manufacturer");
        make = sc.next();

        System.out.println("Enter The Model Of The Car");
        model = sc.next();

        System.out.println("Enter The Release Year Of The Car");
        year = sc.nextInt();

        System.out.println("How Many Wheels Does The Car Have?");
        noWheels = sc.nextInt();

        System.out.println("How Many Doors Does The Car Have?");
        noDoors = sc.nextInt();
        sc.close();
        Car c = new Car(model, make, year, noWheels, noDoors);
        System.out.println(c.startEngine());
        c.nextAction();
    }
}




class Vehicle {
    private String _model;
    private String _make;
    private int _year;

    Vehicle(String model, String make, int year) {
        _model = model;
        _make = make;
        _year = year;
    }

    int getYear() {
        return _year;
    }

    String getModel() {
        return _model;
    }

    String getMake() {
        return _make;
    }

    @Override
    public void finalize() throws Throwable {
        System.out.println("Destroyed Vehicle Sublayer");
    }

    class Engine // Refactored To Become an Inner Class Because The Relationship between a
                 // Vehicle and an Engine...Only a vehicle can have an Engine
    {
        private String type;

        Engine() {
            engines();
        }

        void engines() {
            int opt;
            Scanner sc = new Scanner(System.in);

            String[] engs = { "1. MXD Engine", "2. EFS Xpower", "3. Turbo Toyota" }; // Array Of Engine Names

            System.out.println("Choose An Engine");
            for (int i = 0; i < engs.length; i++) {
                System.out.println(engs[i]);
            }

            opt = sc.nextInt();

            switch (opt) {

            case 1:
                type = engs[0];
                break;
            case 2:
                type = engs[1];
                break;
            case 3:
                type = engs[2];
                break;
            }

            sc.close();
        }

        String getType() {
            return type;
        }

        @Override
        public void finalize() {
            System.out.println("Killing Engine Object");
        }
    }
}
