package com.test.el;

public class ELTest8 {


    public static void main(String[] args) {
        long[] a1 = new long[]{0x200000000L, 0x2000000000L, 0x20000000L, 0x80000000L, 0x8000000L, 0x4000000000L, 0x1000000000000L,
                0x20100000000L, 0x2000L, 0x11000000L, 0x40000000000L, 0x44000000L, 0x4000000000000L, 0x1400004000L, 0x10000000000L,
                0x1000L, 0x8000000000L};
        char ac[] = new char[]{'!', '&', '<', '=', '>', 'a', 'd', 'e', 'f', 'g', 'i', 'l', 'm', 'n', 'o', 't', '|'};
        StringBuilder sb = new StringBuilder();
        for (char a : ac) {
            sb.append(a).append(" ");
        }

        long a2[] = new long[]{0x2000L, 0x1000000000000L, 0x20000000000L, 0x44000000000L, 0x4001000000000L, 0x1000L, 0x4000L};
        char ad[] = new char[]{'a', 'i', 'm', 'n', 'o', 'r', 'u'};
        StringBuilder sb2 = new StringBuilder();

        for (char b : ad) {
            sb2.append(b).append(" ");
        }


        StringBuilder sb3 = new StringBuilder();
        for (int i = 0; i < a1.length; i++) {
            for (int j = 0; j < ad.length; j++) {
                jjMoveStringLiteralDfa2_1(a1[i], a2[j], ac[i], ad[j], sb3);
            }
        }
        System.out.println(sb3);

    }


    private static int jjMoveStringLiteralDfa2_1(long old0, long active0, char c, char d, StringBuilder sb3) {
        if (((active0 &= old0)) == 0L) {
            return -2;//jjStartNfa_1(0, old0);
        }
        sb3.append(c).append(d).append(" ");
        return -1;
    }


}
