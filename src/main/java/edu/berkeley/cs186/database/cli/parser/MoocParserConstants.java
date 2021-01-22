/* Generated By:JJTree&JavaCC: Do not edit this line. MoocParserConstants.java */
package edu.berkeley.cs186.database.cli.parser;

/** Token literal values and constants. Generated by org.javacc.parser.OtherFilesGen#start() */
public interface MoocParserConstants {
  /** End of File. */
  int EOF = 0;
  /** RegularExpression Id. */
  int SCOL = 5;
  /** RegularExpression Id. */
  int DOT = 6;
  /** RegularExpression Id. */
  int OPEN_PAR = 7;
  /** RegularExpression Id. */
  int CLOSE_PAR = 8;
  /** RegularExpression Id. */
  int COMMA = 9;
  /** RegularExpression Id. */
  int STAR = 10;
  /** RegularExpression Id. */
  int LT = 11;
  /** RegularExpression Id. */
  int LT_EQ = 12;
  /** RegularExpression Id. */
  int GT = 13;
  /** RegularExpression Id. */
  int GT_EQ = 14;
  /** RegularExpression Id. */
  int EQEQ = 15;
  /** RegularExpression Id. */
  int EQ = 16;
  /** RegularExpression Id. */
  int NOT_EQ1 = 17;
  /** RegularExpression Id. */
  int NOT_EQ2 = 18;
  /** RegularExpression Id. */
  int FALSE = 19;
  /** RegularExpression Id. */
  int TRUE = 20;
  /** RegularExpression Id. */
  int K_WITH = 21;
  /** RegularExpression Id. */
  int K_AS = 22;
  /** RegularExpression Id. */
  int K_DELETE = 23;
  /** RegularExpression Id. */
  int K_INSERT = 24;
  /** RegularExpression Id. */
  int K_INTO = 25;
  /** RegularExpression Id. */
  int K_UPDATE = 26;
  /** RegularExpression Id. */
  int K_SET = 27;
  /** RegularExpression Id. */
  int K_SELECT = 28;
  /** RegularExpression Id. */
  int K_FROM = 29;
  /** RegularExpression Id. */
  int K_INNER = 30;
  /** RegularExpression Id. */
  int K_JOIN = 31;
  /** RegularExpression Id. */
  int K_ON = 32;
  /** RegularExpression Id. */
  int K_WHERE = 33;
  /** RegularExpression Id. */
  int K_AND = 34;
  /** RegularExpression Id. */
  int K_GROUP = 35;
  /** RegularExpression Id. */
  int K_BY = 36;
  /** RegularExpression Id. */
  int K_LIMIT = 37;
  /** RegularExpression Id. */
  int K_CREATE = 38;
  /** RegularExpression Id. */
  int K_DROP = 39;
  /** RegularExpression Id. */
  int K_TABLE = 40;
  /** RegularExpression Id. */
  int K_VALUES = 41;
  /** RegularExpression Id. */
  int K_INDEX = 42;
  /** RegularExpression Id. */
  int K_BEGIN = 43;
  /** RegularExpression Id. */
  int K_END = 44;
  /** RegularExpression Id. */
  int K_COMMIT = 45;
  /** RegularExpression Id. */
  int K_TRANSACTION = 46;
  /** RegularExpression Id. */
  int K_SAVEPOINT = 47;
  /** RegularExpression Id. */
  int K_ROLLBACK = 48;
  /** RegularExpression Id. */
  int K_TO = 49;
  /** RegularExpression Id. */
  int K_RELEASE = 50;
  /** RegularExpression Id. */
  int K_EXPLAIN = 51;
  /** RegularExpression Id. */
  int K_QUERY = 52;
  /** RegularExpression Id. */
  int K_PLAN = 53;
  /** RegularExpression Id. */
  int K_ANALYZE = 54;
  /** RegularExpression Id. */
  int NUMERIC_LITERAL = 55;
  /** RegularExpression Id. */
  int DIGITS = 56;
  /** RegularExpression Id. */
  int DIGIT = 57;
  /** RegularExpression Id. */
  int SIGN = 58;
  /** RegularExpression Id. */
  int STRING_LITERAL = 59;
  /** RegularExpression Id. */
  int IDENTIFIER = 60;

  /** Lexical state. */
  int DEFAULT = 0;

  /** Literal token values. */
  String[] tokenImage = {
    "<EOF>",
    "\" \"",
    "\"\\t\"",
    "\"\\r\"",
    "\"\\n\"",
    "\";\"",
    "\".\"",
    "\"(\"",
    "\")\"",
    "\",\"",
    "\"*\"",
    "\"<\"",
    "\"<=\"",
    "\">\"",
    "\">=\"",
    "\"==\"",
    "\"=\"",
    "\"!=\"",
    "\"<>\"",
    "\"false\"",
    "\"true\"",
    "\"with\"",
    "\"as\"",
    "\"delete\"",
    "\"insert\"",
    "\"into\"",
    "\"update\"",
    "\"set\"",
    "\"select\"",
    "\"from\"",
    "\"inner\"",
    "\"join\"",
    "\"on\"",
    "\"where\"",
    "\"and\"",
    "\"group\"",
    "\"by\"",
    "\"limit\"",
    "\"create\"",
    "\"drop\"",
    "\"table\"",
    "\"values\"",
    "\"index\"",
    "\"begin\"",
    "\"end\"",
    "\"commit\"",
    "\"transaction\"",
    "\"savepoint\"",
    "\"rollback\"",
    "\"to\"",
    "\"release\"",
    "\"explain\"",
    "\"query\"",
    "\"plan\"",
    "\"analyze\"",
    "<NUMERIC_LITERAL>",
    "<DIGITS>",
    "<DIGIT>",
    "<SIGN>",
    "<STRING_LITERAL>",
    "<IDENTIFIER>",
  };
}
