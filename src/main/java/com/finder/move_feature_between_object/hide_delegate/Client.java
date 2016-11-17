/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2016 All Rights Reserved/
 */
package com.finder.move_feature_between_object.hide_delegate;

import com.finder.move_feature_between_object.hide_delegate.person.Person;

/**
 *
 * @author Finderhu
 * @version $Id: Client.java, V 0.1 2016-11-17 11:40 Finderhu Exp $
 */
public class Client {
    private Person person;

    public void someWork(){
        Person manager = person.getManager();
    }
}

