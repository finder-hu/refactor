/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2016 All Rights Reserved/
 */
package com.finder.move_feature_between_object.remove_middle_man;

import com.finder.move_feature_between_object.remove_middle_man.person.Person;

/**
 *
 * @author Finderhu
 * @version $Id: Client.java, V 0.1 2016-11-17 11:40 Finderhu Exp $
 */
public class Client {
    private Person person;

    public void someWork(){
        Person manager = person.getDepartment().getManager();
    }
}

