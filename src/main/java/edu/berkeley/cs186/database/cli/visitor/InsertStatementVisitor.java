package edu.berkeley.cs186.database.cli.visitor;

import edu.berkeley.cs186.database.Transaction;
import edu.berkeley.cs186.database.cli.PrettyPrinter;
import edu.berkeley.cs186.database.cli.parser.ASTLiteral;
import edu.berkeley.cs186.database.cli.parser.ASTTableName;
import edu.berkeley.cs186.database.databox.DataBox;

import java.util.ArrayList;
import java.util.List;

public class InsertStatementVisitor extends StatementVisitor {
    public String tableName;
    public List<DataBox> values = new ArrayList<DataBox>();

    @Override
    public void visit(ASTTableName node, Object data) {
        this.tableName = (String) node.jjtGetValue();
    }

    @Override
    public void visit(ASTLiteral node, Object data) {
        this.values.add(PrettyPrinter.parseLiteral((String) node.jjtGetValue()));
    }

    @Override
    public void execute(Transaction transaction) {
        try {
            transaction.insert(this.tableName, this.values);
            System.out.println("INSERT");
        } catch (Exception e) {
            System.out.println(e.getMessage());
            System.out.println("Failed to execute INSERT.");
        }
    }

    @Override
    public StatementType getType() {
        return StatementType.INSERT;
    }
}