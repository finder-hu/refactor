package com.finder.simplify_conditon.remove_control_flag;

/**
 * Created by longhuai.hlh on 2016/12/1.
 */
public class Person {
    public void checkSercurity(String[] people){
        for(String person:people){
            if(person.equals("Don")){
                doSomeThing();
                break;
            }
            if(person.equals("John")){
                doSomeThing();
                break;
            }
        }
    }

    private void doSomeThing() {

    }
}
