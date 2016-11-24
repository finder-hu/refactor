package com.finder.reorgnaize_data.replace_array_with_object;

/**
 * Created by longhuai.hlh on 2016/11/24.
 */
public class MethodCaller {

    public void caller(Performence row){
        row.setName("Liverpool");
        row.setWins(15);
        String name = row.getName();
        int wins = row.getWins();
    }
}
