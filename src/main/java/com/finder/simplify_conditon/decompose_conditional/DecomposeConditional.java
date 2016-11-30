package com.finder.simplify_conditon.decompose_conditional;

import java.util.Date;

/**
 * Created by longhuai.hlh on 2016/11/30.
 */
public class DecomposeConditional {
    private static final Date SUMMER_START = new Date();
    private static final Date SUMMER_END = new Date();
    private int winterRate;
    private int summerRate;

    public void calculate(Date date, int quantity){
        int charge;
        if(notSummer(date)){
            winterCharge(quantity);
        }else {
            summerCharge(quantity);
        }
    }

    private void summerCharge(int quantity) {
        int charge;
        charge = quantity * this.summerRate;
    }

    private void winterCharge(int quantity) {
        int charge;
        charge = quantity * this.winterRate;
    }

    private boolean notSummer(Date date) {
        return date.before(SUMMER_START) || date.after(SUMMER_END);
    }
}
