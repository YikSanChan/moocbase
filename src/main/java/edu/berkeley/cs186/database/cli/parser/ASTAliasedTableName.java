/* Generated By:JJTree: Do not edit this line. ASTAliasedTableName.java Version 7.0 */
/* JavaCCOptions:MULTI=true,NODE_USES_PARSER=false,VISITOR=true,TRACK_TOKENS=false,NODE_PREFIX=AST,NODE_EXTENDS=,NODE_FACTORY=,SUPPORT_CLASS_VISIBILITY_PUBLIC=true */
package edu.berkeley.cs186.database.cli.parser;

public
class ASTAliasedTableName extends SimpleNode {
    public ASTAliasedTableName(int id) {
        super(id);
    }

    public ASTAliasedTableName(MoocParser p, int id) {
        super(p, id);
    }

    /** Accept the visitor. **/
    public void jjtAccept(MoocParserVisitor visitor, Object data) {
        visitor.visit(this, data);
    }
}
/* JavaCC - OriginalChecksum=2d12e33e18264bc07a03ab481174f01d (do not edit this line) */
