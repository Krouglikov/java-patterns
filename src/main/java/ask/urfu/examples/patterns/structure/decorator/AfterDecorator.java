package ask.urfu.examples.patterns.structure.decorator;

/**
 * Concrete decorator
 */
public class AfterDecorator extends Decorator {

  public AfterDecorator(Component baseComponent) {
    super(baseComponent);
  }

  @Override
  public void doWork() {
    super.doWork();
    System.out.println("After job");
  }
}
