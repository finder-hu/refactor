/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2016 All Rights Reserved/
 */
package com.finder.move_feature_between_object.intoduce_local_extension;

import java.util.Date;

/**
 *
 * @author Finderhu
 * @version $Id: MfDateSub.java, V 0.1 2016-11-17 13:08 Finderhu Exp $
 */
public class MfDateSub extends Date {
    public MfDateSub(long date) {
        super(date);
    }

    static Date nextDay(Date previousEnd){
        return new Date(previousEnd.getYear(),
                previousEnd.getMonth(),previousEnd.getDate()+1);
    }
}
