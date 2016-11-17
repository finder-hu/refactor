/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2016 All Rights Reserved/
 */
package com.finder.move_feature_between_object.inline_class;

import com.finder.move_feature_between_object.extract_class.TelephoneNumber;

/**
 *
 * @author Finderhu
 * @version $Id: Person.java, V 0.1 2016-11-17 10:54 Finderhu Exp $
 */
public class Person {
    private String name;
    private TelephoneNumber telephoneNumber = new TelephoneNumber();

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
