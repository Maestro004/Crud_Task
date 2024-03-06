import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        CarManagement carManagement = new CarManagement(10);
        while (true) {
            System.out.println("""
                    1. кошуу
                    2. баарын чыгару
                    3. жанылоо
                    4. очуруу
                    """);
            int number = scanner.nextInt();
            switch (number) {
                case 1:
                    carManagement.addCar(scanner);
                    break;
                case 2:
                    carManagement.getAllCar();
                    break;
                case 3:
                    System.out.println("озгорткон машинанын idсин жаз");
                    carManagement.update(scanner,scanner.nextInt());
                    break;
                case 4:
                    System.out.println("очуротургон машинанын idсин жаз");
                    carManagement.delete(scanner.nextInt());

                    break;
                default:


            }


        }
    }
}