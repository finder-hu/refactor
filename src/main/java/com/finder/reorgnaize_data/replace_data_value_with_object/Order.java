package com.finder.reorgnaize_data.replace_data_value_with_object;

import com.finder.sample.Customer;

/**
 * Created by longhuai.hlh on 2016/11/24.
 */
public class Order {
//    private String customer;
    private Customer customer;

    public Order(String customerName) {

        this.customer = new Customer(customerName);
    }

    public String getCustomerName() {
        return customer.getName();
    }

    public void setCustomer(String customerName) {
        this.customer.setName(customerName);
    }
}
