package ask.urfu.misc.patterns.library.character;

import ask.urfu.misc.patterns.library.gear.Gear;
import java.util.stream.Stream;

public interface GameCharacter {

  String getName();

  CharacterModel getModel();

  Stream<Gear> gear();

}
