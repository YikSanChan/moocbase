/* Generated By:JJTree: Do not edit this line. ASTColumnName.java Version 7.0 */
/* JavaCCOptions:MULTI=true,NODE_USES_PARSER=false,VISITOR=true,TRACK_TOKENS=false,NODE_PREFIX=AST,NODE_EXTENDS=,NODE_FACTORY=,SUPPORT_CLASS_VISIBILITY_PUBLIC=true */
package edu.berkeley.cs186.database.cli.parser;

public
class ASTColumnName extends SimpleNode {
    public ASTColumnName(int id) {
        super(id);
    }

    public ASTColumnName(MoocParser p, int id) {
        super(p, id);
    }

    /** Accept the visitor. **/
    public void jjtAccept(MoocParserVisitor visitor, Object data) {
        visitor.visit(this, data);
    }
}
/* JavaCC - OriginalChecksum=c633a736731b3a1811b1be5e943c1315 (do not edit this line) */
