package ask.urfu.examples.patterns.creation.abstractfactory;

/**
 * How to use Abstract factory pattern
 */
public class Usage {

  public static void main(String[] args) {
    GameFactory factory = new FantasyGameFactory();
    Character character = factory.newCharacter(factory.newItem());
    System.out.println(character.getInfo());

    factory = new SciFiGameFactory();
    character = factory.newCharacter(factory.newItem());
    System.out.println(character.getInfo());
  }

}
