package ask.urfu.examples.patterns.behavior.visitor;

import ask.urfu.examples.patterns.behavior.visitor.Structure.Tree;
import ask.urfu.examples.patterns.behavior.visitor.Structure.TreeNode;
import ask.urfu.examples.patterns.behavior.visitor.Structure.TreeSummary;
import java.util.function.IntFunction;

/**
 * Add-on operation on values
 */
public class OperationVisitor implements Visitor {

  private final IntFunction<Integer> operation;

  public OperationVisitor(IntFunction<Integer> operation) {
    this.operation = operation;
  }

  @Override
  public void visitTreeNode(TreeNode node) {
    var newValue = operation.apply(node.getValue());
    node.setValue(newValue);
  }

  @Override
  public void visitTree(Tree tree) {
    //not implemented
  }

  @Override
  public void visitSummary(TreeSummary summary) {
    //not implemented
  }
}
