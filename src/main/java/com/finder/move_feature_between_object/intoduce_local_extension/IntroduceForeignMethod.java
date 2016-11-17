/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2016 All Rights Reserved/
 */
package com.finder.move_feature_between_object.intoduce_local_extension;

import java.util.Date;

/**
 *
 * @author Finderhu
 * @version $Id: IntroduceForeignMethod.java, V 0.1 2016-11-17 12:02 Finderhu Exp $
 */
public class IntroduceForeignMethod {
    public void refactor(){
        Date previousEnd = new Date();
        Date newStart = MfDateSub.nextDay(previousEnd);
    }
}
