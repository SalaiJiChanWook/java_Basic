package Project;

import com.sun.speech.freetts.Voice;
import com.sun.speech.freetts.VoiceManager;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Iterator;
import java.util.Scanner;
import javax.swing.DefaultListModel;

public class WarehouseProduct implements Warehouse {

    static Scanner input = new Scanner(System.in);
    String choice;

    @Override
    public void addProduct() {

        System.setProperty("freetts.voices", "com.sun.speech.freetts.en.us.cmu_us_kal.KevinVoiceDirectory");
//        System.setProperty("freetts.voices", "com.sun.speech.freetts.en.us.cmu_time_awb.AlanVoiceDirectory");
        Voice voice = VoiceManager.getInstance().getVoice("kevin16");

        //print all voices
        Voice[] voicelist;
        voicelist = VoiceManager.getInstance().getVoices();
        if (voice != null) {
            voice.allocate();
            boolean status = voice.speak("Great you Choice Number One...");
        }

        if (voice != null) {
            voice.allocate();
            boolean status = voice.speak("Enter your product  I..D...");
        }

        input.nextLine();
        System.out.print("\nEnter Product ID : ");
        String productID = input.nextLine();

        if (voice != null) {
            voice.allocate();
            boolean status = voice.speak("Enter your product  Name ...");
        }

        System.out.print("Enter Product Name : ");
        String productName = input.nextLine();

        if (voice != null) {
            voice.allocate();
            boolean status = voice.speak("Excuse me sir" + "your product  Type ...is Electrical");
        }

        String type = "Electrical";
        System.out.println("Product Type : " + type);

        if (voice != null) {
            voice.allocate();
            boolean status = voice.speak("Enter...your product  Length ...in cetemeter");
        }

        System.out.print("Enter Product Length(cm) : ");
        int productLength = input.nextInt();

        if (voice != null) {
            voice.allocate();
            boolean status = voice.speak("Enter your product  width ...in centemeter");
        }

        System.out.print("Enter Product Width(cm) : ");
        int productWidth = input.nextInt();

        if (voice != null) {
            voice.allocate();
            boolean status = voice.speak("Enter... " + "your product ..High ...in cetemeter");
        }

        System.out.print("Enter Product Height(cm) : ");
        int productHeight = input.nextInt();

        if (voice != null) {
            voice.allocate();
            boolean status = voice.speak("Enter your product Quantity");
        }

        System.out.print("Enter Product Quantity : ");
        int productQuantity = input.nextInt();

        GregorianCalendar gc = new GregorianCalendar();
        SimpleDateFormat date = new SimpleDateFormat("dd-MM-yyyy");
        String receivedDate = String.valueOf(date.format(gc.getTime()));
        System.out.println("Received Date : " + receivedDate.formatted(date.format(gc.get(productWidth))));

        if (voice != null) {
            voice.allocate();
            boolean status = voice.speak("Your received date is: " + receivedDate);
        }
        if (voice != null) {
            voice.allocate();
            boolean status = voice.speak("Enter the rack");
        }

        System.out.print("Enter Rack : ");
        String rack = input.next();

        if (voice != null) {
            voice.allocate();
            boolean status = voice.speak("Enter the .., Bay ");
        }

        System.out.print("Enter Bay : ");
        String bay = input.next();

        Product product1 = new Product(productID, productName, type, productLength,
                productWidth, productHeight,
                productQuantity, receivedDate, rack, bay);

        DataController dataController = new DataController();
        if (dataController.product_register(product1)) {
            System.out.println("Item is successfully registered in "
                    + rack + " rack and " + bay + " bay(s).");
            if (voice != null) {
                voice.allocate();
                boolean status = voice.speak("The Item is successfully registered in "
                        + rack + " rack and " + bay + " bays");
            }
        } else {
            System.out.println(dataController.errormessage);
            addProduct();
        }
        addAnother();
        while (choice.equalsIgnoreCase("Y"));
    }

