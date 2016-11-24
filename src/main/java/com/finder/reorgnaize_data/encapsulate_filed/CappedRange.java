package com.finder.reorgnaize_data.encapsulate_filed;

/**
 * Created by longhuai.hlh on 2016/11/24.
 */
public class CappedRange extends IntRange {
    private int cap;

    public CappedRange(int low, int high, int cap) {
        super(low, high);
        this.cap = cap;
    }

    public void setCap(int cap) {
        this.cap = cap;
    }

    public int getCap() {
        return cap;
    }

    @Override
    public int getHigh() {
        return Math.min(super.getHigh(), this.cap);
    }
}
