/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2016 All Rights Reserved/
 */
package com.finder.move_feature_between_object.hide_delegate.person;

/**
 *
 * @author Finderhu
 * @version $Id: Department.java, V 0.1 2016-11-17 11:41 Finderhu Exp $
 */
public class Department {
    private String chargeCode;
    private Person manager;

    /**
     * Getter method for property <tt>chargeCode</tt>.
     *
     * @return property value of chargeCode
     */

    public String getChargeCode() {
        return chargeCode;
    }

    /**
     * Setter method for property <tt>chargeCode</tt>.
     *
     * @param chargeCode value to be assigned to property chargeCode
     */
    public void setChargeCode(String chargeCode) {
        this.chargeCode = chargeCode;
    }

    /**
     * Getter method for property <tt>manager</tt>.
     *
     * @return property value of manager
     */

    public Person getManager() {
        return manager;
    }

    /**
     * Setter method for property <tt>manager</tt>.
     *
     * @param manager value to be assigned to property manager
     */
    public void setManager(Person manager) {
        this.manager = manager;
    }
}
