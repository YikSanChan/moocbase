/* Generated By:JJTree: Do not edit this line. ASTInsertStatement.java Version 7.0 */
/* JavaCCOptions:MULTI=true,NODE_USES_PARSER=false,VISITOR=true,TRACK_TOKENS=false,NODE_PREFIX=AST,NODE_EXTENDS=,NODE_FACTORY=,SUPPORT_CLASS_VISIBILITY_PUBLIC=true */
package edu.berkeley.cs186.database.cli.parser;

public
class ASTInsertStatement extends SimpleNode {
    public ASTInsertStatement(int id) {
        super(id);
    }

    public ASTInsertStatement(MoocParser p, int id) {
        super(p, id);
    }

    /** Accept the visitor. **/
    public void jjtAccept(MoocParserVisitor visitor, Object data) {
        visitor.visit(this, data);
    }
}
/* JavaCC - OriginalChecksum=3f3f266fb588f2ccc7731a1a3dfeeb3a (do not edit this line) */
