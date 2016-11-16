/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2016 All Rights Reserved/
 */
package com.finder.reorgnaize_method.extract_method;

/**
 *
 * @author Finderhu
 * @version $Id: Order.java, V 0.1 2016-11-16 9:54 Finderhu Exp $
 */
public class Order {
    private int amount;

    public Order(int amount) {
        this.amount = amount;
    }

    public Order() {
    }

    /**
     * Getter method for property <tt>amount</tt>.
     *
     * @return property value of amount
     */

    public int getAmount() {
        return amount;
    }

    /**
     * Setter method for property <tt>amount</tt>.
     *
     * @param amount value to be assigned to property amount
     */
    void setAmount(int amount) {
        this.amount = amount;
    }
}
