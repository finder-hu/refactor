/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2016 All Rights Reserved/
 */
package com.finder.extract_method;

/**
 *
 * @author Finderhu
 * @version $Id: BeforeExtractMethod.java, V 0.1 2016-11-11 22:20 Finderhu Exp $
 */
public class BeforeExtractMethod {
    private String _name;

    public void pringOwing(double amount){
        printBanner();
        System.out.println("name" + _name);
        System.out.println("amount" + amount);
    }
    private void printBanner(){

    }

    /**
     * Getter method for property <tt>_name</tt>.
     *
     * @return property value of _name
     */

    public String get_name() {
        return _name;
    }

    /**
     * Setter method for property <tt>_name</tt>.
     *
     * @param _name value to be assigned to property _name
     */
    public void set_name(String _name) {
        this._name = _name;
    }
}
