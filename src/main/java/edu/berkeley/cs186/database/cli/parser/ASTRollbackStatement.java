/* Generated By:JJTree: Do not edit this line. ASTRollbackStatement.java Version 7.0 */
/* JavaCCOptions:MULTI=true,NODE_USES_PARSER=false,VISITOR=true,TRACK_TOKENS=false,NODE_PREFIX=AST,NODE_EXTENDS=,NODE_FACTORY=,SUPPORT_CLASS_VISIBILITY_PUBLIC=true */
package edu.berkeley.cs186.database.cli.parser;

public
class ASTRollbackStatement extends SimpleNode {
    public ASTRollbackStatement(int id) {
        super(id);
    }

    public ASTRollbackStatement(MoocParser p, int id) {
        super(p, id);
    }

    /** Accept the visitor. **/
    public void jjtAccept(MoocParserVisitor visitor, Object data) {
        visitor.visit(this, data);
    }
}
/* JavaCC - OriginalChecksum=9ab66f7b50afad7d6ae04939b23ec6e2 (do not edit this line) */
