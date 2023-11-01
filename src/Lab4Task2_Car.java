
public class Lab4Task2_Car {
    String model;
    String brand;
    int year;
    double price;
    String color;
    int quantity;
    // Create Constructor
    public Lab4Task2_Car(String model, String brand, int year, double price, String color, int quantity) {
        this.model = model;
        this.brand = brand;
        this.year = year;
        this.price = price;
        this.color = color;
        this.quantity = quantity;
    }
    String getModel(){
        return model;}

    public void setModel(String model) {
        this.model = model;
    }

    String getBrand(){
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    int getYear(){
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    double getPrice(){
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    String getColor(){
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    int getQuantity(){
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    public void delivery(){
        quantity++;
    }
    public void sell(){
        if(quantity>0){
            quantity--;
        }
    }


    public String toString() {
        return "Car Information:\n" +
                "Model: " + model + "\n" +
                "Brand: " + brand + "\n" +
                "Year: " + year + "\n" +
                "Price: " + price + "\n" +
                "Color: " + color + "\n" +
                "Quantity: " + quantity+"\n";
    }
}
