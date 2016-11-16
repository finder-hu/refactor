/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2016 All Rights Reserved/
 */
package com.finder.reorgnaize_method.inline_temp;

import com.finder.reorgnaize_method.extract_method.Order;

/**
 *
 * @author Finderhu
 * @version $Id: InlineTemp.java, V 0.1 2016-11-16 10:26 Finderhu Exp $
 */
public class InlineTemp {
    private Order order = new Order();

    public boolean inlineTemp(){
        return (order.getAmount() > 1000);
    }


    /**
     * Getter method for property <tt>order</tt>.
     *
     * @return property value of order
     */

    public Order getOrder() {
        return order;
    }

    /**
     * Setter method for property <tt>order</tt>.
     *
     * @param order value to be assigned to property order
     */
    public void setOrder(Order order) {
        this.order = order;
    }
}
