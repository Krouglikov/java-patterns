package ask.urfu.examples.patterns.behavior.interpreter;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;

public class OperationExpression extends CompositeExpression {

  private final Operation operation;

  protected OperationExpression(Operation operation, Expression ex1, Expression ex2) {
    super(List.of(ex1, ex2));
    this.operation = operation;
  }

  @Override
  protected void beforeChildren(Context ctx) {
    //nothing
  }

  @Override
  protected void afterChildren(Context ctx) {
    Integer b = ctx.getValue();
    Integer a = ctx.getValue();
    Integer result = operation.calculator.apply(a, b);
    ctx.setValue(result);
  }

  public enum Operation {
    ADD("+", (a, b) -> a + b),

    SUBTRACT("-", (a, b) -> a - b),

    MULTIPLY("*", (a, b) -> a * b),

    DIVIDE("/", (a, b) -> a / b);

    private final String symbol;
    private final BinaryOperator<Integer> calculator;

    Operation(String symbol, BinaryOperator<Integer> calculator) {
      this.symbol = symbol;
      this.calculator = calculator;
    }

    public static Operation of(String symbol) {
      return Arrays.stream(Operation.values())
          .filter(o -> o.symbol.equals(symbol))
          .findAny()
          .orElseThrow();
    }
  }

}
