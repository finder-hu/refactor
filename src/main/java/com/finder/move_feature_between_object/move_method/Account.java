/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2016 All Rights Reserved/
 */
package com.finder.move_feature_between_object.move_method;

/**
 *
 * @author Finderhu
 * @version $Id: Account.java, V 0.1 2016-11-17 9:55 Finderhu Exp $
 */
public class Account {
    private int daysOverdraw;
    private AccountType type;

    double bankCharge(){
        double result = 4.5;
        if( daysOverdraw > 0){
            result += type.overdraftCharge(daysOverdraw);
        }
        return result;
    }

    /**
     * Getter method for property <tt>daysOverdraw</tt>.
     *
     * @return property value of daysOverdraw
     */

    public int getDaysOverdraw() {
        return daysOverdraw;
    }

    /**
     * Setter method for property <tt>daysOverdraw</tt>.
     *
     * @param daysOverdraw value to be assigned to property daysOverdraw
     */
    public void setDaysOverdraw(int daysOverdraw) {
        this.daysOverdraw = daysOverdraw;
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
