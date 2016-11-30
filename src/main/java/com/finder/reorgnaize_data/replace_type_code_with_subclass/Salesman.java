package com.finder.reorgnaize_data.replace_type_code_with_subclass;

/**
 * Created by longhuai.hlh on 2016/11/30.
 */
public class Salesman extends Employee{

    @Override
    public int getType() {
        return Employee.SALESMEN;
    }
}
