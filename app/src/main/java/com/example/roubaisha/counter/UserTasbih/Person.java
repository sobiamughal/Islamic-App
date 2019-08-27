package com.example.roubaisha.counter.UserTasbih;

import java.io.Serializable;

/**
 * Created by Usman on 30/10/2015.
 */
public class Person implements Serializable{
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    int id;
    String name;

    public void Person(int id, String name ){

        this.id = id;
        this.name = name;

    }
}
