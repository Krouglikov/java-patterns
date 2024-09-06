package ask.urfu.examples.patterns.behavior.interpreter;

public abstract class TerminalExpression implements Expression {

  public void interpret(Context ctx) {
    doInterpret(ctx);
  }

  protected abstract void doInterpret(Context ctx);

}
