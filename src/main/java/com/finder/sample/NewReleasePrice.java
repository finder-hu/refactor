/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2016 All Rights Reserved/
 */
package com.finder.sample;

/**
 *
 * @author Finderhu
 * @version $Id: NewReleasePrice.java, V 0.1 2016-11-15 14:08 Finderhu Exp $
 */
public class NewReleasePrice extends Price {
    int getPriceCode() {
        return Movie.NEW_RELEASE;
    }

    @Override
    public int getFrequentRenterPoints(int dayRented) {
        if(dayRented > 1){
            return 2;
        }else{
            return super.getFrequentRenterPoints(dayRented);
        }
    }

    @Override
    public double getCharge(int dayRented) {
        return dayRented * 3;
    }
}
