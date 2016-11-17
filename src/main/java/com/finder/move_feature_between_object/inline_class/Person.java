/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2016 All Rights Reserved/
 */
package com.finder.move_feature_between_object.inline_class;

/**
 *
 * @author Finderhu
 * @version $Id: Person.java, V 0.1 2016-11-17 10:54 Finderhu Exp $
 */
public class Person {
    private String name;
    private String areaCode;
    private String officeNumber;

    public String getTelephoneNumber(){
        return ("(" + getAreaCode() + ")" + getOfficeNumber());
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

    /**
     * Getter method for property <tt>areaCode</tt>.
     *
     * @return property value of areaCode
     */

    public String getAreaCode() {
        return areaCode;
    }

    /**
     * Setter method for property <tt>areaCode</tt>.
     *
     * @param areaCode value to be assigned to property areaCode
     */
    public void setAreaCode(String areaCode) {
        this.areaCode = areaCode;
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
