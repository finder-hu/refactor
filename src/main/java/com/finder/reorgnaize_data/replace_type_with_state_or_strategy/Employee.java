package com.finder.reorgnaize_data.replace_type_with_state_or_strategy;

/**
 * Created by longhuai.hlh on 2016/11/30.
 */
public class Employee {
    private int type;
    private int monthSalary = 10;
    private int commission = 1;
    private int bonus = 20;

    public static final int ENGINEER = 0;
    public static final int SALESMAN = 1;
    public static final int MANAGER = 2;



    public Employee(int type) {
        this.type = type;
    }

    public int payAmount(){
        switch (this.type){
            case ENGINEER: return this.monthSalary;
            case SALESMAN: return this.monthSalary + this.commission;
            case MANAGER: return this.monthSalary + this.bonus;
            default: throw new RuntimeException("incorrect employee");
        }
    }
}
