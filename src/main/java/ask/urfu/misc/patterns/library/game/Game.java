package ask.urfu.misc.patterns.library.game;

import ask.urfu.misc.patterns.library.character.PlayerCharacter;

public interface Game {

  PlayerCharacter player();

  Map map();

  void initialize();

  int save();

  void load(int saveId);

  void gameTurn();

}
