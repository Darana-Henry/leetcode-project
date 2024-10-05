//https://leetcode.com/problems/design-parking-system/
package algorithms.easy.d;

public class DesignParkingSystem {
    public static void main(String[] args) {
        ParkingSystem parkingSystem = new ParkingSystem(1, 1, 0);

        // return true because there is 1 available slot for a big car
        System.out.println("Output:\t" + parkingSystem.addCar(1));

        // return true because there is 1 available slot for a medium car
        System.out.println("Output:\t" + parkingSystem.addCar(2));

        // return false because there is no available slot for a small car
        System.out.println("Output:\t" + parkingSystem.addCar(3));

        // return false because there is no available slot for a big car. It is already occupied.
        System.out.println("Output:\t" + parkingSystem.addCar(1));
    }
}

class ParkingSystem {
    int big = 0;
    int medium = 0;
    int small = 0;

    public ParkingSystem(int big, int medium, int small) {
        this.big = big;
        this.medium = medium;
        this.small = small;
    }

    public boolean addCar(int carType) {
        if (carType == 1 && big > 0) big--;
        else if (carType == 2 && medium > 0) medium--;
        else if (carType == 3 && small > 0) small--;
        else return false;
        return true;

    }
}