import java.time.LocalDate;

public class Car {
    private int ID;
    private String brand;
    private String color;
    private LocalDate foundationYear;
    private String email;
    private int price;

    public Car(int ID, String brand, String color, LocalDate foundationYear, String email, int price) {
        this.ID = ID;
        this.brand = brand;
        this.color = color;
        this.foundationYear = foundationYear;
        this.email = email;
        this.price = price;


    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public LocalDate getFoundationYear() {
        return foundationYear;
    }

    public void setFoundationYear(LocalDate foundationYear) {
        this.foundationYear = foundationYear;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Car{" +
                "ID=" + ID +
                ", brand='" + brand + '\'' +
                ", color='" + color + '\'' +
                ", foundationYear=" + foundationYear +
                ", email='" + email + '\'' +
                ", price=" + price +
                '}';
    }


}
