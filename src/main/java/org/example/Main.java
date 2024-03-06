package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("Input Car brand: ");
            String carBrand = scanner.nextLine();
            System.out.print("Input Car model: ");
            String carModel = scanner.nextLine();
            System.out.print("Input Car year: ");
            int carYear = scanner.nextInt();
            System.out.print("Input Car Doors: ");
            int carNumOfDoors = scanner.nextInt();

            Car car = new Car(carBrand, carModel, carYear, carNumOfDoors);
            System.out.println("Car sound: " + car.vehicleSound());

            System.out.print("Input Motorcycle brand: ");
            String motorcycleBrand = scanner.next();
            System.out.print("Input Motorcycle model: ");
            String motorcycleModel = scanner.next();
            System.out.print("Input Motorcycle year: ");
            int motorcycleYear = scanner.nextInt();
            System.out.print("Motorcycle have a sidecar? (T/F): ");
            boolean motorcycleHasSidecar = scanner.nextBoolean();

            Motorcycle motorcycle = new Motorcycle(motorcycleBrand, motorcycleModel, motorcycleYear, motorcycleHasSidecar);
            System.out.println("Motorcycle sound: " + motorcycle.vehicleSound());
        } catch (InvalidYearException e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("End.");
        }
    }
}
