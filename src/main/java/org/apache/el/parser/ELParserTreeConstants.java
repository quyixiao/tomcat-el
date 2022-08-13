/* Generated By:JavaCC: Do not edit this line. ELParserTreeConstants.java Version 5.0 */
package org.apache.el.parser;

public interface ELParserTreeConstants
{
  public String  JJTCOMPOSITEEXPRESSION = "CompositeExpression";
  public String  JJTLITERALEXPRESSION = "LiteralExpression";
  public String  JJTDEFERREDEXPRESSION = "DeferredExpression";
  public String  JJTDYNAMICEXPRESSION = "DynamicExpression";
  public String  JJTVOID = "void";
  public String  JJTCHOICE = "Choice";
  public String  JJTOR = "Or";
  public String  JJTAND = "And";
  public String  JJTEQUAL = "Equal";
  public String  JJTNOTEQUAL = "NotEqual";
  public String  JJTLESSTHAN = "LessThan";
  public String  JJTGREATERTHAN = "GreaterThan";
  public String  JJTLESSTHANEQUAL = "LessThanEqual";
  public String  JJTGREATERTHANEQUAL = "GreaterThanEqual";
  public String  JJTPLUS = "Plus";
  public String  JJTMINUS = "Minus";
  public String  JJTMULT = "Mult";
  public String  JJTDIV = "Div";
  public String  JJTMOD = "Mod";
  public String  JJTNEGATIVE = "Negative";
  public String  JJTNOT = "Not";
  public String  JJTEMPTY = "Empty";
  public String  JJTVALUE = "Value";
  public String  JJTDOTSUFFIX = "DotSuffix";
  public String  JJTBRACKETSUFFIX = "BracketSuffix";
  public String  JJTMETHODPARAMETERS = "MethodParameters";
  public String  JJTIDENTIFIER = "Identifier";
  public String  JJTFUNCTION = "Function";
  public String  JJTTRUE = "True";
  public String  JJTFALSE = "False";
  public String  JJTFLOATINGPOINT = "FloatingPoint";
  public String  JJTINTEGER = "Integer";
  public String  JJTSTRING = "String";
  public String  JJTNULL = "Null";


  public String[] jjtNodeName = {
    "CompositeExpression",
    "LiteralExpression",
    "DeferredExpression",
    "DynamicExpression",
    "void",
    "Choice",
    "Or",
    "And",
    "Equal",
    "NotEqual",
    "LessThan",
    "GreaterThan",
    "LessThanEqual",
    "GreaterThanEqual",

    "Plus",
    "Minus",
    "Mult",
    "Div",
    "Mod",
    "Negative",

    "Not",
    "Empty",
    "Value",
    "DotSuffix",

    "BracketSuffix",
    "MethodParameters",
    "Identifier",
    "Function",
    "True",
    "False",
    "FloatingPoint",
    "Integer",
    "String",
    "Null",
  };



  public static  int getId(String a ){
    for(int i = 0 ; i< jjtNodeName.length;i ++){
      if(jjtNodeName[i].equals(a)){
        return i ;
      }
    }
    return 0 ;
  }




}
/* JavaCC - OriginalChecksum=437008e736f149e8fa6712fb36d831a1 (do not edit this line) */
