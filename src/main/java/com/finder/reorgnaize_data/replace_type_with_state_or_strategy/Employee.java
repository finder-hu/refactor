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
        return this.employeeType.payAmount(this);
    }
    public int getType() {
        return employeeType.getTypeCode();
    }

    public void setType(int type) {
        this.employeeType = EmployeeType.newType(type);
    }

    public int getMonthSalary() {
        return monthSalary;
    }

    public void setMonthSalary(int monthSalary) {
        this.monthSalary = monthSalary;
    }

    public int getCommission() {
        return commission;
    }

    public void setCommission(int commission) {
        this.commission = commission;
    }

    public int getBonus() {
        return bonus;
    }

    public void setBonus(int bonus) {
        this.bonus = bonus;
    }
}
