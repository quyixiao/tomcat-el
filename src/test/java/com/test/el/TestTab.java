package com.test.el;

public class TestTab {

    public static void main(String[] args) {

        for(int i = 0 ;i <=32 ;i ++){
            char curChar = (char)i;
            if((0x100002600L & (1L << curChar)) != 0L){
                System.out.println(i);
            }
        }
    }
}
