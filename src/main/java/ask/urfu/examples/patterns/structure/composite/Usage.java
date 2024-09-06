package ask.urfu.examples.patterns.structure.composite;

/**
 * How to use Composite pattern
 */
public class Usage {

  public static void main(String[] args) {
    Tree tree = prepareData();
    tree.operate();
    // dynamically add a new leaf
    System.out.println();
    tree.addComponent(new Leaf());
    tree.operate();
  }

  private static Tree prepareData() {
    Tree subtree1 = new Tree();
    subtree1.addComponent(new Leaf());
    subtree1.addComponent(new Leaf());

    Tree subtree2 = new Tree();
    subtree2.addComponent(new Leaf());
    subtree2.addComponent(new Leaf());

    Tree tree = new Tree();
    tree.addComponent(subtree1);
    tree.addComponent(subtree2);
    return tree;
  }

}
