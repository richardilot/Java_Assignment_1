package edu.saxion;

import java.util.Scanner;

public class Menu {

    public void MenuPrinter(){
        System.out.println("\nGarage invoice system");
        System.out.println("0: Exit system");
        System.out.println("1: Add a new car");
        System.out.println("2: Set invoice for a car");
        System.out.println("3: Get invoice for a car");
        System.out.println("4: Print car info");
        System.out.println("5: Print sum of invoices");
        System.out.println("EXTRA FEATURES:");
        System.out.println("6: Print car(s) with no invoice");
        System.out.println("7: Print car(s) with filled invoice");
        System.out.println("8: Invoice Discount");
    }

    public void addNewCar(GarageData garageData, Scanner scanner, int capacity){ //1
        if(garageData.getCount() == capacity){
            System.out.println("The garage is full");
        }
        else {
            System.out.println("Enter the registration of the car");
            var reg = scanner.next();
            System.out.println("Enter the color of the car");
            var color = scanner.next();
            System.out.println("Enter the build year of the car");
            var buildYear = scanner.nextInt();
            garageData.addCar(reg, color, buildYear);
        }
    }

    public void setInvoice(GarageData garageData, Scanner scanner){ //2
        System.out.println("Enter the registration of the car");
        var reg = scanner.next();
        System.out.println("Enter the invoice amount of the car");
        var amount = scanner.nextDouble();
        garageData.setInvoiceFor(reg, amount);
    }

    public void getInvoice(GarageData garageData, Scanner scanner){ //3
        System.out.println("Enter the registration of the car");
        var reg = scanner.next();
        System.out.println("The invoice is: " + garageData.getInvoiceFor(reg));
    }

    public void printCar(GarageData garageData, Scanner scanner){ //4
        System.out.println("There are " + garageData.getCount() + " cars.");
        System.out.println("For which car should I print the info?");
        var index = scanner.nextInt();
        System.out.println(garageData.getCar(index - 1));
    }

    public void sumCalculation(GarageData garageData){ //5
        System.out.println("The sum of invoices is: " + garageData.calculateTotalInvoices());
    }

    public void noInvoiceChecker(GarageData garageData){ //6
        System.out.println("Car(s) with no invoice:");
        garageData.getNoInvoiceChecker();
    }

    public void filledInvoiceChecker(GarageData garageData){ //7
        System.out.println("Car(s) with filled invoice:");
        garageData.getFilledInvoiceChecker();
    }

    public void invoiceDiscount(GarageData garageData, Scanner scanner){ //8
        System.out.println("Enter the registration of the car");
        var reg = scanner.next();
        if(garageData.getInvoiceFor(reg) > 0){
            System.out.println("Enter the amount of discount");
            var disc = scanner.nextDouble();
            if (disc < 0 || disc > 100){
                System.out.println("Enter discount 0-100");
                scanner.nextDouble();
        }
            else System.out.println("The invoice is: " + garageData.invoiceDiscountCalculation(reg, disc));

        }
        else System.out.println("Car doesn't have invoice");
    }

}
