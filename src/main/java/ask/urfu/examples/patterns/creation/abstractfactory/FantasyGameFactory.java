package ask.urfu.examples.patterns.creation.abstractfactory;

/**
 * Concrete factory
 */
public class FantasyGameFactory implements GameFactory {

  @Override
  public Item newItem() {
    return new FantasyItem();
  }

  @Override
  public FantasyCharacter newCharacter(Item possessions) {
    return new FantasyCharacter((FantasyItem) possessions);
  }
}
