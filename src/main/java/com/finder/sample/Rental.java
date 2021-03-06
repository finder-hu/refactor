/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2016 All Rights Reserved/
 */
package com.finder.sample;

/**
 *
 * @author Finderhu
 * @version $Id: Rental.java, V 0.1 2016-11-15 9:31 Finderhu Exp $
 */
public class Rental {
    private Movie movie;
    private int daysRented;

    public Rental(Movie movie, int daysRented) {
        this.movie = movie;
        this.daysRented = daysRented;
    }

    /**
     * Getter method for property <tt>movie</tt>.
     *
     * @return property value of movie
     */

    public Movie getMovie() {
        return movie;
    }

    /**
     * Setter method for property <tt>movie</tt>.
     *
     * @param movie value to be assigned to property movie
     */
    public void setMovie(Movie movie) {
        this.movie = movie;
    }

    /**
     * Getter method for property <tt>daysRented</tt>.
     *
     * @return property value of daysRented
     */

    public int getDaysRented() {
        return daysRented;
    }

    /**
     * Setter method for property <tt>daysRented</tt>.
     *
     * @param daysRented value to be assigned to property daysRented
     */
    public void setDaysRented(int daysRented) {
        this.daysRented = daysRented;
    }

    public double getCharge() {
        return movie.getCharge(daysRented);
    }

    public int getFrequentRenterPoints() {
        return movie.getFrequentRenterPoints(daysRented);
    }
}
