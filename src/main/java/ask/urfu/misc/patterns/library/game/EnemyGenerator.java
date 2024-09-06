package ask.urfu.misc.patterns.library.game;

import ask.urfu.misc.patterns.library.character.Enemy;
import java.util.List;
import java.util.stream.Stream;

public abstract class EnemyGenerator {

  protected abstract Enemy newEnemy();

  public List<Enemy> createEnemies(int n) {
    return Stream.generate(this::newEnemy)
        .limit(n)
        .toList();
  }

}
