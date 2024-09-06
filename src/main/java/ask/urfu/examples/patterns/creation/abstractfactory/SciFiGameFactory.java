package ask.urfu.examples.patterns.creation.abstractfactory;

/**
 * Concrete factory
 */
public class SciFiGameFactory implements GameFactory {

  @Override
  public Item newItem() {
    return new SciFiItem();
  }

  @Override
  public SciFiCharacter newCharacter(Item possessions) {
    return new SciFiCharacter((SciFiItem) possessions);
  }
}
