/* Generated By:JJTree: Do not edit this line. ASTDeleteStatement.java Version 7.0 */
/* JavaCCOptions:MULTI=true,NODE_USES_PARSER=false,VISITOR=true,TRACK_TOKENS=false,NODE_PREFIX=AST,NODE_EXTENDS=,NODE_FACTORY=,SUPPORT_CLASS_VISIBILITY_PUBLIC=true */
package edu.berkeley.cs186.database.cli.parser;

public
class ASTDeleteStatement extends SimpleNode {
    public ASTDeleteStatement(int id) {
        super(id);
    }

    public ASTDeleteStatement(MoocParser p, int id) {
        super(p, id);
    }

    /** Accept the visitor. **/
    public void jjtAccept(MoocParserVisitor visitor, Object data) {
        visitor.visit(this, data);
    }
}
/* JavaCC - OriginalChecksum=2676e92d7ab3d58f50f479a3655b510f (do not edit this line) */
