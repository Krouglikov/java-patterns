package ask.urfu.examples.patterns.behavior.visitor;

import ask.urfu.examples.patterns.behavior.visitor.Structure.Tree;
import ask.urfu.examples.patterns.behavior.visitor.Structure.TreeNode;
import ask.urfu.examples.patterns.behavior.visitor.Structure.TreeSummary;
import java.util.Arrays;
import java.util.Collections;

/**
 * How to use Visitor pattern
 */
public class Usage {

  public static final String LINE = "--------------------";


  public static void main(String[] args) {
    Structure s = new Structure(makeTree(), new TreeSummary());
    Visitor print = new PrintVisitor();

    System.out.println("\nBasic tree");
    System.out.println(LINE);
    use(s, print);

    System.out.println("\nUpdate summary");
    System.out.println(LINE);
    use(s, new UpdatingVisitor());
    use(s, print);

    System.out.println("\nSquare nodes");
    System.out.println(LINE);
    use(s, new OperationVisitor(x -> x * x));
    use(s, print);

    System.out.println("\nUpdate summary");
    System.out.println(LINE);
    use(s, new UpdatingVisitor());
    use(s, print);
  }

  private static void use(Structure s, Visitor visitor) {
    s.getTree().accept(visitor);
    s.getSummary().accept(visitor);
  }

  /**
   * Node 0 +--- Node 1 +    +--- Node 2 +    +--- Node 3 +--- Node 4 .    +--- Node 5 .    +---
   * Node 6
   */
  private static Tree makeTree() {
    return new Tree(
        new TreeNode("Node 0", 0),
        Arrays.asList(
            new Tree(
                new TreeNode("Node 1", 1),
                Arrays.asList(
                    new Tree(
                        new TreeNode("Node 2", 2),
                        Collections.emptyList()
                    ),
                    new Tree(
                        new TreeNode("Node 3", 3),
                        Collections.emptyList()
                    )
                )
            ),
            new Tree(
                new TreeNode("Node 4", 4),
                Arrays.asList(
                    new Tree(
                        new TreeNode("Node 5", 5),
                        Collections.emptyList()
                    ),
                    new Tree(
                        new TreeNode("Node 6", 6),
                        Collections.emptyList()
                    )
                )
            )
        )
    );
  }

}
