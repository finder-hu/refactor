package com.finder.reorgnaize_data;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by longhuai.hlh on 2016/11/24.
 */
public class BloodGroup {
    public static final BloodGroup O = new BloodGroup(0);
    public static final BloodGroup A = new BloodGroup(1);
    public static final BloodGroup B = new BloodGroup(2);
    public static final BloodGroup AB = new BloodGroup(3);
    private static final List<BloodGroup> bloodGroups;

    private int bloodCode;

    static {
        bloodGroups = new ArrayList<BloodGroup>() {{
            this.add(O);
            this.add(A);
            this.add(B);
            this.add(AB);
        }};
    }

    public static BloodGroup code(int arg){
        BloodGroup result = null;
        for(BloodGroup bloodGroup: bloodGroups){
            if(bloodGroup.getBloodCode() == arg){
                result = bloodGroup;
            }
        }
        return result;
    }

    public BloodGroup(int bloodCode) {
        this.bloodCode = bloodCode;
    }


    public int getBloodCode() {
        return bloodCode;
    }

    public void setBloodCode(int bloodCode) {
        this.bloodCode = bloodCode;
    }
}
