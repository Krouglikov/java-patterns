package ask.urfu.misc.patterns.library.userinterface;

import ask.urfu.misc.patterns.library.game.UserDecision;

public interface UserInterfaceImplementation {

  void show();

  boolean ready();

  UserDecision getDecision();

  void activate();

  void deactivate();

}
