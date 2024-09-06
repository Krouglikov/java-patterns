package ask.urfu.examples.patterns.behavior.observer;

/**
 * Concrete observer
 */
public class ChangeCount implements Observer {

  private int count;

  public int getCount() {
    return count;
  }

  @Override
  public void update(Subject o) {
    //implement
    count++;
  }

}
