package ask.urfu.examples.patterns.behavior.mediator;

public class Input<X> extends Colleague {

  private X value;

  protected Input(Mediator mediator) {
    super(mediator);
  }

  public X getValue() {
    return value;
  }

  public void setValue(X value) {
    this.value = value;
    signalChange();
  }
}
