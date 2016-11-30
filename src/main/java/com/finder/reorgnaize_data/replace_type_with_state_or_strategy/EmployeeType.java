package com.finder.reorgnaize_data.replace_type_with_state_or_strategy;

/**
 * Created by longhuai.hlh on 2016/11/30.
 */
public abstract class EmployeeType {
    public static final int ENGINEER = 0;
    public static final int SALESMAN = 1;
    public static final int MANAGER = 2;
    private static int type;

    public abstract int getTypeCode();

    static EmployeeType newType(int type){
        switch (type){
            case ENGINEER: return new Engineer();
            case SALESMAN: return new Salesman();
            case MANAGER: return new Manager();
            default: throw new IllegalArgumentException("Incorrect Employee code");
        }
    }
}
