package ask.urfu.examples.patterns.behavior.mediator;

public class ValidatorOutput extends Colleague {

  private String text;

  protected ValidatorOutput(Mediator mediator) {
    super(mediator);
  }

  public String getText() {
    return text;
  }

  public void setText(String text) {
    this.text = text;
  }

}
