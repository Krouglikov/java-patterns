package ask.urfu.examples.patterns.behavior.interpreter;

import java.util.List;

public abstract class CompositeExpression implements Expression {

  private final List<Expression> children;

  protected CompositeExpression(List<Expression> children) {
    this.children = children;
  }

  @Override
  public void interpret(Context ctx) {
    beforeChildren(ctx);
    children.forEach(child -> child.interpret(ctx));
    afterChildren(ctx);
  }

  protected abstract void beforeChildren(Context ctx);

  protected abstract void afterChildren(Context ctx);

}
