package com.company;

import java.io.Serializable;

/**
 * Created by acain on 7/28/2016.
 */
public class TestObject implements Serializable {
    int value;
    String id;
    public TestObject(int v, String s ){
        this.value=v;
        this.id=s;
    }
}
