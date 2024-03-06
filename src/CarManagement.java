import java.time.LocalDate;
import java.util.Scanner;

public class CarManagement implements CarInterface {
    private Car [] cars ;
    private int count;

    public CarManagement(int size) {
       cars = new Car[size];
       count = 0;

    }

    @Override
    public void addCar(Scanner scanner) {

        System.out.println("машинанын IDси");
        int id = scanner.nextInt();
        for (int i = 0; i < count; i++) {
            if (cars[i].getID()== id) {
                System.out.println("бундай ID бар");
                return;
            }
        }
        System.out.println("машинанын брентин жаз!");
        scanner.nextLine();
        String brand = scanner.nextLine();
        System.out.println("машинанын светин жаз");
        String color = scanner.nextLine();
        System.out.println("машинанын жылын жаз");
        LocalDate few = LocalDate.of(scanner.nextInt(),scanner.nextInt(),scanner.nextInt());
        System.out.println("машинанын Email жаз");
        scanner.nextLine();
        String email = scanner.nextLine();
        System.out.println("машинанын баасын жаз");
        int price = scanner.nextInt();

        Car car = new Car(id,brand,color,few,email,price);
        cars[count] = car;
        count++;
        System.out.println("машина иигилукту кошулду");

    }

    @Override
    public void getAllCar() {
        System.out.println("баары машиналар");
        for (int i = 0; i < count; i++) {
            System.out.println(cars[i]);




        }


    }

    @Override
    public void update(Scanner scanner, int ID) {
        for (int i = 0; i < count; i++) {
            if (cars[i].getID() == ID){
                System.out.println("машинанын брентин жаз!");
                scanner.nextLine();
                String brand = scanner.nextLine();
                System.out.println("машинанын светин жаз");
                String color = scanner.nextLine();
                System.out.println("машинанын жылын жаз");
                LocalDate few = LocalDate.of(scanner.nextInt(),scanner.nextInt(),scanner.nextInt());
                System.out.println("машинанын Email жаз");
                scanner.nextLine();
                String email = scanner.nextLine();
                System.out.println("машинанын баасын жаз");
                int price = scanner.nextInt();
                cars[i].setBrand(brand);
                cars[i].setColor(color);
                cars[i].setFoundationYear(few);
                cars[i].setEmail(email);
                cars[i].setPrice(price);
                System.out.println("жаныланды");
                return;
            }

        }
        System.out.println("бундай id машина табылган жок");


    }

    @Override
    public void delete(int ID) {
        for (int i = 0; i < count; i++) {
            if (cars[i].getID() == ID){
                for (int j = i; j < count -1; j++) {
                    cars [j] = cars[j+1];


                }
                count--;
                System.out.println("машина очурулду");
                return;
            }

        }
        System.out.println("бундай машына табылган жок");
    }
}
