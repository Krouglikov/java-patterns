package ask.urfu.examples.patterns.behavior.chainofresponsibility;

/**
 * Concrete handler
 */
public class AddLineHandler extends HandlerBase<Text> {

  private final String line;

  public AddLineHandler(String line) {
    this.line = line;
  }

  @Override
  protected boolean doHandle(Text context) {
    context.add(line);
    return true;
  }
}
