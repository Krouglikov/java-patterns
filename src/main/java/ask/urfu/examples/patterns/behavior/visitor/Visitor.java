package ask.urfu.examples.patterns.behavior.visitor;

import ask.urfu.examples.patterns.behavior.visitor.Structure.Tree;
import ask.urfu.examples.patterns.behavior.visitor.Structure.TreeNode;
import ask.urfu.examples.patterns.behavior.visitor.Structure.TreeSummary;

/**
 * Visitor. Contains add-on operations for all elements of structure.
 */
public interface Visitor {

  void visitTreeNode(TreeNode node);

  void visitTree(Tree tree);

  void visitSummary(TreeSummary summary);

}
