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
        if(date.before(SUMMER_START) || date.after(SUMMER_END)){
            charge = quantity * this.winterRate;
        }else {
            charge = quantity * this.summerRate;
        }
    }
}
