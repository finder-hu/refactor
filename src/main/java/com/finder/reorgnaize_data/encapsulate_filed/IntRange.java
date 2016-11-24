package com.finder.reorgnaize_data.encapsulate_filed;

/**
 * Created by longhuai.hlh on 2016/11/24.
 */
public class IntRange {
    private int low;
    private int high;

    public IntRange(int low, int high) {
        this.low = low;
        this.high = high;
    }

    public boolean includes(int arg){
        return arg >= this.low && arg <= this.high;
    }

    public void grow(int factor){
        this.high = this.high * factor;
    }

}
