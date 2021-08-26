package Model;
import java.util.ArrayList;
import java.util.Scanner;

/** Auhthor: MReza_Ghb
 *
 * Thanks a lot Behrad!
 *
 * */

public class Store {
    public static void main(String[] args) {
        ArrayList<Refrigerator> ref = new ArrayList<Refrigerator>();
        ArrayList<Television> tv = new ArrayList<Television>();
        ArrayList<Gas> gas = new ArrayList<Gas>();

        Scanner scanner = new Scanner(System.in);

        int e = 1;
        while (e != 0) {

            try {
                //Main Menu
                System.out.println(" Main Menu \n What Do You Want To Do?");
                System.out.println(" Enter 1 to Add a New Product");
                System.out.println(" Enter 2 to Edit an Existing Product");
                System.out.println(" Enter 3 to Delete an Existing Product");
                System.out.println(" Enter 4 to Show List Of Products");
                System.out.println(" Enter 5 Close The Program");

                int level1 = scanner.nextInt();

                switch (level1) {
                    case 1: {
                        //Add Items
                        System.out.println("What Do You Want To Add?");
                        System.out.println(" 1. Refrigerator");
                        System.out.println(" 2. Televesion");
                        System.out.println(" 3. Model.Gas");

                        int level2 = scanner.nextInt();
                        try {
                            switch (level2) {
                                case 1: {
                                    ref.add(Refrigerator.addRefrigerator());
                                    break;
                                }
                                case 2: {
                                    tv.add(Television.addTv());
                                    break;
                                }
                                case 3: {
                                    gas.add(Gas.addGas());
                                    break;
                                }
                            }


                        }catch (Exception exception){
                            System.out.println("Choose Between Given Items Please: ");
                        }
                        break;
                    }

                    case 2: {
                        //Edit Items (Not Works!!)
                        System.out.println("What Do You Want To Edit?");
                        System.out.println(" 1. Refrigerator");
                        System.out.println(" 2. Television");
                        System.out.println(" 3. Gas");

                        int level3 = scanner.nextInt();

                        try {

                            switch (level3) {
                                case 1: {
                                    int refCounter = 0;
                                    for (Refrigerator r : ref) {
                                        System.out.println((refCounter+1) + ". " + r.getrefInfo() + "\n");
                                        refCounter++;
                                    }

                                    System.out.println("Which One Do You Want to Edit? Enter The Code");
                                    int refEditCode = scanner.nextInt();

                                    Refrigerator refrigerator = new Refrigerator();
                                    refrigerator.updateRefInfo();


                                    break;
                                }
                                case 2: {
                                    int tvCounter = 0;
                                    for (Television t : tv) {
                                        System.out.println((tvCounter+1)+ t.getTvInfo() + "\n");
                                        tvCounter++;
                                    }

                                    Television television = new Television();
                                    television.updateTVInfo();
                                    break;
                                }
                                case 3: {
                                    int gasCounter = 0;
                                    for (Gas g : gas) {
                                        System.out.println((gasCounter + 1)+g.getGasInfo() + "\n");
                                        gasCounter++;
                                    }
                                    Gas gas2 = new Gas();
                                    gas2.updateGasInfo();
                                    break;
                                }

                            }
                        }catch (Exception exception){
                            System.out.println("Choose Between Given Items Please");
                        }
                        break;
                    }

                    case 3: {
                        //Delete Items
                        System.out.println("What Do You Want To Remove?");
                        System.out.println(" 1. Refrigerator");
                        System.out.println(" 2. Televesion");
                        System.out.println(" 3. Model.Gas");

                        int level4 = scanner.nextInt();
                        try{
                            switch (level4) {
                                case 1: {
                                    int refCounter = 0;
                                    for (Refrigerator r : ref) {
                                        System.out.println((refCounter+1) + ". " + r.getrefInfo() + "\n");
                                        refCounter++;
                                    }
                                    System.out.println("Which One Do You Want to Delete? Enter The Code");
                                    int refRemoveCode = scanner.nextInt();
                                    ref.remove(refRemoveCode-1);

                                    break;
                                }
                                case 2: {
                                    int tvCounter = 0;
                                    for (Television t : tv) {
                                        System.out.println((tvCounter+1)+ t.getTvInfo() + "\n");
                                        tvCounter++;
                                    }
                                    System.out.println("Which One Do You Want to Delete? Enter The Code");
                                    int tvRemoveCode = scanner.nextInt();
                                    ref.remove(tvRemoveCode-1);
                                    break;
                                }
                                case 3: {
                                    int gasCounter = 0;
                                    for (Gas g : gas) {
                                        System.out.println((gasCounter + 1)+g.getGasInfo() + "\n");
                                        gasCounter++;
                                    }
                                    System.out.println("Which One Do You Want to Delete? Enter The Code");
                                    int gasRemoveCode = scanner.nextInt();
                                    ref.remove(gasRemoveCode-1);
                                    break;
                                }
                            }
                        }catch (Exception exception){
                            System.out.println("Choose Between Given Items Please");
                        }
                        break;

                    }

                    case 4: {
                        //See Items
                        System.out.println("Which Product Do You Want To See?");
                        System.out.println("\n 1. Refrigerator");
                        System.out.println("\n 2. Televesion");
                        System.out.println("\n 3. Model.Gas");


                        int level5 = scanner.nextInt();

                        try {
                            switch (level5) {
                                case 1: {
                                    int refCounter = 0;
                                    for (Refrigerator r : ref) {
                                        System.out.println((refCounter+1) + ". " + r.getrefInfo() + "\n");
                                        refCounter++;
                                    }
                                    break;
                                }
                                case 2: {
                                    int tvCounter = 0;
                                    for (Television t : tv) {
                                        System.out.println((tvCounter+1)+ t.getTvInfo() + "\n");
                                        tvCounter++;
                                    }
                                    break;
                                }
                                case 3: {
                                    int gasCounter = 0;
                                    for (Gas g : gas) {
                                        System.out.println((gasCounter + 1)+g.getGasInfo() + "\n");
                                        gasCounter++;
                                    }
                                    break;
                                }
                            }
                        }catch (Exception exception){
                            System.out.println("Choose Between Given Items Please");
                        }
                        break;
                    }
                    case 5: {
                        // Closes The Program
                        e = 0;
                    }

                }

            } catch (Exception exception) {
                System.out.println("Choose Between Given Items Please");
            }
        }
    }
}
