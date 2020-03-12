package edu.saxion;

import java.util.ArrayList;

public class GarageData {

    private ArrayList<Car> car;

    public GarageData() {
        this.car = new ArrayList<>();
    }

    public Car getCar(int index) {
        return car.get(index);
    }

    public int getCount() {
        return car.size();
    }

    public void setInvoiceFor(String registration, double amount){
        for (Car value : car) {
            if (value.getRegistrationPlates().equals(registration)) {
                value.setInvoices(amount);
                break;
            }
        }
    }

    public double getInvoiceFor(String registration){
        for (Car value : car) {
            if (value.getRegistrationPlates().equals(registration)) {
                return value.getInvoices();
            }
        }
        return 0.0;
    }

    public void getNoInvoiceChecker(){
        for (Car value : car) {
            if (value.getInvoices() == 0) {
                System.out.println(value.toString());
            }
        }
    }

    public void getFilledInvoiceChecker(){
        for (Car value : car) {
            if (value.getInvoices() > 0) {
                System.out.println(value.getRegistrationPlates());
            }
        }
    }

    public double calculateTotalInvoices(){
        var sum = 0.0;
        for (var cars:car) {
            sum+= cars.getInvoices();
    }
//        for (var i=0; i < car.size(); i++){
//            sum += this.car.get(i).getInvoices();
//        }
        return sum;
    }

    public double invoiceDiscountCalculation(String registration, double discount){
        var finalDiscountPrice = 0.0;
        for (var cars:car) {
            if (cars.getRegistrationPlates().equals(registration)) {
                var divWithDiscount = discount / 100;
                var subWithInvoice = cars.getInvoices() * divWithDiscount;
                finalDiscountPrice = cars.getInvoices() - subWithInvoice;
                cars.setInvoices(finalDiscountPrice);
                return finalDiscountPrice;
                }
            //TODO: do check if the discount and invoice is weird
            //done in menu
        }
        return 0.0;
    }

    public void addCar(String registration, String color, int buildYear){
        this.car.add(new Car(registration, color, buildYear, 0.0));
        //TODO : check capacity
        //done in menu
    }
}
