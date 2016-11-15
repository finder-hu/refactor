/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2016 All Rights Reserved/
 */
package com.finder.sample;

import java.util.Enumeration;
import java.util.Vector;

/**
 *
 * @author Finderhu
 * @version $Id: Customer.java, V 0.1 2016-11-15 9:33 Finderhu Exp $
 */
public class Customer {
    private String name;
//    private List<Rental> rentals = new ArrayList<Rental>();
    private Vector rentals = new Vector();
    public Customer(String name) {
        this.name = name;
    }

    public void addRental(Rental rental){
        this.rentals.add(rental);
    }

    public String statement(){
        Enumeration rentals = this.rentals.elements();
        String result = "Rental Record for " + getName() + "\n";
        while(rentals.hasMoreElements()){
            Rental each = (Rental) rentals.nextElement();
            //show figures for this rental
            result += "\t" + each.getMovie().getTitle() + "\t" + String.valueOf(each.getCharge()) + "\n";
        }
        //add footer lines
        result += "Amount owed is " + String.valueOf(getTotalCharge()) + "\n";
        result += "You earned " + String.valueOf(getTotalFrequentRenterPoints()) + "frequent renter points";
        return result;
    }

    public String htmlStatement() {
        Enumeration rentals = this.rentals.elements();
        String result = "<H1> Rantals for <EM>" + getName() + "<EM></H1><p>\n";
        while(rentals.hasMoreElements()){
            Rental eache = (Rental) rentals.nextElement();
            result += eache.getMovie().getTitle() + ": " + String.valueOf(eache.getCharge()) + " <BR>\n";
        }
        result += "<p>You owe <EM>" + String.valueOf(getTotalCharge()) + "<EM><P>\n";
        result += "On this rental you earned <EM>" + String.valueOf(getTotalFrequentRenterPoints()) +
                "</EM>Frequent ranter points<P>\n";
        return result;
    }

    private int getTotalFrequentRenterPoints(){
        int result = 0;
        Enumeration rentals = this.rentals.elements();
        while(rentals.hasMoreElements()){
            Rental each = (Rental)rentals.nextElement();
            result += each.getFrequentRenterPoints();
        }
        return result;
    }

    private double getTotalCharge(){
        double result = 0;
        Enumeration rentals = this.rentals.elements();
        while(rentals.hasMoreElements()){
            Rental each = (Rental) rentals.nextElement();
            result += each.getCharge();
        }
        return result;
    }

    /**
     * Getter method for property <tt>name</tt>.
     *
     * @return property value of name
     */

    public String getName() {
        return name;
    }

    /**
     * Setter method for property <tt>name</tt>.
     *
     * @param name value to be assigned to property name
     */
    public void setName(String name) {
        this.name = name;
    }
}
