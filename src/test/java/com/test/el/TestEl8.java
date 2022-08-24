package com.test.el;

public class TestEl8 {

    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        for(int i = 0 ;i < 64 ;i ++){
            char curChar = (char)i;
            long l = 1L << curChar;
            if ((0xffffffe7ffffffffL & l) != 0L) {

            }else{
                sb.append(curChar).append(" ");
            }
        }
        System.out.println(sb.toString());
    }
}
