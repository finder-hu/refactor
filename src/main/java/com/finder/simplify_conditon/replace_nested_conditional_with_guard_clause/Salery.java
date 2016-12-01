package com.finder.simplify_conditon.replace_nested_conditional_with_guard_clause;

/**
 * Created by longhuai.hlh on 2016/12/1.
 */
public class Salery {
    private boolean isDead;
    private boolean isSeperated;
    private boolean isRetired;

    public double getPayAmount(){
        double result;
        if(isDead){
            result = deadAmount();
        }
        else{
            if(isSeperated) {
                result = separatedAmount();
            }else {
                if(isRetired){
                    result = retiredAmount();
                }else {
                    result = mormalAmount();
                }
            }

        }
        return result;
    }

    private double mormalAmount() {
        return 0;
    }

    private double retiredAmount() {
        return 0;
    }

    private double separatedAmount() {
        return 0;
    }

    private double deadAmount() {
        return 0;
    }
}
