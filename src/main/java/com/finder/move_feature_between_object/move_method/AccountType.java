/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2016 All Rights Reserved/
 */
package com.finder.move_feature_between_object.move_method;

/**
 *
 * @author Finderhu
 * @version $Id: AccountType.java, V 0.1 2016-11-17 10:02 Finderhu Exp $
 */
public class AccountType {
    public boolean isPremium(){
        return true;
    }

    public double overdraftCharge(int dayOverdraw){
        if(isPremium()){
            double result = 10;
            if(dayOverdraw > 7){
                result += (dayOverdraw - 7) * 0.85;
            }
            return result;
        }else {
            return dayOverdraw * 1.75;
        }
    }
}
