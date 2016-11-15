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
    Price price;

    public Movie(String title, int priceCode) {
        this.title = title;
        this.setPriceCode(priceCode);
    }

    public double getCharge(int dayRented){
        return this.price.getCharge(dayRented);
    }

    public int getFrequentRenterPoints(int daysRented){
        return this.price.getFrequentRenterPoints(daysRented);
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
        return this.price.getPriceCode();
    }

    /**
     * Setter method for property <tt>priceCode</tt>.
     *
     * @param priceCode value to be assigned to property priceCode
     */
    public void setPriceCode(int priceCode) {
        switch(priceCode){
            case REGULAR: this.price = new RegularPrice(); break;
            case CHILDRENS: this.price = new ChildrenPrice(); break;
            case NEW_RELEASE: this.price = new NewReleasePrice(); break;
            default: throw new IllegalArgumentException("Incorrect Price Code");
        }
    }

}
