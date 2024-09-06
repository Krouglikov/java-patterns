package ask.urfu.examples.patterns.creation.factorymethod;

/**
 * Concrete creator in Factory method pattern
 */
public class NightmaresWeaver extends DreamWeaver {

  @Override
  public Nightmare createDream() {
    return new Nightmare();
  }

}
