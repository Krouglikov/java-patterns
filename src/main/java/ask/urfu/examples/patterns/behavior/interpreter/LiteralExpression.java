package ask.urfu.examples.patterns.behavior.interpreter;

public class LiteralExpression extends TerminalExpression {

  private final Integer value;

  public LiteralExpression(Integer value) {
    this.value = value;
  }

  @Override
  protected void doInterpret(Context ctx) {
    ctx.setValue(value);
  }
}
