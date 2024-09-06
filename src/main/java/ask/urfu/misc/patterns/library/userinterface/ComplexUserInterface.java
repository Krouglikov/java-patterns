package ask.urfu.misc.patterns.library.userinterface;

import ask.urfu.misc.patterns.library.game.UserDecision;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public abstract class ComplexUserInterface extends UserInterface {

  protected final List<UserInterface> components;

  protected ComplexUserInterface(
      UserInterfaceImplementation implementation,
      List<UserInterface> components
  ) {
    super(implementation);
    this.components = components;
  }

  @Override
  public Optional<UserDecision> getNextDecision() {
    List<UserDecision> decisions = new ArrayList<>();
    for (var component : components) {
      component.getNextDecision().ifPresent(decisions::add);
    }
    return decisions.isEmpty()
        ? Optional.empty()
        : Optional.ofNullable(compose(decisions));
  }

  protected abstract UserDecision compose(List<UserDecision> decisions);

}
