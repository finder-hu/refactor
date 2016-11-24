package com.finder.reorgnaize_data;

/**
 * Created by longhuai.hlh on 2016/11/24.
 */
public class Person {
    public static final int O = BloodGroup.O.getBloodCode();
    public static final int A = BloodGroup.A.getBloodCode();
    public static final int B = BloodGroup.B.getBloodCode();
    public static final int AB = BloodGroup.AB.getBloodCode();

    private BloodGroup bloodGroup;

    public Person(int bloodGroup) {
        this.bloodGroup = BloodGroup.code(bloodGroup);
    }

    public Person(BloodGroup bloodGroup) {
        this.bloodGroup = bloodGroup;
    }

    private int getBloodGroupCode() {
        return bloodGroup.getBloodCode();
    }

    private void setBloodGroupCode(int bloodGroup) {
        this.bloodGroup = BloodGroup.code(bloodGroup);
    }

    public BloodGroup getBloodGroup() {
        return bloodGroup;
    }

    public void setBloodGroup(BloodGroup bloodGroup) {
        this.bloodGroup = bloodGroup;
    }
}
