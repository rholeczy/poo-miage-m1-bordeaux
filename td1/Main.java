package fr.ubordeaux.miage.S7.poo.td1;

public class Main {
    public static void main(String[] args) {

        Customer romainH = new Customer("Holeczy", "Romain", "50 cours du général de Gaulle", "romain.holeczy@capgemini.com", "0661345502");
        Customer bastienF = new Customer("Foucaud", "Bastien", "2 rue Camille Dignac", "bastMail", "0646652920");
        Catalog catalogue = Catalog.getInstance();

        int MacBook = catalogue.addProduct("MacBookPro", 1599, 100);
        int Airpods = catalogue.addProduct("Airpods", 199, 150);
        int iPhone = catalogue.addProduct("iPhone 14", 1299, 500);

        Basket panierRH = new Basket(romainH);

        panierRH.addProduct(catalogue, MacBook, 1);
        panierRH.addProduct(catalogue, Airpods, 4);
    }
}