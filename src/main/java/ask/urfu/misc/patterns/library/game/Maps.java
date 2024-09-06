package ask.urfu.misc.patterns.library.game;

import ask.urfu.misc.patterns.library.character.CharacterClass;
import ask.urfu.misc.patterns.library.character.PlayerCharacter;
import ask.urfu.misc.patterns.library.gear.Gear;

public interface Maps {

  PlayerCharacter newRandomPlayer(String name);

  PlayerCharacter newPlayer(String name, CharacterClass chosenClass, Gear... gear);

  Gear[] newPlayerGear(CharacterClass chosenClass);

  Location newLocation();

}
