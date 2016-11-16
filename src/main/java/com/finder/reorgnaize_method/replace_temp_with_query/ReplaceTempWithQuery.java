/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2016 All Rights Reserved/
 */
package com.finder.reorgnaize_method.replace_temp_with_query;

/**
 *
 * @author Finderhu
 * @version $Id: ReplaceTempWithQuery.java, V 0.1 2016-11-16 10:56 Finderhu Exp $
 */
public class ReplaceTempWithQuery {
    private int itemPrice = 12;
    private int quantity = 3;
    
    private double getPrice(){
        return basePrice() * getDiscountFactor();
    }

    private double getDiscountFactor() {
        final double discountFactor;
        if(basePrice() > 1000){
            discountFactor = 0.95;
        }else {
            discountFactor = 0.98;
        }
        return discountFactor;
    }

    private int basePrice() {
        return this.quantity * this.itemPrice;
    }
}
