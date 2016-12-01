package com.finder.simplify_conditon.remove_control_flag;

/**
 * Created by longhuai.hlh on 2016/12/1.
 */
public class Person {
    public void checkSercurity(String[] people){
        boolean found = false;
        for(String person:people){
            if(!found){
                if(person.equals("Don")){
                    doSomeThing();
                    found = true;
                }
                if(person.equals("John")){
                    doSomeThing();
                    found = true;
                }
            }
        }
    }

    private void doSomeThing() {

    }
}
