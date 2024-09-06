package ask.urfu.examples.patterns.behavior.interpreter;

/**
 * How to use Interpreter pattern
 */
public class Usage {

  public static void main(String[] args) {
    CommandParser parser = new CommandParser();
    System.out.println(
        evaluate(parser, "2")
    );
    System.out.println(
        evaluate(parser, "2+2")
    );
    System.out.println(
        evaluate(parser, "(2*2)-(2/2)")
    );
  }

  private static Integer evaluate(CommandParser parser, String commandLine) {
    Context context = new Context();
    parser.parse(commandLine)
        .ifPresent(expression -> expression.interpret(context));
    return context.getValue();
  }

}
