package Model;

import Model.Product;

import java.time.Instant;
import java.util.Date;
import java.util.Scanner;

public class Television implements Product {
    private String tvCompanyName;
    private String tvModelName;
    private double tvPrice;
    private String tvDescription;

    public Television(String tvCompanyName , String tvModelName , double tvPrice, String tvDescription){
        this.tvCompanyName = tvCompanyName;
        this.tvModelName = tvModelName;
        this.tvPrice = tvPrice;
        this.tvDescription = tvDescription;
    }

    public Television(){

    }

    @Override
    public String CompanytName() {
        return this.tvCompanyName;
    }

    @Override
    public String ModelName() {
        return this.tvModelName;
    }

    @Override
    public Double Price() {
        return this.tvPrice;
    }

    @Override
    public String Description() {
        return this.tvDescription;
    }

    public static Television addTv() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter TeleVision Company Name");
        String tvCoName = scanner.nextLine();

        System.out.println("\nEnter TeleVision Model Name");
        String tvModel = scanner.nextLine();

        System.out.println("\nEnter TeleVision Description");
        String tvDescription = scanner.nextLine();

        System.out.println("\nEnter TeleVision Price");
        double tvPrice = scanner.nextDouble();

        return new Television(tvCoName, tvModel, tvPrice, tvDescription);
    }

    public void updateTVInfo(){

        Scanner scanner1 = new Scanner(System.in);

        System.out.println("\nChange TeleVision Company Name From " + tvCompanyName + " to : ");
        tvCompanyName = scanner1.nextLine();

        System.out.println("\nChange TeleVision Model From " + tvModelName + " to : ");
        tvModelName = scanner1.nextLine();

        System.out.println("\nChange TeleVision Price From " + tvPrice + " to : ");
        tvPrice = scanner1.nextDouble();

        System.out.println("\nChange TeleVision Description " + tvDescription + " to : ");
        tvDescription = scanner1.nextLine();

    }

    public String getTvInfo() {
        return "Television{" + " Company Name=" + tvCompanyName + ", Model=" + tvModelName + ", Price=" + tvPrice + ", Description=" + tvDescription + '}';
    }

}
