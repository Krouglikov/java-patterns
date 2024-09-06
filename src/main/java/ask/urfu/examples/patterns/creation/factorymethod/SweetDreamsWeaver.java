package ask.urfu.examples.patterns.creation.factorymethod;

/**
 * Concrete creator in Factory method pattern
 */
public class SweetDreamsWeaver extends DreamWeaver {

  @Override
  public SweetDream createDream() {
    return new SweetDream();
  }

}
