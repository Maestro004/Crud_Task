import java.util.Scanner;

public interface CarInterface {

    void addCar(Scanner scanner);

    void getAllCar();
    void update(Scanner scanner,int ID);

    void delete(int ID);


}
