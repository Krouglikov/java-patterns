package ask.urfu.examples.patterns.behavior.mediator;

/**
 * Base class for Mediator pattern Colleague
 */
public abstract class Colleague {

  protected final Mediator mediator;

  protected Colleague(Mediator mediator) {
    this.mediator = mediator;
  }

  protected void signalChange() {
    mediator.wasChanged(this);
  }

}
