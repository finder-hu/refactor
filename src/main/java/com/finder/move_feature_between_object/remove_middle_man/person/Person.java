/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2016 All Rights Reserved/
 */
package com.finder.move_feature_between_object.remove_middle_man.person;

/**
 *
 * @author Finderhu
 * @version $Id: Person.java, V 0.1 2016-11-17 11:40 Finderhu Exp $
 */
public class Person {
    private Department department;

    /**
     * Getter method for property <tt>department</tt>.
     *
     * @return property value of department
     */

    public Department getDepartment() {
        return department;
    }

    /**
     * Setter method for property <tt>department</tt>.
     *
     * @param department value to be assigned to property department
     */
    public void setDepartment(Department department) {
        this.department = department;
    }
}
