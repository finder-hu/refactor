/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2016 All Rights Reserved/
 */
package com.finder.sample;

/**
 *
 * @author Finderhu
 * @version $Id: Movie.java, V 0.1 2016-11-15 9:20 Finderhu Exp $
 */
public class Movie {
    public static final int CHILDRENS = 2;
    public static final int REGULAR = 0;
    public static final int NEW_RELEASE = 1;

    private String title;
    private int priceCode;

    public Movie(String title, int priceCode) {
        this.title = title;
        this.priceCode = priceCode;
    }


    public double getCharge(int dayRented) {
        double result = 0;
        switch (getPriceCode()){
            case Movie.REGULAR:
                result += 2;
                if( dayRented > 2){
                    result += (dayRented - 2) * 1.5;
                }
                break;
            case Movie.NEW_RELEASE:
                result += dayRented * 3;
                break;
            case Movie.CHILDRENS:
                result += 1.5;
                if(dayRented > 3){
                    result += (dayRented - 3) * 1.5;
                }
                break;
        }
        return result;
    }


    /**
     * Getter method for property <tt>title</tt>.
     *
     * @return property value of title
     */

    public String getTitle() {
        return title;
    }

    /**
     * Setter method for property <tt>title</tt>.
     *
     * @param title value to be assigned to property title
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * Getter method for property <tt>priceCode</tt>.
     *
     * @return property value of priceCode
     */

    public int getPriceCode() {
        return priceCode;
    }

    /**
     * Setter method for property <tt>priceCode</tt>.
     *
     * @param priceCode value to be assigned to property priceCode
     */
    public void setPriceCode(int priceCode) {
        this.priceCode = priceCode;
    }
}
