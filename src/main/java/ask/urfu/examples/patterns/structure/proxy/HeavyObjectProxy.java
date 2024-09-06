package ask.urfu.examples.patterns.structure.proxy;

/**
 * Proxy pattern essence
 */
public class HeavyObjectProxy implements SomeObject {

  private HeavyObject realObject;


  @Override
  public void doSomethingSimple() {
    System.out.println("Something simple [Proxie]");
  }

  @Override
  public void doSomethingHeavy() {
    initializeObject();
    realObject.doSomethingHeavy();
  }

  private void initializeObject() {
    if (realObject == null) {
      realObject = new HeavyObject();
    }
  }

}
