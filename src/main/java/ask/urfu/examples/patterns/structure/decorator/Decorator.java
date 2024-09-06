package ask.urfu.examples.patterns.structure.decorator;

/**
 * Abstract decorator
 */
public abstract class Decorator implements Component {

  private final Component baseComponent;

  protected Decorator(Component baseComponent) {
    this.baseComponent = baseComponent;
  }

  @Override
  public void doWork() {
    baseComponent.doWork();
  }

}
