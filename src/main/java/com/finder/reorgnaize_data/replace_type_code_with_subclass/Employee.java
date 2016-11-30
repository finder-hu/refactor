package com.finder.reorgnaize_data.replace_type_code_with_subclass;

/**
 * Created by longhuai.hlh on 2016/11/30.
 */
public abstract class Employee {
    private int type;
    public static final int ENGINEER = 0;
    public static final int SALESMEN = 1;
    public static final int MANAGER = 2;

    public Employee() {
    }

    private Employee(int type) {
        this.setType(type);
    }

    public static Employee createEmployee(int type) {
        switch (type){
            case ENGINEER:return new Engineer();
            case SALESMEN:return new Salesman();
            case MANAGER:return new Manager();
            default:
                throw new IllegalArgumentException();
        }
    }

    public abstract int getType();

    public void setType(int type) {
        this.type = type;
    }
}
