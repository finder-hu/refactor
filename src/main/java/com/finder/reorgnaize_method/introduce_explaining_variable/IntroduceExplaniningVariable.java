/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2016 All Rights Reserved/
 */
package com.finder.reorgnaize_method.introduce_explaining_variable;

import java.util.Map;

/**
 *
 * @author Finderhu
 * @version $Id: IntroduceExplaniningVariable.java, V 0.1 2016-11-16 11:32 Finderhu Exp $
 */
public class IntroduceExplaniningVariable {
    private double quantity;
    private double itemPrice;

    private double price(){
        return this.quantity * this.itemPrice
                - Math.max(0,this.quantity - 500) * this.itemPrice * 0.05
                + Math.min(this.quantity * this.itemPrice * 0.1, 100.0);
    }

    /**
     * Getter method for property <tt>quantity</tt>.
     *
     * @return property value of quantity
     */

    public double getQuantity() {
        return quantity;
    }

    /**
     * Setter method for property <tt>quantity</tt>.
     *
     * @param quantity value to be assigned to property quantity
     */
    public void setQuantity(double quantity) {
        this.quantity = quantity;
    }

    /**
     * Getter method for property <tt>itemPrice</tt>.
     *
     * @return property value of itemPrice
     */

    public double getItemPrice() {
        return itemPrice;
    }

    /**
     * Setter method for property <tt>itemPrice</tt>.
     *
     * @param itemPrice value to be assigned to property itemPrice
     */
    public void setItemPrice(double itemPrice) {
        this.itemPrice = itemPrice;
    }
}
