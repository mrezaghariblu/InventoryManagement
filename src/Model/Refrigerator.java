package Model;

import java.time.Instant;
import java.util.Date;
import java.util.Scanner;

public class Refrigerator implements Product{

    private String CompanyName;
    private String ModelName;
    private double Price;
    private String Description;

    public Refrigerator(String CompanyName , String ModelName , double Price, String Description){
        this.CompanyName = CompanyName;
        this.ModelName = ModelName;
        this.Price = Price;
        this.Description = Description;
    }

    public Refrigerator(){

    }

    @Override
    public String CompanytName() {
        return this.CompanyName;
    }

    public void setCompanyName(){
        this.CompanyName = CompanyName;
    }

    public void setModelName(){
        this.ModelName = ModelName;
    }
    public void setPrice(){
        this.Price = Price;
    }
    @Override
    public String ModelName() {
        return this.ModelName;
    }

    @Override
    public Double Price() {
        return this.Price;
    }

    @Override
    public String Description() {
        return this.Description;
    }

    public static Refrigerator addRefrigerator() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter Refrigerator Company Name");
        String refCoName = scanner.nextLine();

        System.out.println("\nEnter Refrigerator Model Name");
        String refModel = scanner.nextLine();

        System.out.println("\nEnter Refrigerator Description");
        String refDescription = scanner.nextLine();

        System.out.println("\nEnter Refrigerator Price");
        double refPrice = scanner.nextDouble();

        return new Refrigerator(refCoName, refModel, refPrice, refDescription);
    }

    public void updateRefInfo() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("\nChange Refrigerator Company Name From " + CompanyName + " to : ");
        CompanyName = scanner.nextLine();

        System.out.println("\nChange Refrigerator Model From " + ModelName + " to : ");
        ModelName = scanner.nextLine();

        System.out.println("\nChange Refrigerator Price From " + Price + " to : ");
        Price = scanner.nextDouble();

        System.out.println("\nChange Refrigerator Date of Enter to Store From " + Description + " to : ");
        Description = scanner.nextLine();

    }

    public String getrefInfo() {
        return "Refrigerator{" + " Company Name=" + CompanyName + ", Model=" + ModelName + ", Price=" + Price + ", Description=" + Description + '}';
    }



}
