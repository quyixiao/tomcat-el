package com.test.el;

public class TestCC {
    public static void main(String[] args) {
        jjCheckNAddStates(0,4);
    }

    private static void jjCheckNAddStates(int start, int end) {
        do {
            System.out.println(start);
        } while (start++ != end);
    }
}
