package ask.urfu.misc.patterns.library.service;

import ask.urfu.misc.patterns.library.character.Enemy;
import ask.urfu.misc.patterns.library.character.NonPlayerCharacter;
import ask.urfu.misc.patterns.library.character.PlayerCharacter;
import ask.urfu.misc.patterns.library.game.Map;
import java.nio.file.Path;

public interface LoadFromFile {

  PlayerCharacter loadPlayer(String filename);

  PlayerCharacter loadPlayer(Path filename);

  NonPlayerCharacter loadNpc(String filename);

  NonPlayerCharacter loadNpc(Path filename);

  Enemy loadEnemy(String filename);

  Enemy loadEnemy(Path filename);

  Map loadMap(String filename);

  Map loadMap(Path filename);

}
