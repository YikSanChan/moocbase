/* Generated By:JJTree: Do not edit this line. ASTDropIndexStatement.java Version 7.0 */
/* JavaCCOptions:MULTI=true,NODE_USES_PARSER=false,VISITOR=true,TRACK_TOKENS=false,NODE_PREFIX=AST,NODE_EXTENDS=,NODE_FACTORY=,SUPPORT_CLASS_VISIBILITY_PUBLIC=true */
package edu.berkeley.cs186.database.cli.parser;

public
class ASTDropIndexStatement extends SimpleNode {
    public ASTDropIndexStatement(int id) {
        super(id);
    }

    public ASTDropIndexStatement(MoocParser p, int id) {
        super(p, id);
    }

    /** Accept the visitor. **/
    public void jjtAccept(MoocParserVisitor visitor, Object data) {
        visitor.visit(this, data);
    }
}
/* JavaCC - OriginalChecksum=be694d25051d1b10dc90e584daa1cbd2 (do not edit this line) */
