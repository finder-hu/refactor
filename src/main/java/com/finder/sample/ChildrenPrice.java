/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2016 All Rights Reserved/
 */
package com.finder.sample;

/**
 *
 * @author Finderhu
 * @version $Id: ChildrenPrice.java, V 0.1 2016-11-15 14:08 Finderhu Exp $
 */
public class ChildrenPrice extends Price {
    int getPriceCode() {
        return Movie.CHILDRENS;
    }

    @Override
    public double getCharge(int dayRented) {
        double result = 1.5;
        if(dayRented > 3){
            result += (dayRented - 3) * 1.5;
        }
        return result;
    }
}
