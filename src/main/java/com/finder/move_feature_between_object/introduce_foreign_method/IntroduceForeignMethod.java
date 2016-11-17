/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2016 All Rights Reserved/
 */
package com.finder.move_feature_between_object.introduce_foreign_method;

import java.util.Date;

/**
 *
 * @author Finderhu
 * @version $Id: IntroduceForeignMethod.java, V 0.1 2016-11-17 12:02 Finderhu Exp $
 */
public class IntroduceForeignMethod {
    public void refactor(){
        Date previousEnd = new Date();
        Date newStart = nextDay(previousEnd);
    }

    private Date nextDay(Date previousEnd){
        return new Date(previousEnd.getYear(),
                previousEnd.getMonth(),previousEnd.getDate()+1);
    }
}
