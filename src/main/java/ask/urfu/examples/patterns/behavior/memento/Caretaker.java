package ask.urfu.examples.patterns.behavior.memento;

import ask.urfu.examples.patterns.behavior.memento.GameCharacter.Memento;
import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

/**
 * Caretaker manages mementos
 */
public class Caretaker {

  private final Map<LocalDateTime, Memento> mementos = new HashMap<>();

  public LocalDateTime save(GameCharacter character) {
    LocalDateTime now = LocalDateTime.now();
    mementos.put(now, character.createMemento());
    return now;
  }

  public void load(GameCharacter character, LocalDateTime saveKey) {
    if (mementos.containsKey(saveKey)) {
      Memento memento = mementos.get(saveKey);
      character.setMemento(memento);
    }
  }

}
