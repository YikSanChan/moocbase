/* Generated By:JJTree: Do not edit this line. ASTBeginStatement.java Version 7.0 */
/* JavaCCOptions:MULTI=true,NODE_USES_PARSER=false,VISITOR=true,TRACK_TOKENS=false,NODE_PREFIX=AST,NODE_EXTENDS=,NODE_FACTORY=,SUPPORT_CLASS_VISIBILITY_PUBLIC=true */
package edu.berkeley.cs186.database.cli.parser;

public
class ASTBeginStatement extends SimpleNode {
    public ASTBeginStatement(int id) {
        super(id);
    }

    public ASTBeginStatement(MoocParser p, int id) {
        super(p, id);
    }

    /** Accept the visitor. **/
    public void jjtAccept(MoocParserVisitor visitor, Object data) {
        visitor.visit(this, data);
    }
}
/* JavaCC - OriginalChecksum=75e7b67eb85afdef7a0872428ebd68cb (do not edit this line) */
