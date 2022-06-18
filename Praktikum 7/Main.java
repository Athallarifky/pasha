/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugasarraylist;

/**
 *
 * @author Lenovo
 */
public class Main {
    

    public static void main(String[] args) {
        CarRider rider1 = new CarRider ("Stephen Curry", 30, "081236676767");
        CarRider rider2 = new CarRider ("Koro Sensei", 20, "082738738739");
        CarRider rider3 = new CarRider ("RRQ Alberttt", 18, "08787383733");
        CarRider rider4 = new CarRider ("Cristiano Messi", 17, "08766969679");


        CarData data = new CarData();
        data.addCar("LISTRIK", "B 5656 SOC", "Tesla");
        data.addCar("JEEP", "BG 9787 JAK", "BMW");
        data.addCar("SEDAN", "M 1212 BDG", "PEUGEOT");
        data.addCar("SUV", "AG 6589 MLG", "Toyota");

        data.listOfCar();

        RentArchive arsip = new RentArchive();
        arsip.rent(rider1, data.getCarList().get(0), 12);
        arsip.rent(rider2, data.getCarList().get(1), 7);
        arsip.rent(rider3, data.getCarList().get(2), 3);
        arsip.rent(rider4, data.getCarList().get(3), 2);

        System.out.println();
        Car.status();

        System.out.println();
        arsip.info();
    }
}


