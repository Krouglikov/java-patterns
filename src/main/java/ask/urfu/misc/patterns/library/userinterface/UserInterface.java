package ask.urfu.misc.patterns.library.userinterface;

import ask.urfu.misc.patterns.library.game.UserDecision;
import java.util.Optional;

public class UserInterface {

  protected UserInterfaceImplementation implementation;

  public UserInterface(UserInterfaceImplementation implementation) {
    this.implementation = implementation;
  }

  public void activate() {
    implementation.activate();
  }

  public void deactivate() {
    implementation.deactivate();
  }

  public Optional<UserDecision> getNextDecision() {
    return implementation.ready()
        ? Optional.of(implementation.getDecision())
        : Optional.empty();
  }

  public UserDecision awaitNextDecision() throws InterruptedException {
    while (!implementation.ready()) {
      Thread.sleep(500L);
    }
    UserDecision decision = implementation.getDecision();
    return decision;
  }

  public void awaitAndExecuteNextDecision() throws InterruptedException {
    awaitNextDecision().execute();
  }

  public void draw() {
    implementation.show();
  }

}
