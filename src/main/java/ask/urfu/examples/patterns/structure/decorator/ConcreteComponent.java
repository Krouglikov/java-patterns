package ask.urfu.examples.patterns.structure.decorator;

/**
 * Concrete component
 */
public class ConcreteComponent implements Component {

  @Override
  public void doWork() {
    System.out.println("Do job");
  }
}
