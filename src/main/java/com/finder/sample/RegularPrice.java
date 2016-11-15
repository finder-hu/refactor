/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2016 All Rights Reserved/
 */
package com.finder.sample;

/**
 *
 * @author Finderhu
 * @version $Id: RegularPrice.java, V 0.1 2016-11-15 14:09 Finderhu Exp $
 */
public class RegularPrice extends Price {
    int getPriceCode() {
        return Movie.REGULAR;
    }

    @Override
    public double getCharge(int dayRented) {
        double result = 2;
        if( dayRented > 2){
            result += (dayRented - 2) * 1.5;
        }
        return result;
    }
}
