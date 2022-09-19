package fr.ubordeaux.miage.S7.poo.td1;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Customer {

    private int id;
    private static int nextId = 0;
    private String name;
    private String surname;
    private String address;
    private String email;
    private String phone;

    Pattern p = Pattern.compile(".+@.+\\.[a-z]+");

    /**
     * Constructor of Customer.
     *
     * @param name    : Name of Customer
     * @param surname : Surname of Customer
     * @param address : Address of Customer
     * @param email   : Email of Customer
     * @param phone   : Phone of Customer
     */
    public Customer(String name, String surname, String address, String email, String phone) {
        Matcher m = p.matcher(email);
        if (m.matches()) {
            this.id = nextId;
            nextId++;
            this.name = name;
            this.surname = surname;
            this.address = address;
            this.email = email;
            this.phone = phone;
        } else {
            System.out.println("Mail non conforme (" + name + " " + surname + ") : xxx@xxx.xxx");
        }
    }

    /**
     * Get the name of the Customer
     *
     * @return name : Name of Customer
     */
    public String getName() {
        return name;
    }

    /**
     * Get the surname of the Customer
     *
     * @return surname : Surname of the customer.
     */
    public String getSurname() {
        return surname;
    }

    /**
     * Get the address of the Customer
     *
     * @return address : Address of the Customer
     */
    public String getAddress() {
        return address;
    }

    /**
     * Get the EMail of the Customer
     *
     * @return email : Email of the Customer
     */
    public String getEmail() {
        return email;
    }

    /**
     * Get the phone number of the Customer
     *
     * @return phone : Phone Number of the Customer
     */
    public String getPhone() {
        return phone;
    }

    /**
     * Information of the Object
     *
     * @return String : Information of the Object
     */
    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", address='" + address + '\'' +
                ", email='" + email + '\'' +
                ", phone='" + phone + '\'' +
                '}';
    }
}
