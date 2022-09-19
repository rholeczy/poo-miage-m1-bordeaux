package fr.ubordeaux.miage.S7.poo.td1;

import java.util.HashMap;

public class Catalog {

    private static Catalog instance = new Catalog();

    private HashMap<Product, Integer> productsInCatalog;

    /**
     * Instance for Catalog
     *
     * @return instance : Instance of Catalog
     */
    public static Catalog getInstance() {
        return instance;
    }

    /**
     * Constructor of Catalog
     */
    private Catalog() {
        this.productsInCatalog = new HashMap<Product, Integer>();
    }

    /**
     * Get the HashMap of Produits that are in Catalog
     *
     * @return productsInCatalog : Products in Catalog
     */
    public HashMap<Product, Integer> getProductsInCatalog() {
        return this.productsInCatalog;
    }

    /**
     * Function that allows you to create a product and add it to the catalog.
     *
     * @param name     : name of the product
     * @param price    : price of the product
     * @param quantity : number of products that will be in the catalog
     * @return idProduct : Returns the id of the product that has just been created
     */
    public int addProduct(String name, double price, int quantity) {
        Product newProduct = new Product(name, price);
        this.productsInCatalog.put(newProduct, quantity);
        return newProduct.getId();
    }

    /**
     * Get the object Product with its key.
     *
     * @param key : Key of the Object Product
     * @return productKey : The product
     */
    public Product getProductById(int key) {
        for (Product productKey : this.productsInCatalog.keySet()) {
            if (productKey.getId() == key)
                return productKey;
        }
        return null;
    }

    /**
     * Get the quantity with its Product Key
     *
     * @param key : Key of the Object Product
     * @return quantity : Quantity of Products available in Catalog
     */
    public int getQuantityById(int key) {
        for (Product productKey : this.productsInCatalog.keySet()) {
            if (productKey.getId() == key)
                return this.productsInCatalog.get(productKey);
        }
        return -1;
    }

    /**
     * Reduce the number of product in Catalog with the quantity of product selected
     *
     * @param product  : Object Product
     * @param quantity : Quantity of products
     */
    public void reduceProduct(Product product, int quantity) {
        int newQuantity = this.productsInCatalog.get(product) - quantity;
        this.productsInCatalog.put(product, newQuantity);
    }

    /**
     * Information of the Object
     *
     * @return String : Information of the Object
     */
    @Override
    public String toString() {
        return "Catalog{" +
                "productsInCatalog=" + productsInCatalog +
                '}';
    }


}