    @Override
    public void choice() {

        System.setProperty("freetts.voices", "com.sun.speech.freetts.en.us.cmu_us_kal.KevinVoiceDirectory");
//        System.setProperty("freetts.voices", "com.sun.speech.freetts.en.us.cmu_time_awb.AlanVoiceDirectory");
        Voice voice = VoiceManager.getInstance().getVoice("kevin16");

        //print all voices
        Voice[] voicelist;
        voicelist = VoiceManager.getInstance().getVoices();

        System.out.println("\nChoose the process type\n"
                + "1)Register Product\n"
                + "2)Ship Product\n"
                + "3)Display Products\n"
                + "4)Search Occupied Slots\n"
                + "5)Search Product\n"
                + "6)Exit");

        if (voice != null) {
            voice.allocate();
            boolean status = voice.speak("Choose the process types given below the system"
                    + "Choose the number One for Register the Products"
                    + "Choose the Number Two  for Shipping the Products"
                    + "Choose the Number Three for Display the Products"
                    + "Choose the Number Four for Searching  Occupied Slots"
                    + "Choose the Number Five for Searching the  Products"
                    + "Choose the Number Six for Exit from the Program...");
        }

        System.out.print("\nEnter your choice in number : ");
        int choice = input.nextInt();
        switch (choice) {
            case 1:
                addProduct();
                break;
            case 2:
                shipProduct();
                break;
            case 3:
                displayProducts();
                break;
            case 4:
                searchSlots();
                break;
            case 5:
                searchProduct();
                break;
            case 6:
                exit();
                break;
            default:
                if (voice != null) {
                    voice.allocate();
                    boolean status = voice.speak("Hey...mate take care your hands ...be hear with me"
                            + "please Input the expression...given Beloww");
                }
                System.out.println("Enter a Valid Number, Please Try Again!!!");
                choice();
                break;
        }
    }

    @Override
    public void shipProduct() {
        System.setProperty("freetts.voices", "com.sun.speech.freetts.en.us.cmu_us_kal.KevinVoiceDirectory");
        Voice voice = VoiceManager.getInstance().getVoice("kevin16");

        Voice[] voicelist;

        if (voice != null) {
            voice.allocate();
            boolean status = voice.speak("Great you Choice Number Two");
        }
        System.out.println("Receiving Product...");
        input.nextLine();
        System.out.print("Enter the product name to ship : ");
        String prdName = input.nextLine();
        System.out.print("Enter the amount of product to ship : ");
        int qty = input.nextInt();

        //delete process (shipping process)
        voicelist = VoiceManager.getInstance().getVoices();
        DataSave dataSave = new DataSave();
        dataSave.readData();
        if (dataSave.p.isEmpty()) {
            System.out.println("\nElectrical Warehouse is empty!!!");
        } else {
            System.out.println("According to the developer, you hvae to download the official version from us");
            System.out.println("And you need to buy a productKey to complete these Options...");
            if (voice != null) {
                voice.allocate();
                boolean status = voice.speak("According to the developer, you hvae to download the official version from us"
                        + "And you need to buy a productKey to complete these Options... ");
            }
        }

        anotherProcess();
    }

    @Override
    public void displayProducts() {

        System.setProperty("freetts.voices", "com.sun.speech.freetts.en.us.cmu_us_kal.KevinVoiceDirectory");
        Voice voice = VoiceManager.getInstance().getVoice("kevin16");

        Voice[] voicelist;
        voicelist = VoiceManager.getInstance().getVoices();

        if (voice != null) {
            voice.allocate();
            boolean status = voice.speak("Great you Choice Number Three...");
        }

        DataSave dataSave = new DataSave();
        dataSave.readData();
        if (dataSave.p.isEmpty()) {
            System.out.println("\nElectrical Warehouse is empty!!!");
        } else {
            System.out.println();
            System.out.printf("%-15s %-20s %-10s %-10s %-10s", "Product ID", "Product Name",
                    "Quantity", "Rack", "Bay");
            System.out.println();
            System.out.println("===================================================================");
            dataSave.readData();
            Iterator itr = dataSave.p.iterator();
            while (itr.hasNext()) {
                Product pdr = (Product) itr.next();
                System.out.printf("%-15s %-20s %-10s %-10s %-10s", pdr.getProductID(), pdr.getProductName(),
                        pdr.getQuantity(), pdr.getRack(), pdr.getBay());
                System.out.println();
                if (voice != null) {
                    voice.allocate();
                    boolean status = voice.speak("DISPLAYING THE PRODUCTS" + " Product, Identity " + pdr.getProductID()
                            + "product, Name is" + pdr.getProductName()
                            + "Product, Qunatity are " + pdr.getQuantity()
                            + "Product, is in" + pdr.getRack() + "Rack, and" + pdr.getBay() + ",Bays");
                }
            }

        }
        anotherProcess();
    }

    @Override
    public void searchSlots() {
        System.setProperty("freetts.voices", "com.sun.speech.freetts.en.us.cmu_us_kal.KevinVoiceDirectory");
        Voice voice = VoiceManager.getInstance().getVoice("kevin16");

        Voice[] voicelist;
        voicelist = VoiceManager.getInstance().getVoices();

        if (voice != null) {
            voice.allocate();
            boolean status = voice.speak("Great you Choice Number Four...");
        }

        System.out.println("Occupied Slots");
        DataSave dataSave = new DataSave();

        dataSave.readData();
        if (dataSave.p.isEmpty()) {
            System.out.println("\nElectrical Warehouse is empty!!!");
        } else {
            System.out.println();
            System.out.printf("%-15s %-10s %-10s", "Product Name", "Rack", "Bay");
            System.out.println();
            System.out.println("===============================");

            Iterator itr = dataSave.p.iterator();
            while (itr.hasNext()) {
                Product pdr = (Product) itr.next();
                System.out.printf("%-15s %-10s %-10s", pdr.getProductName(),
                        pdr.getRack(), pdr.getBay());
                System.out.println();
                if (voice != null) {
                    voice.allocate();
                    boolean status = voice.speak("Displaying the slot " + pdr.getProductName() + pdr.getRack() + "Rack and" + pdr.getBay() + "Bay");
                }
            }
        }
        anotherProcess();
    }

