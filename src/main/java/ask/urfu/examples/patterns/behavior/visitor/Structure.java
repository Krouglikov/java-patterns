package ask.urfu.examples.patterns.behavior.visitor;

import java.util.List;

/**
 * Data structure, contains a tree and a separate object
 */
public class Structure {

  private final Tree tree;

  private final TreeSummary summary;

  public Structure(Tree tree, TreeSummary summary) {
    this.tree = tree;
    this.summary = summary;
  }

  public Tree getTree() {
    return tree;
  }

  public TreeSummary getSummary() {
    return summary;
  }

  //region Elements (nested classes)

  public interface VisitableElement {

    void accept(Visitor visitor);

  }

  public static class Tree implements VisitableElement {

    private final TreeNode root;

    private final List<Tree> children;

    public Tree(TreeNode root, List<Tree> children) {
      this.root = root;
      this.children = children;
    }

    @Override
    public void accept(Visitor visitor) {
      root.accept(visitor);
      children.forEach(child -> child.accept(visitor));
      visitor.visitTree(this);
    }

  }

  public static class TreeNode implements VisitableElement {

    private final String name;

    private int value;

    public TreeNode(String name, int value) {
      this.name = name;
      this.value = value;
    }

    @Override
    public void accept(Visitor visitor) {
      visitor.visitTreeNode(this);
    }

    public String getName() {
      return name;
    }

    public int getValue() {
      return value;
    }

    public void setValue(Integer newValue) {
      value = newValue;
    }

  }

  public static class TreeSummary implements VisitableElement {

    private int sum;

    private float average;

    @Override
    public void accept(Visitor visitor) {
      visitor.visitSummary(this);
    }

    public int getSum() {
      return sum;
    }

    public void setSum(int sum) {
      this.sum = sum;
    }

    public float getAverage() {
      return average;
    }

    public void setAverage(float average) {
      this.average = average;
    }

  }

  //endregion

}
