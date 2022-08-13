package com.test.el;

import java.sql.SQLOutput;
import java.util.Arrays;

public class TestBB {
    public static void main(String[] args) {
        String[] tokenImage = {
                "<EOF>",
                "<LITERAL_EXPRESSION>",
                "\"${\"",
                "\"#{\"",
                "\" \"",
                "\"\\t\"",
                "\"\\n\"",
                "\"\\r\"",
                "<INTEGER_LITERAL>",
                "<FLOATING_POINT_LITERAL>",
                "<EXPONENT>",
                "<STRING_LITERAL>",
                "\"true\"",
                "\"false\"",
                "\"null\"",
                "\"}\"",
                "\".\"",
                "\"(\"",
                "\")\"",
                "\"[\"",
                "\"]\"",
                "\":\"",
                "\",\"",
                "\">\"",
                "\"gt\"",
                "\"<\"",
                "\"lt\"",
                "\">=\"",
                "\"ge\"",
                "\"<=\"",
                "\"le\"",
                "\"==\"",
                "\"eq\"",
                "\"!=\"",
                "\"ne\"",
                "\"!\"",
                "\"not\"",
                "\"&&\"",
                "\"and\"",
                "\"||\"",
                "\"or\"",
                "\"empty\"",
                "\"instanceof\"",
                "\"*\"",
                "\"+\"",
                "\"-\"",
                "\"?\"",
                "\"/\"",
                "\"div\"",
                "\"%\"",
                "\"mod\"",
                "<IDENTIFIER>",
                "<FUNCTIONSUFFIX>",
                "\"#\"",
                "<LETTER>",
                "<DIGIT>",
                "<ILLEGAL_CHARACTER>",
        };
        System.out.println(Arrays.toString(tokenImage));
    }


}
