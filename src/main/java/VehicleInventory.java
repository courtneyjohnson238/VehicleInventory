import java.util.Scanner;

public class VehicleInventory {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        Vehicle Porsche = new Vehicle(123456,"cayenne","red", 2000,25000);
        Vehicle Tesla = new Vehicle(789101, "ModelX", "pink", 30000,40000 );
        Vehicle BMW = new Vehicle(112131, "Series7", "white", 40000, 50000);
        Vehicle RangeRover = new Vehicle(151617,"range","black", 50000, 70000);
        Vehicle AstonMartin = new Vehicle(171819, "classic", "white", 6000, 100000);
        Vehicle Mercedes = new Vehicle(987432, "Benz", "black", 7000, 85000);

        Vehicle[] cars = new Vehicle[20];

        cars[0] = Porsche;
        cars[1] = Tesla;
        cars[2] = BMW;
        cars[3] = RangeRover;
        cars[4] = AstonMartin;
        cars[5] = Mercedes;

        boolean exit = false;
        while (!exit) {


        System.out.println("What do you want to do?");
        System.out.println(" 1 - Find vehicles that match make/mode");
        System.out.println(" 2 - Find vehicles that fall within a price range");
        System.out.println(" 3 - Find vehicles that match a color");
        System.out.println(" 4 - List all vehicles");
        System.out.println(" 5 - Add a vehicle");
        System.out.println(" 6 - Quit");
        System.out.println("Enter your command: ");

        int choice = userInput.nextInt();
        userInput.nextLine();

        switch(choice) {
            case 1:
                System.out.println("You choose option 1");
                break;

            case 2:
                System.out.println("You choose option 2");
                break;
            case 3:
                System.out.println("You choose option 3");
                break;
            case 4:
                System.out.println("You choose option 4");
                break;
            case 5:
                System.out.println("You choose option 5");
                break;
            case 6:
                System.out.println("Goodbye");
                exit = true;

                default:
                System.out.println("Invalid choice, try again");
                break;
        }
        }
    }

}
