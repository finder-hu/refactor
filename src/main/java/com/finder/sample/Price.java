/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2016 All Rights Reserved/
 */
package com.finder.sample;

/**
 *
 * @author Finderhu
 * @version $Id: Price.java, V 0.1 2016-11-15 14:07 Finderhu Exp $
 */
public abstract class Price {
    abstract int getPriceCode();
    public abstract double getCharge(int dayRented);

    public  int getFrequentRenterPoints(int dayRented) {
        return 1;
    }
}
