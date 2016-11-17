/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2016 All Rights Reserved/
 */
package com.finder.move_feature_between_object.extract_class;

/**
 *
 * @author Finderhu
 * @version $Id: Person.java, V 0.1 2016-11-17 10:54 Finderhu Exp $
 */
public class Person {
    private String name;
    private String officeAreaCode;
    private String officeNumber;


    public String getTelephoneNumber(){
        return ("(" + officeAreaCode + ")" +officeNumber);
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

    /**
     * Getter method for property <tt>officeAreaCode</tt>.
     *
     * @return property value of officeAreaCode
     */

    public String getOfficeAreaCode() {
        return officeAreaCode;
    }

    /**
     * Setter method for property <tt>officeAreaCode</tt>.
     *
     * @param officeAreaCode value to be assigned to property officeAreaCode
     */
    public void setOfficeAreaCode(String officeAreaCode) {
        this.officeAreaCode = officeAreaCode;
    }

    /**
     * Getter method for property <tt>officeNumber</tt>.
     *
     * @return property value of officeNumber
     */

    public String getOfficeNumber() {
        return officeNumber;
    }

    /**
     * Setter method for property <tt>officeNumber</tt>.
     *
     * @param officeNumber value to be assigned to property officeNumber
     */
    public void setOfficeNumber(String officeNumber) {
        this.officeNumber = officeNumber;
    }
}
