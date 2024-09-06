package ask.urfu.examples.patterns.structure.proxy;

/**
 * Subject in Proxy pattern
 */
public class HeavyObject implements SomeObject {

  public HeavyObject() {
    try {
      Thread.sleep(5000);
    } catch (InterruptedException e) {
      Thread.currentThread().interrupt();
    }
  }

  @Override
  public void doSomethingSimple() {
    System.out.println("Something simple [Heavy object]");
  }

  @Override
  public void doSomethingHeavy() {
    // insert code here
    System.out.println("Something heavy [Heavy object]");
  }


}
