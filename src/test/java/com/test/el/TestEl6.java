package com.test.el;

public class TestEl6 {

    public static final int[] jjnewLexState = {
            -1, -1, 1, 1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 0, -1, -1, -1, -1, -1, -1, -1, -1, -1,
            -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1,
            -1, -1, -1, -1, -1, -1, -1,
    };


    public static String[] tokenImage = {
            "<EOF>", "<LITERAL_EXPRESSION>","${","#{"," ","\\t", "\\n", "\\r", "<INTEGER_LITERAL>", "<FLOATING_POINT_LITERAL>", "<EXPONENT>", "<STRING_LITERAL>",
            "true", "false", "null", "}", ".", "(", ")", "[", "]", ":", ",", ">", "gt", "<", "lt", ">=", "ge", "<=", "le", "==", "eq", "!=", "ne", "!", "not",
            "&&", "and", "||", "or", "empty", "instanceof", "*", "+", "-", "?", "/", "div", "%", "mod", "<IDENTIFIER>", "<FUNCTIONSUFFIX>", "#",
            "<LETTER>", "<DIGIT>", "<ILLEGAL_CHARACTER>",
    };


    public static void main(String[] args) {
        System.out.println("jjnewLexState.length ="+jjnewLexState.length );
        System.out.println("tokenImage.length ="+tokenImage.length );
        for(int i = 0 ;i < jjnewLexState.length ;i ++){
            int flag = jjnewLexState[i];
            if(flag >= 0 ){
                System.out.println(flag + " " + tokenImage[i]);
            }
        }
    }
}
