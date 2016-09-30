package com.example.yang.uibestpractice;

import android.content.Context;

/**
 * Created by Yang on 2016/9/29.
 */
public class Msg {
    public static final int TYPE_RECIEVED = 0;
    public static final int TYPE_SEND = 1;
    private String content;
    private int type;
    Msg(String content,int type){
        this.content = content;
        this.type = type;
    }
    public String getContent(){
        return content;
    }
    public int getType(){
        return type;
    }
}
