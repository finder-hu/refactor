/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2016 All Rights Reserved/
 */
package com.finder.reorgnaize_method.extract_method;

import java.util.Enumeration;
import java.util.Vector;

/**
 *
 * @author Finderhu
 * @version $Id: ExtractMethod.java, V 0.1 2016-11-16 9:51 Finderhu Exp $
 */
public class ExtractMethod {
    private Vector<Order> orders = new Vector<Order>();
    private String name;

    public void printOwing(){
        Enumeration e = this.orders.elements();
        Double outstanding = 0.0;

        printBanner();

        //caculate outstanding
        while(e.hasMoreElements()){
            Order each = (Order)e.nextElement();
            outstanding += each.getAmount();
        }
        //print details
        System.out.println("name:" + this.name);
        System.out.println("amount:" + outstanding);
    }

    private void printBanner() {
        //print banner
        System.out.println("*************************");
        System.out.println("***** Customer Owes *****");
        System.out.println("*************************");
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
