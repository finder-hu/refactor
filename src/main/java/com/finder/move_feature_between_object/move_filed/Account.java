/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2016 All Rights Reserved/
 */
package com.finder.move_feature_between_object.move_filed;

import com.finder.move_feature_between_object.move_method.AccountType;

/**
 *
 * @author Finderhu
 * @version $Id: Account.java, V 0.1 2016-11-17 9:59 Finderhu Exp $
 */
public class Account {
    private AccountType type;

    public double interestForAmount_days(double amount, int days){
        return type.getInterestRate() * amount * days / 365;
    }

    /**
     * Getter method for property <tt>type</tt>.
     *
     * @return property value of type
     */

    public AccountType getType() {
        return type;
    }

    /**
     * Setter method for property <tt>type</tt>.
     *
     * @param type value to be assigned to property type
     */
    public void setType(AccountType type) {
        this.type = type;
    }
}
