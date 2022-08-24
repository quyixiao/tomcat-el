package com.test.el;

public class TestEL9 {

    static final int[] jjnextStates = {
            0, 1, 3, 4, 2, 0, 1, 4, 2, 0, 1, 4, 5, 2, 0, 1,
            2, 6, 16, 17, 18, 23, 24, 11, 12, 14, 6, 7, 9, 3, 4, 21,
            22, 25, 26,
    };

    public static void main(String[] args) {
        for(int i =  0 ;i < jjnextStates.length ; i ++){
            System.out.println(i + " = " + jjnextStates[i]);
        }

    }
}
