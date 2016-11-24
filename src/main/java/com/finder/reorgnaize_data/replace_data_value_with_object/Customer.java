package com.finder.reorgnaize_data.replace_data_value_with_object;

import java.util.Dictionary;
import java.util.Hashtable;

/**
 * Created by longhuai.hlh on 2016/11/24.
 */
public class Customer {
    private String name;
    private static Dictionary instance = new Hashtable();

    public static void loadCustomer(){
        new Customer("Lemon CAr Hire").store();
        new Customer("Associated Coffe Machine").store();
        new Customer("Bilston Gasworks").store();
    }
    private void store(){
        instance.put(this.getName(),this);
    }
    private Customer(String name) {
        this.name = name;
    }

    public static Customer getCustomerByName(String name) {
        return (Customer)instance.get(name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
