package com.company;


import java.io.Serializable;

/**
 * Created by Администратор on 19.06.16.
 */
public class TestSerial implements Serializable{
    private int version = 100;
    public int getVersion(){
        return version;
    }
     public String name = new String("Julia");
}

