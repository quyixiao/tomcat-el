package com.test.el;

public class TestEL5 {

    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        for(int i = 0 ;i <=32 ;i ++){
            char curChar = (char)i;
            if((curChar <= 32 && (0x100002600L & (1L << curChar)) != 0L)){
                sb.append(i ).append(" ");
            }
        }
        System.out.println(sb);

    }
}
