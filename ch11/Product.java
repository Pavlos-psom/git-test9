package gr.aueb.cf.cf9.ch11;

public class Product {
    private long id;
    private String name;
    private  String descreption;
    private double price;
    private  int quantity;
    private boolean stock;

    public Product(long id, String name, String descreption, double price, int quantity, boolean stock) {
        this.id = id;
        this.name = name;
        this.descreption = descreption;
        this.price = price;
        this.quantity = quantity;
        this.stock = stock;
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDescreption() {
        return descreption;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    public boolean isStock() {
        return stock;
    }

    public void setStock(boolean stock) {
        this.stock = stock;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setDescreption(String descreption) {
        this.descreption = descreption;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(long id) {
        this.id = id;
    }
}
