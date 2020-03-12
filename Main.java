package edu.saxion;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Welcome to the Garage Invoice system.");
        var scanner = new Scanner(System.in);
        System.out.println("What's the capacity of the garage?");
        var capacity = scanner.nextInt();

        var garageData = new GarageData();
        var menuHandler = new Menu();

        while(true){
             menuHandler.MenuPrinter();

            var option = scanner.nextInt();

            switch (option){
                case 1: {
                    menuHandler.addNewCar(garageData, scanner, capacity);
                }
                    break;
                case 2: {
                    menuHandler.setInvoice(garageData, scanner);
                }
                    break;
                case 3: {
                    menuHandler.getInvoice(garageData, scanner);
                }
                    break;
                case 4: {
                    menuHandler.printCar(garageData, scanner);
                }
                    break;
                case 5: {
                    menuHandler.sumCalculation(garageData);
                }
                    break;
                case 6: {
                    menuHandler.noInvoiceChecker(garageData);
                }
                    break;
                case 7: {
                    menuHandler.filledInvoiceChecker(garageData);
                }
                    break;
                case 8: {
                    menuHandler.invoiceDiscount(garageData, scanner);
                }
                    break;
                default:
                    break;
            }

            if (option == 0){
                break;
            }
        }
    }
}