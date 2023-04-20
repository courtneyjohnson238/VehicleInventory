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

        cars[1] = Porsche;
        cars[2] = Tesla;
        cars[3] = BMW;
        cars[4] = RangeRover;
        cars[5] = AstonMartin;
        cars[6] = Mercedes;


        System.out.println("What do you want to do?");
        System.out.println(" 1 - Find vehicles that match make/mode");
        System.out.println(" 2 - Find vehicles that fall within a price range");
        System.out.println(" 3 - Find vehicles that match a color");
        System.out.println(" 4 - List all vehicles");
        System.out.println(" 5 - Add a vehicle");
        System.out.println(" 6 - Quit");
        System.out.println("Enter your command: ");

        int answer = userInput.nextInt();

        switch (answer){
            case 2:
                findVehicleByPrice();
        }
    }

}
