package com.example.elevator;

public class Elevator {
    public int totalFloors;

    public Elevator(int totalFloors) {
        this.totalFloors = totalFloors;

    }
    public String goToFloorA() {
        return "1";
    }

    public String goToFloorB() {
        return "2";
    }

    public String goToFloorC() {
        return "3";
    }
    public String goToFloorGround() {
        return "Ground";
    }
}
