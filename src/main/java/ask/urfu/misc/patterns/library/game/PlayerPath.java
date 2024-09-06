package ask.urfu.misc.patterns.library.game;

public interface PlayerPath {

  Location start();

  Location end();

  void register(Location location);

  PathScan scan();

  interface PathScan {

    boolean hasNext();

    boolean hasPrev();

    Location next();

    Location prev();

  }

}
