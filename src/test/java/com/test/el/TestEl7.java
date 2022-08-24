package com.test.el;

public class TestEl7 {
    public static final String[] jjstrLiteralImages = {
            "", null, "\44\173", "\43\173", null, null, null, null, null, null, null, null,
            "\164\162\165\145", "\146\141\154\163\145", "\156\165\154\154", "\175", "\56", "\50", "\51",
            "\133", "\135", "\72", "\54", "\76", "\147\164", "\74", "\154\164", "\76\75",
            "\147\145", "\74\75", "\154\145", "\75\75", "\145\161", "\41\75", "\156\145", "\41",
            "\156\157\164", "\46\46", "\141\156\144", "\174\174", "\157\162", "\145\155\160\164\171",
            "\151\156\163\164\141\156\143\145\157\146", "\52", "\53", "\55", "\77", "\57", "\144\151\166", "\45", "\155\157\144", null,
            null, null, null, null, null,};


    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        for (String l : jjstrLiteralImages) {
            if (l != null) {
                sb.append(l).append("&emsp;&emsp;&emsp;&emsp;");
            }
        }
        System.out.println(sb);
    }

}
