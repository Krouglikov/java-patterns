package ask.urfu.examples.patterns.behavior.visitor;

import ask.urfu.examples.patterns.behavior.visitor.Structure.Tree;
import ask.urfu.examples.patterns.behavior.visitor.Structure.TreeNode;
import ask.urfu.examples.patterns.behavior.visitor.Structure.TreeSummary;

/**
 * Add-on operation, tree summary update
 */
public class UpdatingVisitor implements Visitor {

  int sum;

  int count;

  @Override
  public void visitTreeNode(TreeNode node) {
    sum += node.getValue();
    count++;
  }

  @Override
  public void visitTree(Tree tree) {
    //not implemented
  }

  @Override
  public void visitSummary(TreeSummary summary) {
    summary.setSum(sum);
    summary.setAverage(((float) sum) / count);
  }
}
