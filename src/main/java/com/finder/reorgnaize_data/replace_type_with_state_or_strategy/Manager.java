package com.finder.reorgnaize_data.replace_type_with_state_or_strategy;

/**
 * Created by longhuai.hlh on 2016/11/30.
 */
public class Manager extends EmployeeType {
    public int getTypeCode() {
        return EmployeeType.MANAGER;
    }

    @Override
    public int payAmount(Employee employee) {
        return employee.getMonthSalary() + employee.getBonus();
    }
}
