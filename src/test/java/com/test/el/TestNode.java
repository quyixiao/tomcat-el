package com.test.el;

import org.apache.el.parser.JJTELParserState;

public class TestNode {
    public static  JJTELParserState jjtree = new JJTELParserState();


    public static void main(String[] args) {
        // 1
        SimpleNode1 node1 = new SimpleNode1("1");
        try {
            jjtree.openNodeScope(node1);
            // 2.1
            SimpleNode1 node21 = new SimpleNode1("2.1");
            try {
                jjtree.openNodeScope(node21);
                // 3.1
                SimpleNode1 node211 = new SimpleNode1("3.1");
                try {
                    jjtree.openNodeScope(node211);
                }finally {
                    jjtree.closeNodeScope(node211,true);
                }

                // 3.2
                SimpleNode1 node212 = new SimpleNode1("3.2");
                try {
                    jjtree.openNodeScope(node212);
                }finally {
                    jjtree.closeNodeScope(node212,true);
                }
            }finally {
                jjtree.closeNodeScope(node21,true);
            }

            // 2.2
            SimpleNode1 node22=  new SimpleNode1("2.2");;
            try {
                jjtree.openNodeScope(node22);
            }finally {
                jjtree.closeNodeScope(node22,true);
            }

        }finally {
            jjtree.closeNodeScope(node1,true);
        }
        System.out.println(node1);

    }
}




























