package com.test.el;

import org.apache.el.parser.ELParser;
import org.apache.el.parser.Node;

import java.io.StringReader;

public class TestEl {
    public static void main(String[] args) throws Exception {
        String expr = "${12 == 12 && 12 < 11 }";
        Node n =  (new ELParser(new StringReader(expr))).CompositeExpression();
        System.out.println(n);
    }
}
