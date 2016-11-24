package com.finder.reorgnaize_data.replace_data_value_with_object;

import java.util.Collection;
import java.util.Iterator;

/**
 * Created by longhuai.hlh on 2016/11/24.
 */
public class OrderCaller {
    private static int numberOfOrdersFor(Collection orders, String customer){
        int result = 0;
        Iterator iter = orders.iterator();
        while(iter.hasNext()){
            Order order = (Order)iter.next();
            if(order.getCustomerName().equals(customer)){
                result++;
            }
        }
        return result;
    }
}
