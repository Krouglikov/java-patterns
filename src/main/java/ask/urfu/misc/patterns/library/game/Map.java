package ask.urfu.misc.patterns.library.game;

public interface Map {

  Location currentLocation();

  PlayerPath history();

  void moveTo(Location newLocation);

}
