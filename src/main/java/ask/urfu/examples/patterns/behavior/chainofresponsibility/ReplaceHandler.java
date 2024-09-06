package ask.urfu.examples.patterns.behavior.chainofresponsibility;

/**
 * Concrete handler
 */
public class ReplaceHandler extends HandlerBase<Text> {

  private final String original;

  private final String replacement;

  private final boolean terminal;

  public ReplaceHandler(String original, String replacement, boolean terminal) {
    this.original = original;
    this.replacement = replacement;
    this.terminal = terminal;
  }

  @Override
  protected boolean doHandle(Text context) {
    context.forEach(s -> s.replace(original, replacement));
    return !terminal;
  }

}
