package ask.urfu.examples.patterns.structure.decorator;

/**
 * Concrete decorator
 */
public class BeforeDecorator extends Decorator {

  public BeforeDecorator(Component baseComponent) {
    super(baseComponent);
  }

  @Override
  public void doWork() {
    System.out.println("Before job");
    super.doWork();
  }
}
