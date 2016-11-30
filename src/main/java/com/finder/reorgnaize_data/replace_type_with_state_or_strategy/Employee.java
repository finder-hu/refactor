package com.finder.reorgnaize_data.replace_type_with_state_or_strategy;

/**
 * Created by longhuai.hlh on 2016/11/30.
 */
public class Employee {
    private EmployeeType employeeType;
    private int monthSalary = 10;
    private int commission = 1;
    private int bonus = 20;


    public Employee(int type) {
        this.setType(type);
    }

    public int payAmount(){
        switch (this.getType()){
            case EmployeeType.ENGINEER: return this.monthSalary;
            case EmployeeType.SALESMAN: return this.monthSalary + this.commission;
            case EmployeeType.MANAGER: return this.monthSalary + this.bonus;
            default: throw new RuntimeException("incorrect employee");
        }
    }

    public int getType() {
        return employeeType.getTypeCode();
    }

    public void setType(int type) {
        this.employeeType = EmployeeType.newType(type);
    }
}
