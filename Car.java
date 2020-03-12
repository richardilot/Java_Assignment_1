package edu.saxion;

public class Car {

    private String registrationPlates;
    private String colors;
    private int buildYears;
    private double invoices;

    public Car(String registrationPlates, String colors, int buildYears, double invoices) {
        this.registrationPlates = registrationPlates;
        this.colors = colors;
        this.buildYears = buildYears;
        this.invoices = invoices;
    }

    public String getRegistrationPlates() {
        return registrationPlates;
    }

    public double getInvoices() {
        return invoices;
    }

    public void setInvoices(double invoices) {
        this.invoices = invoices;
    }


    public String toString() {
        return registrationPlates + " | " +
                this.colors + " | " +
                this.buildYears;
    }

}