    @Override
    public void searchProduct() {

        System.setProperty("freetts.voices", "com.sun.speech.freetts.en.us.cmu_us_kal.KevinVoiceDirectory");
        Voice voice = VoiceManager.getInstance().getVoice("kevin16");

        Voice[] voicelist;

        if (voice != null) {
            voice.allocate();
            boolean status = voice.speak("Great you Choice Number FIVE..");
        }
        input.nextLine();
        System.out.print("\nEnter the search product (Electrical) : ");
        String productElectrical = input.nextLine();

        //search process
        System.out.println("According to the developer, you hvae to download the official version from us");
        System.out.println("And you need to buy a productKey to complete these Options...");
        if (voice != null) {
            voice.allocate();
            boolean status = voice.speak("According to the developer, you hvae to download the official version from us"
                    + "And you need to buy a productKey to complete these Options... ");
        }

        anotherProcess();
    }

    @Override
    public void exit() {

        System.setProperty("freetts.voices", "com.sun.speech.freetts.en.us.cmu_us_kal.KevinVoiceDirectory");
        Voice voice = VoiceManager.getInstance().getVoice("kevin16");

        Voice[] voicelist;
        voicelist = VoiceManager.getInstance().getVoices();

        if (voice != null) {
            voice.allocate();
            boolean status = voice.speak("Very Nice I am So happy bro...");
        }

        System.out.println("\nExiting System...");

        System.out.println("Thank you for using Warehouse Products Allocation System");
        System.out.println("Have a good Day" + "\n Never meet a great day");
        if (voice != null) {
            voice.allocate();
            boolean status = voice.speak("Exiting from the System"
                    + "Thanks for using Warehouse Product Allocation System" + "Hvae a good day...." + "Never meet a great day..");
        }

        System.exit(0);
    }

    private void addAnother() {

        System.setProperty("freetts.voices", "com.sun.speech.freetts.en.us.cmu_us_kal.KevinVoiceDirectory");
//        System.setProperty("freetts.voices", "com.sun.speech.freetts.en.us.cmu_time_awb.AlanVoiceDirectory");
        Voice voice = VoiceManager.getInstance().getVoice("kevin16");

        //print all voices
        Voice[] voicelist;
        voicelist = VoiceManager.getInstance().getVoices();

        System.out.println("\nDo you want to add another: Yes(Y) or No(N)?");

        if (voice != null) {
            voice.allocate();
            boolean status = voice.speak("Do you want to do another process?"
                    + "please Input the expression...given Below");
        }

        input.nextLine();
        System.out.print("Enter your choice : ");
        choice = input.next();
        if (choice.equalsIgnoreCase("Y")) {
            addProduct();
        } else if (choice.equalsIgnoreCase("N")) {
            choice();
        } else {
            System.out.println("Please Enter a valid Character.");
            if (voice != null) {
                voice.allocate();
                boolean status = voice.speak("Take care your hands...guy "
                        + "please Input the expression...given Below..");
            }
            addAnother();
        }
    }

    private void anotherProcess() {

        System.setProperty("freetts.voices", "com.sun.speech.freetts.en.us.cmu_us_kal.KevinVoiceDirectory");
//        System.setProperty("freetts.voices", "com.sun.speech.freetts.en.us.cmu_time_awb.AlanVoiceDirectory");
        Voice voice = VoiceManager.getInstance().getVoice("kevin16");

        //print all voices
        Voice[] voicelist;
        voicelist = VoiceManager.getInstance().getVoices();

        System.out.println();
        System.out.println("Do you want to do another process : Yes(Y) or No(N)?");

        if (voice != null) {
            voice.allocate();
            boolean status = voice.speak("Do you want to do another process?"
                    + "please Input the expression..");
        }

        System.out.print("Enter your choice : ");
        choice = input.next();
        if (choice.equalsIgnoreCase("Y")) {
            choice();
        } else if (choice.equalsIgnoreCase("N")) {
            exit();
        } else {
            System.out.println("Please Enter a valid Character.");
            if (voice != null) {
                voice.allocate();
                boolean status = voice.speak("Watch your hands bro"
                        + "please Input the given expression..");
            }

            anotherProcess();
        }

    }
}
