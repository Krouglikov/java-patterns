package ask.urfu.examples.patterns.structure.decorator;

/**
 * How to use Decorator pattern
 */
public class Usage {

  public static void main(String[] args) {
    Component component = new ConcreteComponent();
    component.doWork();
    System.out.println();

    component = new BeforeDecorator(new ConcreteComponent());
    component.doWork();
    System.out.println();

    component = new AfterDecorator(new ConcreteComponent());
    component.doWork();
    System.out.println();

    component = new AfterDecorator(new BeforeDecorator(new ConcreteComponent()));
    component.doWork();
  }

}
