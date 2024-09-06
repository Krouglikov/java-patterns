package ask.urfu.examples.patterns.behavior.interpreter;

import ask.urfu.examples.patterns.behavior.interpreter.OperationExpression.Operation;
import java.util.Optional;

/**
 * Not part of pattern. Fake
 */
public class CommandParser {

  public Optional<Expression> parse(String commandLine) {
    return switch (commandLine) {
      case "2" -> Optional.of(
          new LiteralExpression(2)
      );
      case "2+2" -> Optional.of(
          new OperationExpression(
              Operation.ADD,
              new LiteralExpression(2),
              new LiteralExpression(2))
      );
      case "(2*2)-(2/2)" -> Optional.of(
          new OperationExpression(
              Operation.SUBTRACT,
              new OperationExpression(
                  Operation.MULTIPLY,
                  new LiteralExpression(2),
                  new LiteralExpression(2)),
              new OperationExpression(
                  Operation.DIVIDE,
                  new LiteralExpression(2),
                  new LiteralExpression(2))
          ));
      default -> Optional.empty();
    };
  }


}
