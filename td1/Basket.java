package fr.ubordeaux.miage.S7.poo.td1;

import java.util.HashMap;

public class Basket {

    private int id;
    private static int nextId = 0;
    private Customer user;
    private HashMap<Product, Integer> productsInBasket; // Products Selected + Quantity

    /**
     * Constructor of the object Basket.
     *
     * @param user : User who will be linked to the basket.
     */
    public Basket(Customer user) {
        this.id = nextId;
        nextId++;
        this.user = user;
        this.productsInBasket = new HashMap<Product, Integer>();
    }

    /**
     * Get the id of the Basket.
     *
     * @return id : Id of the Basket.
     */
    public int getId() {
        return this.id;
    }

    /**
     * Get the user linked to basket.
     *
     * @return user : User linked to basket.
     */
    public Customer getUser() {
        return user;
    }

    /**
     * Get the HashMap of the products that are in basket.
     *
     * @return productsDansPanier : HashMap of the products that are in basket.
     */
    public HashMap<Product, Integer> getProductsInBasket() {
        return productsInBasket;
    }

    /**
     * Add Product to the Basket
     *
     * @param catalog    : Original Catalog
     * @param productKey : Id of the Product
     * @param quantity   : Quantity of products
     */
    public void addProduct(Catalog catalog, int productKey, int quantity) {
        Product product = catalog.getProductById(productKey);
        if (quantity <= catalog.getQuantityById(productKey)) {
            this.productsInBasket.put(product, quantity);
            catalog.reduceProduct(product, quantity);
        } else {
            System.out.println("Ajout impossible au panier, le produit n'est plus disponible dans le catalogue.");
        }
    }

    /**
     * Information of the Object
     *
     * @return String : Information of the Object
     */
    @Override
    public String toString() {
        return "Basket{" +
                " id=" + id +
                ", user=" + user +
                ", productsInBasket=" + productsInBasket.toString() +
                '}';
    }
}
