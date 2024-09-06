package ask.urfu.examples.patterns.behavior.observer;

/**
 * How to use Observer pattern
 */
public class Usage {

  public static void main(String[] args) {
    // preparations
    Subject subject = new Subject();
    ChangeLogger logger = new ChangeLogger();
    ChangeCount count = new ChangeCount();
    // subscribe observers
    subject.addObserver(logger);
    subject.addObserver(count);

    // subject lives its own life
    subject.increaseCount();
    subject.increaseCount();
    subject.increaseCount();

    // count observer kept track of changes
    System.out.printf("Subject changed %s times%n", count.getCount());
  }

}
