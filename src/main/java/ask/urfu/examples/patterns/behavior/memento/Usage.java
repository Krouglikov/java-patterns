package ask.urfu.examples.patterns.behavior.memento;

import java.time.LocalDateTime;

/**
 * How to use Memento pattern
 */
public class Usage {

  public static void main(String[] args) {
    Caretaker saveSystem = new Caretaker();
    GameCharacter character = new GameCharacter("Al the Splendid");
    // save state
    LocalDateTime saveTime = saveSystem.save(character);
    System.out.println(character);
    // change state
    character.levelUp();
    System.out.println(character);
    // load state
    saveSystem.load(character, saveTime);
    System.out.println(character);
  }

}
