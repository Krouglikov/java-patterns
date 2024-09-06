package ask.urfu.misc.patterns.library.game;

import ask.urfu.misc.patterns.fantasygame.models.character.Monster;
import ask.urfu.misc.patterns.library.character.Enemy;
import ask.urfu.misc.patterns.library.gear.Gear;
import java.util.stream.Stream;

public interface Location {

  String name();

  Stream<Location> neighbours();

  Stream<Enemy> enemies();

  Stream<Gear> items();

  void attach(Location... neighbours);

  void attach(Enemy... enemies);

  void removeEnemy(Monster monster);

  void attach(Gear... gear);

}
