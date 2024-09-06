package ask.urfu.examples.patterns.behavior.visitor;

import ask.urfu.examples.patterns.behavior.visitor.Structure.Tree;
import ask.urfu.examples.patterns.behavior.visitor.Structure.TreeNode;
import ask.urfu.examples.patterns.behavior.visitor.Structure.TreeSummary;
import java.util.ArrayList;
import java.util.List;

/**
 * Basic print add-on operation
 */
public class PrintVisitor implements Visitor {

  List<String> buffer = new ArrayList<>();

  @Override
  public void visitTreeNode(TreeNode node) {
    buffer.add(node.getName() + " = " + node.getValue());
  }

  @Override
  public void visitTree(Tree tree) {
    if (buffer.isEmpty()) {
      return;
    }
    String root = buffer.remove(0);
    System.out.println(root);
    buffer.forEach(child ->
        System.out.println(child));
    buffer.clear();
  }

  @Override
  public void visitSummary(TreeSummary summary) {
    System.out.println("SUM: " + summary.getSum());
    System.out.println("AVG: " + summary.getAverage());
  }

}
