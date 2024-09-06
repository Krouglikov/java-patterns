package ask.urfu.examples.patterns.structure.proxy;

/**
 * How to use Proxy pattern
 */
public class Usage {

  public static void main(String[] args) {
    SomeObject someObject = new HeavyObjectProxy();
    someObject.doSomethingSimple();
    someObject.doSomethingHeavy();
  }

}
