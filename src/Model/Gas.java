package Model;

import java.time.Instant;
import java.util.Date;
import java.util.Scanner;

public class Gas implements Product {
    private String gasCompanyName;
    private String gasModelName;
    private double gasPrice;
    private String gasDescription;


    public Gas(String gasCompanyName , String gasModelName , double gasPrice, String Description){
        this.gasCompanyName = gasCompanyName;
        this.gasModelName = gasModelName;
        this.gasPrice = gasPrice;
        this.gasDescription = Description;
    }

    public Gas(){

    }

    @Override
    public String CompanytName() {
        return this.gasCompanyName;
    }

    @Override
    public String ModelName() {
        return this.gasModelName;
    }

    @Override
    public Double Price() {
        return this.gasPrice;
    }

    @Override
    public String Description() {
        return this.gasDescription;
    }

    public static Gas addGas() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter Gas Company Name");
        String gasCoName = scanner.nextLine();

        System.out.println("\nEnter Gas Model Name");
        String gasModel = scanner.nextLine();

        System.out.println("\nEnter Gas Model Description");
        String gasDescription = scanner.nextLine();

        System.out.println("\nEnter Gas Price");
        double gasPrice = scanner.nextDouble();

        return new Gas(gasCoName, gasModel, gasPrice, gasDescription);
    }

    public void updateGasInfo(){

        Scanner scanner1 = new Scanner(System.in);

        System.out.println("\nChange Gas Company Name From " + gasCompanyName + " to : ");
        gasCompanyName = scanner1.nextLine();

        System.out.println("\nChange Gas Model From " + gasModelName + " to : ");
        gasModelName = scanner1.nextLine();

        System.out.println("\nChange Gas Price From " + gasPrice + " to : ");
        gasPrice = scanner1.nextDouble();

        System.out.println("\nChange Gas Model From " + gasDescription + " to : ");
        gasDescription = scanner1.nextLine();

    }

    public String getGasInfo() {
        return "Gas{" + " Company Name=" + gasCompanyName + ", Model=" + gasModelName + ", Price=" + gasPrice + ", Description=" + gasDescription + '}';
    }

}

