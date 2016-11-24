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
        return arg >= this.getLow() && arg <= this.getHigh();
    }

    public void grow(int factor){
        this.setHigh(this.getHigh() * factor);
    }

    public int getLow() {
        return low;
    }

    public void setLow(int low) {
        this.low = low;
    }

    public int getHigh() {
        return high;
    }

    public void setHigh(int high) {
        this.high = high;
    }
}
