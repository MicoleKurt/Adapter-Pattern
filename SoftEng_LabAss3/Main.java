package SoftEng_LabAss3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Gonda_Lab Assignment 3");
        System.out.println("");

        Scanner scanner = new Scanner(System.in);
        boolean continueLoop = true;

        Laptop laptop = new Laptop();
        Refrigerator refrigerator = new Refrigerator();
        SmartphoneCharger charger = new SmartphoneCharger();

        PowerOutlet laptopAdapter = new LaptopAdapter(laptop);
        PowerOutlet fridgeAdapter = new RefrigeratorAdapter(refrigerator);
        PowerOutlet phoneAdapter = new SmartphoneAdapter(charger);

        while (continueLoop) {  System.out.println("");
            System.out.println("Choose a device to plug in:");
            System.out.println("1 - Laptop");
            System.out.println("2 - Refrigerator");
            System.out.println("3 - Smartphone Charger");
            System.out.print("Enter your choice (1-3): ");
          
            
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    laptopAdapter.plugIn();
                    break;
                case 2:
                    fridgeAdapter.plugIn();
                    break;
                case 3:
                    phoneAdapter.plugIn();
                    break;
                default:
                    System.out.println("Invalid choice, try again.");
                    continue;
            }

            System.out.print("Do you want to plug in another device? (yes/no): ");
            String response = scanner.nextLine().trim().toLowerCase();
            if (!response.equals("yes")) {
                continueLoop = false;
            }
        }

        System.out.println("Program ended.");
        scanner.close();
    }
}