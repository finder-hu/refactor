/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2016 All Rights Reserved/
 */
package com.finder.reorgnaize_method.split_temporary_variable;

/**
 *
 * @author Finderhu
 * @version $Id: SplitTemporaryVariable.java, V 0.1 2016-11-16 11:56 Finderhu Exp $
 */
public class SplitTemporaryVariable {
    private double primaryForce;
    private double mass;
    private int delay;
    private double secondaryForce;

    public double getDistanceTravelled(int time){
        double result;
        final double acc = this.primaryForce/this.mass;
        int primaryTime = Math.min(time,this.delay);
        result = 0.5 * acc * primaryTime * primaryTime;
        int secondTime = time - this.delay;
        if(secondTime > 0){
            double primaryVel = acc * this.delay;
            final double secondaryAcc = (this.primaryForce + this.secondaryForce)/this.mass;
            result += primaryVel * secondTime + 0.5 * secondaryAcc * secondTime * secondTime;
        }
        return result;
    }

    /**
     * Getter method for property <tt>primaryForce</tt>.
     *
     * @return property value of primaryForce
     */

    public double getPrimaryForce() {
        return primaryForce;
    }

    /**
     * Setter method for property <tt>primaryForce</tt>.
     *
     * @param primaryForce value to be assigned to property primaryForce
     */
    public void setPrimaryForce(double primaryForce) {
        this.primaryForce = primaryForce;
    }

    /**
     * Getter method for property <tt>mass</tt>.
     *
     * @return property value of mass
     */

    public double getMass() {
        return mass;
    }

    /**
     * Setter method for property <tt>mass</tt>.
     *
     * @param mass value to be assigned to property mass
     */
    public void setMass(double mass) {
        this.mass = mass;
    }
}
