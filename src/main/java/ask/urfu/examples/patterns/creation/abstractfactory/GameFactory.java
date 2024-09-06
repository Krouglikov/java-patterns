package ask.urfu.examples.patterns.creation.abstractfactory;

/**
 * Abstract factory
 */
public interface GameFactory {

  Item newItem();

  Character newCharacter(Item possessions);

}
