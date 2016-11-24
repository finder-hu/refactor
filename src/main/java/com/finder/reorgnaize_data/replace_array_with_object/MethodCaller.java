package com.finder.reorgnaize_data.replace_array_with_object;

/**
 * Created by longhuai.hlh on 2016/11/24.
 */
public class MethodCaller {

    public void caller(String[] row){
        row[0] = "Liverpool";
        row[1] = "15";
        String name = row[0];
        int wins = Integer.parseInt(row[1]);
    }
}
