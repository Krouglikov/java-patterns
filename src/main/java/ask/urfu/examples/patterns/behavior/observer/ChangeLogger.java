package ask.urfu.examples.patterns.behavior.observer;

/**
 * Concrete observer
 */
public class ChangeLogger implements Observer {

  @Override
  public void update(Subject o) {
    //implement
    System.out.printf("Subject changed: %s%n", o.getState());
  }

}
