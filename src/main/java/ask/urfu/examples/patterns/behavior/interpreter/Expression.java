package ask.urfu.examples.patterns.behavior.interpreter;

/**
 * Abstract expression.
 */
public interface Expression {

  void interpret(Context ctx);

}
