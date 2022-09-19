package fr.ubordeaux.miage.S7.poo.td1;

public class Product {

    private int id;
    private static int nextId = 0;
    private String name;
    private double price;

    /**
     * Constructor of class Product
     *
     * @param name  : Name of the product
     * @param price : Price of the product
     */
    public Product(String name, double price) {
        this.id = nextId;
        nextId++;
        this.name = name;
        this.price = price;
    }

    /**
     * Get the Id of the Product
     *
     * @return id : Id of Product
     */
    public int getId() {
        return this.id;
    }

    /**
     * Get the name of the product
     *
     * @return name : Name of the Product
     */
    public String getName() {
        return name;
    }

    /**
     * Get the price of the product
     *
     * @return price : Price of the product
     */
    public double getPrice() {
        return price;
    }

    /**
     * Information of the Object
     *
     * @return String : Information of the Object
     */
    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
