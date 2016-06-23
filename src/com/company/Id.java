package com.company;

/**
 * Created by Администратор on 18.06.16.
 */
public class Id {
    private  int id=1;

    private int upOne(){
        return ++id;
    }

    public void  showId(){
        System.out.println(upOne());
    }
}
