package com.test.el;

import org.apache.el.parser.ELParser;
import org.apache.el.parser.Node;

import java.io.StringReader;

public class TestEl3 {
    public static void main(String[] args) throws Exception {
        String expr = "${m:f(\"sasas\") }";

        Node n = (new ELParser(new StringReader(expr))).CompositeExpression();
        System.out.println(n);
    }
}
