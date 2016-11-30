package com.finder.reorgnaize_data.replace_type_code_with_subclass;

/**
 * Created by longhuai.hlh on 2016/11/30.
 */
public class Employee {
    private int type;
    public static final int ENGINEER = 0;
    public static final int SALESMEN = 1;
    public static final int MANAGER = 2;

    public Employee() {
    }

    public Employee(int type) {
        this.type = type;
    }
}
